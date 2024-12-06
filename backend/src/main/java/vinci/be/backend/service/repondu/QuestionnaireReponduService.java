package vinci.be.backend.service.repondu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.question.Question;
import vinci.be.backend.model.questionnaire.Questionnaire;
import vinci.be.backend.model.questionnairerepondu.QuestionnaireRepondu;
import vinci.be.backend.model.questionrepondu.QuestionRepondu;
import vinci.be.backend.model.reponse.Reponse;
import vinci.be.backend.model.reponserepondu.ReponseRepondu;
import vinci.be.backend.repository.QuestionnaireRepository;
import vinci.be.backend.repository.repondu.QuestionReponduRepository;
import vinci.be.backend.repository.repondu.QuestionnaireReponduRepository;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class QuestionnaireReponduService {

  private final QuestionnaireReponduRepository questionnaireReponduRepository;
  private final QuestionReponduRepository questionReponduRepository;
  private final ReponseReponduRepository reponseReponduRepository;
  private final QuestionnaireRepository questionnaireRepository;

  public QuestionnaireReponduService(QuestionnaireReponduRepository questionnaireReponduRepository,
      QuestionReponduRepository questionReponduRepository,
      ReponseReponduRepository reponseReponduRepository,
      QuestionnaireRepository questionnaireRepository) {
    this.questionnaireReponduRepository = questionnaireReponduRepository;
    this.questionReponduRepository = questionReponduRepository;
    this.reponseReponduRepository = reponseReponduRepository;
    this.questionnaireRepository = questionnaireRepository;
  }


  public QuestionnaireRepondu createOneESG(String idClient) {
    // Récupération du template
    Questionnaire template = questionnaireRepository.findByName("ESG");

    if (template == null) {
      return null;
    }

    // Création du questionnaire pour le client
    QuestionnaireRepondu questionnaireRepondu = initializeQuestionnaireRepondu(template.getId(), idClient);
    questionnaireRepondu = questionnaireReponduRepository.save(questionnaireRepondu);

    // Création des questions et réponses associées
    QuestionnaireRepondu finalQuestionnaireRepondu = questionnaireRepondu;
    List<QuestionRepondu> questionsRepondues = template.getQuestions().stream()
        .map(question -> createQuestionRepondu(question, finalQuestionnaireRepondu))
        .toList();

    questionnaireRepondu.setQuestionsRepondues(questionsRepondues);
    questionnaireReponduRepository.save(questionnaireRepondu);

    return questionnaireRepondu;
  }

  private QuestionnaireRepondu initializeQuestionnaireRepondu(String questionnaireId, String idClient) {
    QuestionnaireRepondu questionnaireRepondu = new QuestionnaireRepondu();
    questionnaireRepondu.setIdQuestionnaire(questionnaireId);
    questionnaireRepondu.setIdClient(idClient);
    questionnaireRepondu.setPourcentageQuestionRepondu(0);
    questionnaireRepondu.setEstValide(false);
    questionnaireRepondu.setEstTermine(false);
    questionnaireRepondu.setDateDerniereValidation(LocalDate.now());
    questionnaireRepondu.setNombreDeQuestionRepondu(0);
    questionnaireRepondu.setScore(0.0);
    return questionnaireRepondu;
  }

  private QuestionRepondu createQuestionRepondu(Question question, QuestionnaireRepondu questionnaireRepondu) {
    QuestionRepondu questionRepondu = new QuestionRepondu();
    questionRepondu.setReponseRepondus(new ArrayList<>());
    questionRepondu.setNombrePointObtenu(0.0);
    questionRepondu.setCommentaire("");
    questionRepondu.setIdQuestionnaireRepondu(questionnaireRepondu.getId());
    questionRepondu = questionReponduRepository.save(questionRepondu);

    QuestionRepondu finalQuestionRepondu = questionRepondu;
    List<ReponseRepondu> reponsesRepondues = question.getReponses().stream()
        .map(reponse -> createReponseRepondu(reponse, finalQuestionRepondu))
        .toList();

    questionRepondu.setReponseRepondus(reponsesRepondues);
    return questionReponduRepository.save(questionRepondu);
  }

  private ReponseRepondu createReponseRepondu(Reponse reponse, QuestionRepondu questionRepondu) {
    ReponseRepondu reponseRepondu = new ReponseRepondu();
    reponseRepondu.setIdReponse(reponse.getId());
    reponseRepondu.setIdQuestionRepondu(questionRepondu.getId());
    reponseRepondu.setEstEngage(false);
    return reponseReponduRepository.save(reponseRepondu);
  }


  public QuestionnaireRepondu getQuestionnaireByIdClient(String idClient) {

    return questionnaireReponduRepository.getByIdClient(idClient);
  }
}
