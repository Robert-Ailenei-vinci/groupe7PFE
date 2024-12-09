package vinci.be.backend.service.template;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.question.Question;
import vinci.be.backend.model.question.Question.Templates;
import vinci.be.backend.model.questionnaire.Questionnaire;
import vinci.be.backend.model.reponse.Reponse;
import vinci.be.backend.repository.QuestionRepository;
import vinci.be.backend.repository.QuestionnaireRepository;
import vinci.be.backend.repository.ReponseRepository;

@Service
public class QuestionnaireService {

  private final QuestionnaireRepository questionnaireRepository;
  private final QuestionRepository questionRepository;
  private final ReponseRepository reponseRepository;

  @Autowired
  public QuestionnaireService(QuestionnaireRepository questionnaireRepository,
      QuestionRepository questionRepository, ReponseRepository reponseRepository) {
    this.questionnaireRepository = questionnaireRepository;
    this.questionRepository = questionRepository;
    this.reponseRepository = reponseRepository;
  }

  public void addInDB(){
    // reponse1
    Reponse reponse1 = new Reponse();
    reponse1.setIntitule("oui");
    reponse1.setScoreTotal(3.0);
    reponse1.setScoreEngagement(0.5);
    reponseRepository.save(reponse1);

    Reponse reponse2 = new Reponse();
    reponse2.setIntitule("non");
    reponse2.setScoreTotal(0.0);
    reponse2.setScoreEngagement(0.0);
    reponseRepository.save(reponse2);


    // question
    Question question = new Question();
    question.setIntitule("Suivez-vous la consommation d'énergie XXX ?");
    question.setReponses(List.of(reponse1,reponse2));
    question.setNbrChoixMax(2);
    question.setEstQuestionLibre(false);
    question.setNombrePointMax(2);
    question.setEnjeuxPrincipal("Energie & carbone");
    question.setEnjeuxSecondaire("gestion de l'energie");
    question.setCategorie(Question.CATEGORIE.Environment);
    question.setEstEngageForce(false);
    question.setTemplate(Templates.ALL);
    questionRepository.save(question);

    // questionnaire
    Questionnaire questionnaire = new Questionnaire();
    questionnaire.setName("ESG");
    questionnaire.setStatut("A compléter");
    questionnaire.setQuestions(List.of(question));
    questionnaireRepository.save(questionnaire);
  }

  public Questionnaire getQuestionnaireByNom(String nom) {
    return questionnaireRepository.findByName(nom);
  }
}

