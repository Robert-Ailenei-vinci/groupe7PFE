package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.template.question.Question;

public interface QuestionRepository extends MongoRepository<Question, String> {

}
