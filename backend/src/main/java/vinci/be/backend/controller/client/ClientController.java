package vinci.be.backend.controller.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.client.Client;
import vinci.be.backend.model.client.UserCredential;
import vinci.be.backend.service.client.ClientService;

@RestController
@CrossOrigin(origins = "*")
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

  @PostMapping("/clients/login")
  public ResponseEntity<Client> loginClient(@RequestBody UserCredential client) {

     if(!client.isValid())return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

    Client actualClient = clientService.login(client);

    if(actualClient == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    System.out.println(actualClient);
    return new ResponseEntity<>(actualClient, HttpStatus.OK);
  }

  @GetMapping("/clients/All")
  public ResponseEntity<Iterable<Client>> getAllClients() {
    return new ResponseEntity<>(clientService.getAllClients(), HttpStatus.OK);
  }

  @GetMapping("/clients/getOne/{id}")
  public ResponseEntity<Client> getClientById(@PathVariable String id) {

    Client client = clientService.getClientById(id);

    if(client == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    return new ResponseEntity<>(client, HttpStatus.OK);
  }
}
