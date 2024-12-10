package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.template.reponse.Reponse;

public interface ReponseRepository extends MongoRepository<Reponse, String> {

}
