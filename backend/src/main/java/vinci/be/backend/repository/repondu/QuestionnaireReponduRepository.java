package vinci.be.backend.repository.repondu;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.questionnairerepondu.QuestionnaireRepondu;

public interface QuestionnaireReponduRepository extends MongoRepository<QuestionnaireRepondu,String> {

  QuestionnaireRepondu getByIdClient(String idClient);

}
