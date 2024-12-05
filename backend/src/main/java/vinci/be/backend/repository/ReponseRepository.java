package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.questionnaire.Questionnaire;
import vinci.be.backend.model.reponse.Reponse;

public interface ReponseRepository extends MongoRepository<Reponse, String> {

}
