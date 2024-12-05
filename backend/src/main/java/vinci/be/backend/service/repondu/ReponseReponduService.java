package vinci.be.backend.service.repondu;

import org.springframework.stereotype.Service;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class ReponseReponduService {

  private final ReponseReponduRepository reponseRepository;

  public ReponseReponduService(ReponseReponduRepository reponseRepository) {
    this.reponseRepository = reponseRepository;
  }

}
