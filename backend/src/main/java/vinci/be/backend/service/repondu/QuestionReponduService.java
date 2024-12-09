package vinci.be.backend.service.repondu;

import org.springframework.stereotype.Service;
import vinci.be.backend.model.questionnairerepondu.QuestionnaireRepondu;
import vinci.be.backend.model.questionrepondu.QuestionRepondu;
import vinci.be.backend.repository.repondu.QuestionReponduRepository;
import vinci.be.backend.repository.repondu.QuestionnaireReponduRepository;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class QuestionReponduService {

  private final QuestionReponduRepository questionReponduRepository;
  private final QuestionnaireReponduRepository questionnaireReponduRepository;

  public QuestionReponduService(QuestionReponduRepository questionReponduRepository,
      QuestionnaireReponduRepository questionnaireReponduRepository) {
    this.questionReponduRepository = questionReponduRepository;
    this.questionnaireReponduRepository = questionnaireReponduRepository;
  }

  public QuestionRepondu editComment(String idQuestion, String commentaire) {
    QuestionRepondu questionRepondu = questionReponduRepository.findById(idQuestion).orElse(null);
    if (questionRepondu == null) {
      return null;
    }

    QuestionnaireRepondu questionnaireRepondu = questionnaireReponduRepository.findById(questionRepondu.getIdQuestionnaireRepondu()).orElse(null);
    if (questionnaireRepondu == null) {
      return null;
    }

    for(QuestionRepondu question : questionnaireRepondu.getQuestionsRepondues()){
      if(question.getId().equals(questionRepondu.getId())){
        question.setCommentaire(commentaire);
        questionReponduRepository.save(question);
        break;
      }
    }
    questionnaireReponduRepository.save(questionnaireRepondu);
    return questionRepondu;
  }

}
