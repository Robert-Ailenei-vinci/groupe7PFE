package vinci.be.backend.service.repondu;

import org.springframework.stereotype.Service;
import vinci.be.backend.repository.repondu.QuestionReponduRepository;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class QuestionReponduService {

  private final QuestionReponduRepository questionRepository;
  private final ReponseReponduRepository reponseRepository;

  public QuestionReponduService(QuestionReponduRepository questionRepository, ReponseReponduRepository reponseRepository) {
    this.questionRepository = questionRepository;
    this.reponseRepository = reponseRepository;
  }

}
