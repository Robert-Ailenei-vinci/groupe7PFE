package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.question.Question;
import vinci.be.backend.model.questionnaire.Questionnaire;

public interface QuestionRepository extends MongoRepository<Question, String> {

}
