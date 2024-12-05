package vinci.be.backend.service.template;

import org.springframework.stereotype.Service;
import vinci.be.backend.repository.ReponseRepository;

@Service
public class ReponseService {

  private final ReponseRepository reponseRepository;

  public ReponseService(ReponseRepository reponseRepository) {
    this.reponseRepository = reponseRepository;
  }

}
