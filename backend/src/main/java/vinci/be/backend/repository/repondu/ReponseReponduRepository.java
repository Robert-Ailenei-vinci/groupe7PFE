package vinci.be.backend.repository.repondu;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.repondu.reponserepondu.ReponseRepondu;

public interface ReponseReponduRepository extends MongoRepository<ReponseRepondu,String> {

}
