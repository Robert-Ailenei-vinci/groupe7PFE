package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.questionnaire.Questionnaire;

public interface QuestionnaireRepository extends MongoRepository<Questionnaire, String> {

}