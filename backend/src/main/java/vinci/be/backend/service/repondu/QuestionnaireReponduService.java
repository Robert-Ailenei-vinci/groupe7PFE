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
import vinci.be.backend.repository.QuestionRepository;
import vinci.be.backend.repository.QuestionnaireRepository;
import vinci.be.backend.repository.ReponseRepository;
import vinci.be.backend.repository.repondu.QuestionReponduRepository;
import vinci.be.backend.repository.repondu.QuestionnaireReponduRepository;
import vinci.be.backend.repository.repondu.ReponseReponduRepository;

@Service
public class QuestionnaireReponduService {

  private final QuestionnaireReponduRepository questionnaireReponduRepository;
  private final QuestionReponduRepository questionReponduRepository;
  private final ReponseReponduRepository reponseReponduRepository;
  private final QuestionnaireRepository questionnaireRepository;
  private final QuestionReponduRepository questionRepositoryRepondu;
  private final ReponseRepository reponseRepository;
  private final QuestionRepository questionRepository;

  public QuestionnaireReponduService(QuestionnaireReponduRepository questionnaireReponduRepository,
      QuestionReponduRepository questionReponduRepository,
      ReponseReponduRepository reponseReponduRepository,
      QuestionnaireRepository questionnaireRepository, QuestionRepository questionRepository,
      QuestionReponduRepository questionRepositoryRepondu, ReponseRepository reponseRepository
      ) {
    this.questionnaireReponduRepository = questionnaireReponduRepository;
    this.questionReponduRepository = questionReponduRepository;
    this.reponseReponduRepository = reponseReponduRepository;
    this.questionnaireRepository = questionnaireRepository;
    this.questionRepositoryRepondu = questionRepositoryRepondu;
    this.reponseRepository = reponseRepository;
    this.questionRepository = questionRepository;
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
    questionRepondu.setIntitule(question.getIntitule());
    questionRepondu.setEnjeuxPrincipal(question.getEnjeuxPrincipal());
    questionRepondu.setEnjeuxSecondaire(question.getEnjeuxSecondaire());
    questionRepondu.setIdQuestion(question.getId());
    questionRepondu.setEstEngageForce(question.isEstEngageForce());
    questionRepondu.setTemplate(question.getTemplate());
    questionRepondu.setCategorie(question.getCategorie());
    questionRepondu.setQuestionDejaSelectionne(false);
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
    reponseRepondu.setIntitule(reponse.getIntitule());
    reponseRepondu.setSelectionne(false);
    return reponseReponduRepository.save(reponseRepondu);
  }


  public Iterable<QuestionnaireRepondu> getQuestionnaireByIdClient(String idClient) {

    return questionnaireReponduRepository.getAllByIdClient(idClient);
  }

  public QuestionnaireRepondu validateQuestionnaire(String idQuestionnaire) {
    QuestionnaireRepondu questionnaire = questionnaireReponduRepository.findById(idQuestionnaire).orElse(null);

    if (questionnaire == null) {
      return null;
    }


    questionnaire.setEstValide(true);
    questionnaire.setDateDerniereValidation(LocalDate.now());
     questionnaireReponduRepository.save(questionnaire);
     return calculeScore(questionnaire.getId());
  }

  public QuestionnaireRepondu finishQuestionnaire(String idQuestionnaire) {
    QuestionnaireRepondu questionnaire = questionnaireReponduRepository.findById(idQuestionnaire).orElse(null);

    if (questionnaire == null) {
      return null;
    }


    questionnaire.setEstTermine(true);
    questionnaire.setDateDerniereValidation(LocalDate.now());
    questionnaireReponduRepository.save(questionnaire);
    return calculeScore(questionnaire.getId());
  }

  public QuestionnaireRepondu getQuestionnaireById(String idQuestionnaire) {
    return questionnaireReponduRepository.findById(idQuestionnaire).orElse(null);
  }

  public QuestionnaireRepondu calculeScore(String idQuestionnaireRepondu){
    System.out.println("l'id est : "+idQuestionnaireRepondu);
    QuestionnaireRepondu questionnaireRepondu = questionnaireReponduRepository.findById(idQuestionnaireRepondu).orElse(null);
    // modification du score du questionnaire dans la db
    if (questionnaireRepondu == null) {
      System.out.println("questionnaireRepondu null");
      return null;
    }

    // récupération des question répondues
    Iterable<QuestionRepondu> questionRepondus = questionRepositoryRepondu.findAllByIdQuestionnaireRepondu(questionnaireRepondu.getId());

    for (QuestionRepondu questionRepondu : questionRepondus) {
      System.out.println("la questionRepondu : "+questionRepondu.toString());
    }

    for (QuestionRepondu questionRepondu : questionRepondus) {
      for (ReponseRepondu reponseRepondu : questionRepondu.getReponseRepondus()) {
        System.out.println("la reponseRepondu : "+reponseRepondu.toString());
      }
    }

    // calcul du score
    for(QuestionRepondu questionRepondu : questionRepondus){
      double score = 0;
      Question question = questionRepository.findById(questionRepondu.getIdQuestion()).orElse(null);
      if (question == null) {
        System.out.println("question null");
        return null;
      }

      for(ReponseRepondu reponseRepondu : questionRepondu.getReponseRepondus()){
        if(reponseRepondu.isSelectionne()){
          Reponse reponse = reponseRepository.findById(reponseRepondu.getIdReponse()).orElse(null);

          if(reponse == null){
            System.out.println("reponse null");
            return null;
          }

          // rajout du score de l'engagement
          if(reponseRepondu.isEstEngage()){
            score += reponse.getScoreEngagement();
          }
          // calcule du score total
          score += reponse.getScoreTotal();

          if (score > question.getNombrePointMax()) {
            score = question.getNombrePointMax();
          }

        }
      }
      // enregistrement en db
      questionRepondu.setNombrePointObtenu(score);
      questionRepositoryRepondu.save(questionRepondu);
      questionnaireRepondu.setScore(score);
      questionnaireReponduRepository.save(questionnaireRepondu);
    }
    return questionnaireRepondu;
  }

}
