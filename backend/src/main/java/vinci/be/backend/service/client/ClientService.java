package vinci.be.backend.service.client;

import org.springframework.stereotype.Service;
import vinci.be.backend.repository.ClientRepository;

@Service
public class ClientService {

  private final ClientRepository clientRepository;

  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

}
