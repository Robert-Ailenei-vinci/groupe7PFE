package vinci.be.backend.repository.repondu;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.questionrepondu.QuestionRepondu;

public interface QuestionReponduRepository extends MongoRepository<QuestionRepondu,String> {

  public Iterable<QuestionRepondu> findAllByIdByIdQuestionnaireRepondu(String idQuestionnaire);

}
