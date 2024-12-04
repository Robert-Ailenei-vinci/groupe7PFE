package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    // Méthodes de requête personnalisées si nécessaire
}
