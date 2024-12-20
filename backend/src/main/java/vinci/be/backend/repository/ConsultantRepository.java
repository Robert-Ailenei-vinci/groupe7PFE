package vinci.be.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vinci.be.backend.model.user.consultant.Consultant;

public interface ConsultantRepository extends MongoRepository<Consultant,String> {

  Consultant findByEmail(String email);
}
