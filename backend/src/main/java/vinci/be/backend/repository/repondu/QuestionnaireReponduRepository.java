package vinci.be.backend.repository.repondu;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.repondu.questionnairerepondu.QuestionnaireRepondu;

public interface QuestionnaireReponduRepository extends MongoRepository<QuestionnaireRepondu,String> {

  Iterable<QuestionnaireRepondu> getAllByIdClient(String idClient);

  QuestionnaireRepondu findByIdAndIdClient(String id, String idClient);
}
