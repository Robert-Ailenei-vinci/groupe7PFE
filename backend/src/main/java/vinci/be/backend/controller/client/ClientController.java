package vinci.be.backend.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.client.Client;
import vinci.be.backend.service.client.ClientService;

@RestController
public class ClientController {

  private final ClientService clientService;

  public ClientController(ClientService clientService) {
    this.clientService = clientService;
  }

  @PostMapping("/clients/register")
  public ResponseEntity<Client> registerClient(@RequestBody Client client) {

    if(client.invalid())return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

    if(clientService.saveClient(client) == null) return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

    return new ResponseEntity<>(client, HttpStatus.CREATED);
  }
}
