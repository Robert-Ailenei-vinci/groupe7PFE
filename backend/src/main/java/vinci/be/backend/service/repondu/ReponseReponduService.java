package vinci.be.backend.service.repondu;

import org.springframework.stereotype.Service;
import vinci.be.backend.model.repondu.questionnairerepondu.QuestionnaireRepondu;
import vinci.be.backend.model.repondu.questionrepondu.QuestionRepondu;
import vinci.be.backend.model.repondu.reponserepondu.ReponseRepondu;
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

  public ReponseRepondu selectReponse(String id, boolean selectionne, boolean isEditEngagement) {
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

            System.out.println("isEditEngagement dans le if"+ isEditEngagement);
            reponse.setEstEngage(isEditEngagement);
            reponseRepondu.setEstEngage(reponse.isEstEngage());
            System.out.println("isEditEngagement dans le else"+ isEditEngagement);
            reponse.setSelectionne(selectionne);
            reponseRepondu.setSelectionne(reponse.isSelectionne());

          if (!questionRepondu.isQuestionDejaSelectionne() && selectionne && !question.getCommentaire()
              .isEmpty()) {
            questionnaireRepondu.setNombreDeQuestionRepondu(questionnaireRepondu.getNombreDeQuestionRepondu() + 1);
            questionRepondu.setQuestionDejaSelectionne(true);
          }
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
