package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.template.questionnaire.Questionnaire;

public interface QuestionnaireRepository extends MongoRepository<Questionnaire, String> {

  Questionnaire findByName(String nom);

}
