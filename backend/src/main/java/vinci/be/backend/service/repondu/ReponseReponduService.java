package vinci.be.backend.service.repondu;

import org.springframework.stereotype.Service;
import vinci.be.backend.model.reponserepondu.ReponseRepondu;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class ReponseReponduService {

  private final ReponseReponduRepository reponseRepository;

  public ReponseReponduService(ReponseReponduRepository reponseRepository) {
    this.reponseRepository = reponseRepository;
  }

  public ReponseRepondu selectReponse(String id) {
    ReponseRepondu reponseRepondu = reponseRepository.findById(id).orElse(null);

    if (reponseRepondu == null) {
      return null;
    }

    reponseRepondu.setEstSelectionne(!reponseRepondu.isEstSelectionne());
    reponseRepository.save(reponseRepondu);

    return reponseRepondu;
  }

}
