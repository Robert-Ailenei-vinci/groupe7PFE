package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.user.client.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

  Client findByEmail(String email);
}
