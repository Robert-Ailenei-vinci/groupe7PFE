package vinci.be.backend.service.repondu;

import org.springframework.stereotype.Service;
import vinci.be.backend.repository.repondu.QuestionReponduRepository;
import vinci.be.backend.repository.repondu.QuestionnaireReponduRepository;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class QuestionnaireReponduService {

  private final QuestionnaireReponduRepository questionnaireRepository;
  private final QuestionReponduRepository questionRepository;
  private final ReponseReponduRepository reponseRepository;

  public QuestionnaireReponduService(QuestionnaireReponduRepository questionnaireRepository, QuestionReponduRepository questionRepository, ReponseReponduRepository reponseRepository) {
    this.questionnaireRepository = questionnaireRepository;
    this.questionRepository = questionRepository;
    this.reponseRepository = reponseRepository;
  }

}
