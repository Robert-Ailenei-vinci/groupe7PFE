package vinci.be.backend.service.template;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.template.question.Question;
import vinci.be.backend.model.template.question.Question.Templates;
import vinci.be.backend.model.template.questionnaire.Questionnaire;
import vinci.be.backend.model.template.reponse.Reponse;
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
    // question 1
    Reponse reponse1 = new Reponse();
    reponse1.setIntitule("oui");
    reponse1.setScoreTotal(2.0);
    reponse1.setScoreEngagement(0.5);
    reponseRepository.save(reponse1);

    Reponse reponse2 = new Reponse();
    reponse2.setIntitule("non");
    reponse2.setScoreTotal(0.0);
    reponse2.setScoreEngagement(0.0);
    reponseRepository.save(reponse2);

    // question 2
    Reponse reponse3 = new Reponse();
    reponse3.setIntitule("");
    reponse3.setScoreTotal(0.0);
    reponse3.setScoreEngagement(0.0);
    reponseRepository.save(reponse3);

    // question 3
    Reponse reponse4 = new Reponse();
    reponse4.setIntitule("oui");
    reponse4.setScoreTotal(1.0);
    reponse4.setScoreEngagement(0.25);
    reponseRepository.save(reponse4);

    Reponse reponse5 = new Reponse();
    reponse5.setIntitule("non");
    reponse5.setScoreTotal(0.0);
    reponse5.setScoreEngagement(0.0);
    reponseRepository.save(reponse5);

    Reponse reponse6 = new Reponse();
    reponse6.setIntitule("je ne sais pas");
    reponse6.setScoreTotal(0.0);
    reponse6.setScoreEngagement(0.0);
    reponseRepository.save(reponse6);

    Reponse reponse7 = new Reponse();
    reponse7.setIntitule("NA");
    reponse7.setScoreTotal(0.5);
    reponse7.setScoreEngagement(0.0);
    reponseRepository.save(reponse7);

    // question 4
    Reponse reponse8 = new Reponse();
    reponse8.setIntitule("oui");
    reponse8.setScoreTotal(1.0);
    reponse8.setScoreEngagement(0.25);
    reponseRepository.save(reponse8);

    Reponse reponse9 = new Reponse();
    reponse9.setIntitule("non");
    reponse9.setScoreTotal(0.0);
    reponse9.setScoreEngagement(0.0);
    reponseRepository.save(reponse9);

    Reponse reponse10 = new Reponse();
    reponse10.setIntitule("je ne sais pas");
    reponse10.setScoreTotal(0.0);
    reponse10.setScoreEngagement(0.0);
    reponseRepository.save(reponse10);

    Reponse reponse11 = new Reponse();
    reponse11.setIntitule("NA");
    reponse11.setScoreTotal(0.5);
    reponse11.setScoreEngagement(0.0);
    reponseRepository.save(reponse11);

    // qestion 5
    Reponse reponse12 = new Reponse();
    reponse12.setIntitule("Nous avons investi dans des équipements de bureau économes en énergie, notamment des ordinateurs, des imprimantes, etc.");
    reponse12.setScoreTotal(1);
    reponse12.setScoreEngagement(0.25);
    reponseRepository.save(reponse12);

    Reponse reponse13 = new Reponse();
    reponse13.setIntitule("Nous avons remplacé les ampoules traditionnelles par des ampoules LED à haut rendement énergétique afin de réduire la consommation d'électricité.");
    reponse13.setScoreTotal(1);
    reponse13.setScoreEngagement(0.25);
    reponseRepository.save(reponse13);

    Reponse reponse14 = new Reponse();
    reponse14.setIntitule("Nous avons installé des thermostats intelligents pour optimiser les systèmes de chauffage, de ventilation et de climatisation (CVC) en vue d'une meilleure efficacité énergétique.");
    reponse14.setScoreTotal(1);
    reponse14.setScoreEngagement(0.25);
    reponseRepository.save(reponse14);

    Reponse reponse15 = new Reponse();
    reponse15.setIntitule("Nous réalisons régulièrement des audits énergétiques afin d'identifier les points à améliorer et d'optimiser notre consommation d'énergie.");
    reponse15.setScoreTotal(1);
    reponse15.setScoreEngagement(0.25);
    reponseRepository.save(reponse15);

    Reponse reponse16 = new Reponse();
    reponse16.setIntitule("Nous avons installé des détecteurs de présence pour l'éclairage et les systèmes CVC afin d'ajuster automatiquement la consommation en fonction des niveaux d'occupation.");
    reponse16.setScoreTotal(1);
    reponse16.setScoreEngagement(0.25);
    reponseRepository.save(reponse16);

    Reponse reponse17 = new Reponse();
    reponse17.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse17.setScoreTotal(0);
    reponse17.setScoreEngagement(0);
    reponseRepository.save(reponse17);

    Reponse reponse18 = new Reponse();
    reponse18.setIntitule("Aucune de ces réponses.");
    reponse18.setScoreTotal(0);
    reponse18.setScoreEngagement(0);
    reponseRepository.save(reponse18);

    Reponse reponse19 = new Reponse();
    reponse19.setIntitule("N/A");
    reponse19.setScoreTotal(2.5);
    reponse19.setScoreEngagement(0);
    reponseRepository.save(reponse19);

    // questionnaire 6
    Reponse reponse20 = new Reponse();
    reponse20.setIntitule("oui");
    reponse20.setScoreTotal(1.0);
    reponse20.setScoreEngagement(0.25);
    reponseRepository.save(reponse20);

    Reponse reponse21 = new Reponse();
    reponse21.setIntitule("non");
    reponse21.setScoreTotal(0.0);
    reponse21.setScoreEngagement(0.0);
    reponseRepository.save(reponse21);

    Reponse reponse22 = new Reponse();
    reponse22.setIntitule("N/A - Nous n'avons pas de travailleur·euses.");
    reponse22.setScoreTotal(0.5);
    reponse22.setScoreEngagement(0.0);
    reponseRepository.save(reponse22);

    // question 7
    Reponse reponse23 = new Reponse();
    reponse23.setIntitule("Oui, pour les Scopes 1 & 2 (les émissions de gaz à effet de serre directes et indirectes liées à notre consommation d'énergie).");
    reponse23.setScoreTotal(0.5);
    reponse23.setScoreEngagement(0.13);
    reponseRepository.save(reponse23);

    Reponse reponse24 = new Reponse();
    reponse24.setIntitule("Oui, pour le Scope 3 (toutes les émissions de GES indirectes liées à nos activités).");
    reponse24.setScoreTotal(1.5);
    reponse24.setScoreEngagement(0.38);
    reponseRepository.save(reponse24);

    Reponse reponse25 = new Reponse();
    reponse25.setIntitule("non");
    reponse25.setScoreTotal(0.0);
    reponse25.setScoreEngagement(0.0);
    reponseRepository.save(reponse25);

    //question 8
    Reponse reponse26 = new Reponse();
    reponse26.setIntitule("");
    reponse26.setScoreTotal(0.0);
    reponse26.setScoreEngagement(0.0);
    reponseRepository.save(reponse26);

    // question 9
    Reponse reponse27 = new Reponse();
    reponse27.setIntitule("");
    reponse27.setScoreTotal(0.0);
    reponse27.setScoreEngagement(0.0);
    reponseRepository.save(reponse27);

    // question 10
    Reponse reponse28 = new Reponse();
    reponse28.setIntitule("");
    reponse28.setScoreTotal(0.0);
    reponse28.setScoreEngagement(0.0);
    reponseRepository.save(reponse28);

    // question 11
    Reponse reponse29 = new Reponse();
    reponse29.setIntitule("Nous n'avons pas réalisé de rapport d'empreinte carbone.");
    reponse29.setScoreTotal(0.0);
    reponse29.setScoreEngagement(1.26);
    reponseRepository.save(reponse29);

    Reponse reponse30 = new Reponse();
    reponse30.setIntitule("Notre rapport d'empreinte carbone inclut une déclaration claire de notre engagement en faveur de la réduction de notre empreinte carbone.");
    reponse30.setScoreTotal(0.42);
    reponse30.setScoreEngagement(0.11);
    reponseRepository.save(reponse30);

    Reponse reponse31 = new Reponse();
    reponse31.setIntitule("Notre rapport d'empreinte carbone présente une une ventilation des émissions de carbone par source ou catégorie.");
    reponse31.setScoreTotal(0.42);
    reponse31.setScoreEngagement(0.11);
    reponseRepository.save(reponse31);

    Reponse reponse32 = new Reponse();
    reponse32.setIntitule("Notre rapport d'empreinte carbone décrit de manière transparente la méthodologie utilisée, le champ d'application, le processus de collecte de données, les hypothèses, les incertitudes et les limites du calcul.");
    reponse32.setScoreTotal(0.42);
    reponse32.setScoreEngagement(0.11);
    reponseRepository.save(reponse32);

    Reponse reponse33 = new Reponse();
    reponse33.setIntitule("Notre rapport d'empreinte carbone présente nos objectifs de réduction et décrit les mesures prises pour les atteindre.");
    reponse33.setScoreTotal(0.42);
    reponse33.setScoreEngagement(0.11);
    reponseRepository.save(reponse33);

    Reponse reponse34 = new Reponse();
    reponse34.setIntitule("Notre rapport d'empreinte carbone est conforme à la méthodologie Bilan Carbone® et/ou au GHG Protocol (il a été réalisé via un expert et/ou une plateforme agréé).");
    reponse34.setScoreTotal(0.42);
    reponse34.setScoreEngagement(0.11);
    reponseRepository.save(reponse34);

    Reponse reponse35 = new Reponse();
    reponse35.setIntitule("Nous partageons publiquement notre rapport d'empreinte carbone complet (en ce compris tous les points cochés ci-dessus).");
    reponse35.setScoreTotal(0.42);
    reponse35.setScoreEngagement(0);
    reponseRepository.save(reponse35);

    Reponse reponse36 = new Reponse();
    reponse36.setIntitule("N/A");
    reponse36.setScoreTotal(1.26);
    reponse36.setScoreEngagement(0);
    reponseRepository.save(reponse36);


    // question
    Question question1 = new Question();
    question1.setIntitule("Suivez-vous la consommation d'énergie XXX ?");
    question1.setReponses(List.of(reponse1,reponse2));
    question1.setNbrChoixMax(1);
    question1.setEstQuestionLibre(false);
    question1.setNombrePointMax(3);
    question1.setEnjeuxPrincipal("Energie & carbone");
    question1.setEnjeuxSecondaire("gestion de l'energie");
    question1.setCategorie(Question.CATEGORIE.Environment);
    question1.setEstEngageForce(false);
    question1.setTemplate(Templates.ALL);
    questionRepository.save(question1);

    Question question2 = new Question();
    question2.setIntitule("Si vous la suivez, veuillez indiquer votre consommation d'énergie totale des 12 derniers mois (en kWh)");
    question2.setReponses(List.of(reponse3));
    question2.setNbrChoixMax(1);
    question2.setEstQuestionLibre(true);
    question2.setNombrePointMax(0);
    question2.setEnjeuxPrincipal("Energie & carbone");
    question2.setEnjeuxSecondaire("gestion de l'energie");
    question2.setCategorie(Question.CATEGORIE.Environment);
    question2.setEstEngageForce(false);
    question2.setTemplate(Templates.ALL);
    questionRepository.save(question2);

    Question question3 = new Question();
    question3.setIntitule("Avez-vous un contrat vert avec votre fournisseur d'énergie ?");
    question3.setReponses(List.of(reponse4,reponse5,reponse6,reponse7));
    question3.setNbrChoixMax(1);
    question3.setEstQuestionLibre(false);
    question3.setNombrePointMax(0.5);
    question3.setEnjeuxPrincipal("Energie & carbone");
    question3.setEnjeuxSecondaire("gestion de l'energie");
    question3.setCategorie(Question.CATEGORIE.Environment);
    question3.setEstEngageForce(false);
    question3.setTemplate(Templates.OWNEDFACILITY);
    questionRepository.save(question3);

    Question question4 = new Question();
    question4.setIntitule("Produisez-vous de l'électricité sur site (par exemple, avec des panneaux solaires) ?");
    question4.setReponses(List.of(reponse8,reponse9,reponse10,reponse11));
    question4.setNbrChoixMax(1);
    question4.setEstQuestionLibre(false);
    question4.setNombrePointMax(0.5);
    question4.setEnjeuxPrincipal("Energie & carbone");
    question4.setEnjeuxSecondaire("gestion de l'energie");
    question4.setCategorie(Question.CATEGORIE.Environment);
    question4.setEstEngageForce(false);
    question4.setTemplate(Templates.OWNEDFACILITY);
    questionRepository.save(question4);

    Question question5 = new Question();
    question5.setIntitule("Qu'avez-vous mis en place pour limiter votre consommation d'énergie ? Veuillez sélectionner toutes les réponses applicables.");
    question5.setReponses(List.of(reponse12,reponse13,reponse14,reponse15,reponse16,reponse17,reponse18,reponse19));
    question5.setNbrChoixMax(6);
    question5.setEstQuestionLibre(false);
    question5.setNombrePointMax(2.5);
    question5.setEnjeuxPrincipal("Energie & carbone");
    question5.setEnjeuxSecondaire("gestion de l'energie");
    question5.setCategorie(Question.CATEGORIE.Environment);
    question5.setEstEngageForce(false);
    question5.setTemplate(Templates.OWNEDFACILITY);
    questionRepository.save(question5);

    Question question6 = new Question();
    question6.setIntitule("Avez-vous mis en place des initiatives pour sensibiliser vos travailleur·euses sur les bonnes pratiques en matière de consommation d'énergie ?");
    question6.setReponses(List.of(reponse20,reponse21,reponse22));
    question6.setNbrChoixMax(1);
    question6.setEstQuestionLibre(false);
    question6.setNombrePointMax(0.5);
    question6.setEnjeuxPrincipal("Energie & carbone");
    question6.setEnjeuxSecondaire("gestion de l'energie");
    question6.setCategorie(Question.CATEGORIE.Environment);
    question6.setEstEngageForce(false);
    question6.setTemplate(Templates.WORKERS);
    questionRepository.save(question6);

    Question question7 = new Question();
    question7.setIntitule("Avez-vous calculé l'empreinte carbone des activités de XXX ?");
    question7.setReponses(List.of(reponse23,reponse24,reponse25));
    question7.setNbrChoixMax(2);
    question7.setEstQuestionLibre(false);
    question7.setNombrePointMax(1);
    question7.setEnjeuxPrincipal("Energie & carbone");
    question7.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question7.setCategorie(Question.CATEGORIE.Environment);
    question7.setEstEngageForce(false);
    question7.setTemplate(Templates.ALL);
    questionRepository.save(question7);

    Question question8 = new Question();
    question8.setIntitule("Si vous la calculez, veuillez indiquer votre empreinte carbone de Scope 1 (en tonnes de CO2 équivalent) :");
    question8.setReponses(List.of(reponse26));
    question8.setNbrChoixMax(1);
    question8.setEstQuestionLibre(true);
    question8.setNombrePointMax(0);
    question8.setEnjeuxPrincipal("Energie & carbone");
    question8.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question8.setCategorie(Question.CATEGORIE.Environment);
    question8.setEstEngageForce(false);
    question8.setTemplate(Templates.ALL);
    questionRepository.save(question8);

    Question question9 = new Question();
    question9.setIntitule("Si vous la calculez, veuillez indiquer votre empreinte carbone de Scope 2 (en tonnes de CO2 équivalent) :");
    question9.setReponses(List.of(reponse27));
    question9.setNbrChoixMax(1);
    question9.setEstQuestionLibre(true);
    question9.setNombrePointMax(0);
    question9.setEnjeuxPrincipal("Energie & carbone");
    question9.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question9.setCategorie(Question.CATEGORIE.Environment);
    question9.setEstEngageForce(false);
    question9.setTemplate(Templates.ALL);
    questionRepository.save(question9);

    Question question10 = new Question();
    question10.setIntitule("Si vous la calculez, veuillez indiquer votre empreinte carbone de Scope 3 (en tonnes de CO2 équivalent) :");
    question10.setReponses(List.of(reponse28));
    question10.setNbrChoixMax(1);
    question10.setEstQuestionLibre(true);
    question10.setNombrePointMax(0);
    question10.setEnjeuxPrincipal("Energie & carbone");
    question10.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question10.setCategorie(Question.CATEGORIE.Environment);
    question10.setEstEngageForce(false);
    question10.setTemplate(Templates.ALL);
    questionRepository.save(question10);

    Question question11 = new Question();
    question11.setIntitule("Si vous la calculez, veuillez indiquer votre empreinte carbone de Scope 3 (en tonnes de CO2 équivalent) :");
    question11.setReponses(List.of(reponse29,reponse30,reponse31,reponse32,reponse33,reponse34,reponse35,reponse36));
    question11.setNbrChoixMax(7);
    question11.setEstQuestionLibre(false);
    question11.setNombrePointMax(1.26);
    question11.setEnjeuxPrincipal("Energie & carbone");
    question11.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question11.setCategorie(Question.CATEGORIE.Environment);
    question11.setEstEngageForce(false);
    question11.setTemplate(Templates.ALL);
    questionRepository.save(question11);


    // questionnaire
    Questionnaire questionnaire = new Questionnaire();
    questionnaire.setName("ESG");
    questionnaire.setStatut("A compléter");
    questionnaire.setQuestions(List.of(question1,question2,question3));
    questionnaireRepository.save(questionnaire);
  }

  public Questionnaire getQuestionnaireByNom(String nom) {
    return questionnaireRepository.findByName(nom);
  }
}

