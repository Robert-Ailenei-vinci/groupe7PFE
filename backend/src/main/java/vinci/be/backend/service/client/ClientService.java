package vinci.be.backend.service.client;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.client.Client;
import vinci.be.backend.repository.ClientRepository;

@Service
public class ClientService {

  private final ClientRepository clientRepository;
  private final PasswordEncoder passwordEncoder; // Utilise l'interface PasswordEncoder

  public ClientService(ClientRepository clientRepository, PasswordEncoder passwordEncoder) {
    this.clientRepository = clientRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public Client saveClient(Client client) {

    if(clientRepository.findByEmail(client.getEmail()) != null) {
      return null;
    }

    String hashedPassword = passwordEncoder.encode(client.getMdp());
    client.setMdp(hashedPassword);

    return clientRepository.save(client);
  }
}
