package vinci.be.backend.service.repondu;

import org.springframework.stereotype.Service;
import vinci.be.backend.model.questionnairerepondu.QuestionnaireRepondu;
import vinci.be.backend.model.questionrepondu.QuestionRepondu;
import vinci.be.backend.model.reponserepondu.ReponseRepondu;
import vinci.be.backend.repository.repondu.QuestionReponduRepository;
import vinci.be.backend.repository.repondu.QuestionnaireReponduRepository;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class ReponseReponduService {

  private final ReponseReponduRepository reponseRepository;
  private final QuestionReponduRepository questionReponduRepository;
  private final QuestionnaireReponduRepository questionnaireReponduRepository;

  public ReponseReponduService(ReponseReponduRepository reponseRepository,
      QuestionReponduRepository questionReponduRepository,
      QuestionnaireReponduRepository questionnaireReponduRepository) {
    this.reponseRepository = reponseRepository;
    this.questionReponduRepository = questionReponduRepository;
    this.questionnaireReponduRepository = questionnaireReponduRepository;
  }

  public ReponseRepondu selectReponse(String id) {
    ReponseRepondu reponseRepondu = reponseRepository.findById(id).orElse(null);

    if (reponseRepondu == null) {
      return null;
    }

    QuestionRepondu questionRepondu = questionReponduRepository.findById(reponseRepondu.getIdQuestionRepondu()).orElse(null);
    if (questionRepondu == null) {
      return null;
    }
    QuestionnaireRepondu questionnaireRepondu = questionnaireReponduRepository.findById(questionRepondu.getIdQuestionnaireRepondu()).orElse(null);
    if (questionnaireRepondu == null) {
      return null;
    }

    for (QuestionRepondu question : questionnaireRepondu.getQuestionsRepondues()) {
      for (ReponseRepondu reponse : question.getReponseRepondus()) {
        if (reponse.getId().equals(reponseRepondu.getId())) {
          reponse.setSelectionne(!reponseRepondu.isSelectionne());
          reponseRepondu.setSelectionne(reponse.isSelectionne());
          reponseRepository.save(reponseRepondu);
          break;
        }
      }
      questionRepondu.setReponseRepondus(question.getReponseRepondus());
      questionnaireRepondu.setQuestionsRepondues(questionnaireRepondu.getQuestionsRepondues());
      questionReponduRepository.save(questionRepondu);
    }

    questionnaireReponduRepository.save(questionnaireRepondu);
    return reponseRepondu;
  }

}
