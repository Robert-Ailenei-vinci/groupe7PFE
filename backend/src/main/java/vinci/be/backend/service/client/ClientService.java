package vinci.be.backend.service.client;

import java.util.ArrayList;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.user.client.Client;
import vinci.be.backend.model.user.client.UserCredential;
import vinci.be.backend.model.template.question.Question.Templates;
import vinci.be.backend.repository.ClientRepository;

@Service
public class ClientService {

  private final ClientRepository clientRepository;
  private final PasswordEncoder passwordEncoder;

  public ClientService(ClientRepository clientRepository, PasswordEncoder passwordEncoder) {
    this.clientRepository = clientRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public Client saveClient(Client client) {

    if(clientRepository.findByEmail(client.getEmail()) != null) {
      return null;
    }

    client.setTemplates(new ArrayList<>());

    if (client.getNbTravailleur() > 1){
      client.getTemplates().add(Templates.WORKERS);
    }

    if (client.isVendProduit()){
      client.getTemplates().add(Templates.PRODUITS);
    }
    if (client.isEstProprietaire()){
      client.getTemplates().add(Templates.OWNEDFACILITY);
    }
    client.getTemplates().add(Templates.ALL);
    client.getTemplates().add(Templates.FACILITY);

    String hashedPassword = passwordEncoder.encode(client.getPassword());
    client.setPassword(hashedPassword);

    return clientRepository.save(client);
  }
  public Client login(UserCredential userCredential) {

    Client actualClient = clientRepository.findByEmail(userCredential.getEmail());

    if (actualClient == null ) {
      return null;
    }
    if (!passwordEncoder.matches(userCredential.getPassword(), actualClient.getPassword())) {
      return null;
    }
      return actualClient;
  }


  public Iterable<Client> getAllClients() {
    return clientRepository.findAll();
  }

  public Client getClientById(String id) {
    return clientRepository.findById(id).orElse(null);
  }
}
