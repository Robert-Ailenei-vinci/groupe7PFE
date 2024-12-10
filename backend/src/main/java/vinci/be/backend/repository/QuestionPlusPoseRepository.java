package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.questionPlusPose.QuestionPlusPose;

public interface QuestionPlusPoseRepository extends MongoRepository<QuestionPlusPose,String> {

}
