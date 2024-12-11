package vinci.be.backend.service.template;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.template.question.Question;
import vinci.be.backend.model.template.question.Question.CATEGORIE;
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
    reponse29.setScoreEngagement(0);
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

    // question 12
    Reponse reponse37 = new Reponse();
    reponse37.setIntitule("Nous incitons nos travailleur·euses à adopter des modes de transport plus durables pour se rendre au travail (marche, vélo, transports en commun, covoiturage, etc.) en mettant en place des mesures telles que l'installation de douches, des incitations financières, etc.");
    reponse37.setScoreTotal(0.42);
    reponse37.setScoreEngagement(0.11);
    reponseRepository.save(reponse37);

    Reponse reponse38 = new Reponse();
    reponse38.setIntitule("Nous choisissons en priorité des fournisseurs qui adoptent les meilleures pratiques en matière de durabilité.");
    reponse38.setScoreTotal(0.42);
    reponse38.setScoreEngagement(0.11);
    reponseRepository.save(reponse38);

    Reponse reponse39 = new Reponse();
    reponse39.setIntitule("Nous avons une politique d'achats responsables, qui formalise notre engagement à privilégier les matières premières recyclées ou renouvelables et à réduire les déchets à la source.");
    reponse39.setScoreTotal(0.42);
    reponse39.setScoreEngagement(0.11);
    reponseRepository.save(reponse39);

    Reponse reponse40 = new Reponse();
    reponse40.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse40.setScoreTotal(0);
    reponse40.setScoreEngagement(0);
    reponseRepository.save(reponse40);

    Reponse reponse40Bis = new Reponse();
    reponse40Bis.setIntitule("Aucune de ces réponses.");
    reponse40Bis.setScoreTotal(0);
    reponse40Bis.setScoreEngagement(0);
    reponseRepository.save(reponse40Bis);

    Reponse reponse41 = new Reponse();
    reponse41.setIntitule("N/A");
    reponse41.setScoreTotal(0);
    reponse41.setScoreEngagement(0.63);
    reponseRepository.save(reponse41);

    // question 13
    Reponse reponse42 = new Reponse();
    reponse42.setIntitule("oui");
    reponse42.setScoreTotal(0.42);
    reponse42.setScoreEngagement(0.11);
    reponseRepository.save(reponse42);

    Reponse reponse43 = new Reponse();
    reponse43.setIntitule("non");
    reponse43.setScoreTotal(0.0);
    reponse43.setScoreEngagement(0.11);
    reponseRepository.save(reponse43);

    Reponse reponse44 = new Reponse();
    reponse44.setIntitule("N/A");
    reponse44.setScoreTotal(0.0);
    reponse44.setScoreEngagement(0.21);
    reponseRepository.save(reponse44);

    // question 14
    Reponse reponse45 = new Reponse();
    reponse45.setIntitule("Je ne sais pas");
    reponse45.setScoreTotal(0);
    reponse45.setScoreEngagement(0);
    reponseRepository.save(reponse45);

    Reponse reponse46 = new Reponse();
    reponse46.setIntitule("<20%");
    reponse46.setScoreTotal(0);
    reponse46.setScoreEngagement(0);
    reponseRepository.save(reponse46);

    Reponse reponse47 = new Reponse();
    reponse47.setIntitule("20-39%");
    reponse47.setScoreTotal(0.21);
    reponse47.setScoreEngagement(0.05);
    reponseRepository.save(reponse47);

    Reponse reponse48 = new Reponse();
    reponse48.setIntitule("40-59%");
    reponse48.setScoreTotal(0.32);
    reponse48.setScoreEngagement(0.08);
    reponseRepository.save(reponse48);

    Reponse reponse49 = new Reponse();
    reponse49.setIntitule("60%+");
    reponse49.setScoreTotal(0.42);
    reponse49.setScoreEngagement(0.08);
    reponseRepository.save(reponse49);

    Reponse reponse50 = new Reponse();
    reponse50.setIntitule("N/A");
    reponse50.setScoreTotal(0.21);
    reponse50.setScoreEngagement(0);
    reponseRepository.save(reponse50);

    // question 15
    Reponse reponse51 = new Reponse();
    reponse51.setIntitule("Je ne sais pas");
    reponse51.setScoreTotal(0);
    reponse51.setScoreEngagement(0);
    reponseRepository.save(reponse51);

    Reponse reponse52 = new Reponse();
    reponse52.setIntitule("<10%");
    reponse52.setScoreTotal(0);
    reponse52.setScoreEngagement(0);
    reponseRepository.save(reponse52);

    Reponse reponse53 = new Reponse();
    reponse53.setIntitule("10-39%");
    reponse53.setScoreTotal(0.11);
    reponse53.setScoreEngagement(0.03);
    reponseRepository.save(reponse53);

    Reponse reponse54 = new Reponse();
    reponse54.setIntitule("40-59%");
    reponse54.setScoreTotal(0.21);
    reponse54.setScoreEngagement(0.05);
    reponseRepository.save(reponse54);

    Reponse reponse55 = new Reponse();
    reponse55.setIntitule("60-89%");
    reponse55.setScoreTotal(0.32);
    reponse55.setScoreEngagement(0.08);
    reponseRepository.save(reponse55);

    Reponse reponse56 = new Reponse();
    reponse56.setIntitule("90%+");
    reponse56.setScoreTotal(0.42);
    reponse56.setScoreEngagement(0);
    reponseRepository.save(reponse56);

    Reponse reponse57 = new Reponse();
    reponse57.setIntitule("N/A");
    reponse57.setScoreTotal(0.21);
    reponse57.setScoreEngagement(0);
    reponseRepository.save(reponse57);

    // question 16
    Reponse reponse58 = new Reponse();
    reponse58.setIntitule("oui");
    reponse58.setScoreTotal(0.42);
    reponse58.setScoreEngagement(0.11);
    reponseRepository.save(reponse58);

    Reponse reponse59 = new Reponse();
    reponse59.setIntitule("non");
    reponse59.setScoreTotal(0);
    reponse59.setScoreEngagement(0);
    reponseRepository.save(reponse59);

    Reponse reponse60 = new Reponse();
    reponse60.setIntitule("Difficile à mettre en place en raison de contraintes propres à mon secteur.");
    reponse60.setScoreTotal(0);
    reponse60.setScoreEngagement(0);
    reponseRepository.save(reponse60);

    Reponse reponse61 = new Reponse();
    reponse61.setIntitule("N/A");
    reponse61.setScoreTotal(0.21);
    reponse61.setScoreEngagement(0);
    reponseRepository.save(reponse61);

    // question 17
    Reponse reponse62 = new Reponse();
    reponse62.setIntitule("Nous intégrons des critères environnementaux dans nos contrats fournisseurs, afin de les inciter à adopter des pratiques durables.");
    reponse62.setScoreTotal(0.42);
    reponse62.setScoreEngagement(0.11);
    reponseRepository.save(reponse62);

    Reponse reponse63 = new Reponse();
    reponse63.setIntitule("Nous réalisons régulièrement des audits environnementaux afin d'évaluer les performances environnementales de nos fournisseurs.");
    reponse63.setScoreTotal(0.42);
    reponse63.setScoreEngagement(0.11);
    reponseRepository.save(reponse63);

    Reponse reponse64 = new Reponse();
    reponse64.setIntitule("Nous procédons à des audits environnementaux réguliers afin d'évaluer les performances écologiques de nos fournisseurs.");
    reponse64.setScoreTotal(0.42);
    reponse64.setScoreEngagement(0.11);
    reponseRepository.save(reponse64);

    Reponse reponse65 = new Reponse();
    reponse65.setIntitule("Nous incitons nos fournisseurs à opter pour des solutions de transport bas carbone pour la livraison des marchandises.");
    reponse65.setScoreTotal(0.42);
    reponse65.setScoreEngagement(0.11);
    reponseRepository.save(reponse65);

    Reponse reponse66 = new Reponse();
    reponse66.setIntitule("Nous entretenons un dialogue ouvert avec nos fournisseurs et encourageons le partage des meilleures pratiques en matière de durabilité.");
    reponse66.setScoreTotal(0.42);
    reponse66.setScoreEngagement(0.11);
    reponseRepository.save(reponse66);

    Reponse reponse67 = new Reponse();
    reponse67.setIntitule("Nous travaillons en étroite collaboration avec les fournisseurs dès la phase de conception afin d'intégrer notamment les principes d'éco-conception, favorisant la durabilité et la recyclabilité.");
    reponse67.setScoreTotal(0.42);
    reponse67.setScoreEngagement(0.11);
    reponseRepository.save(reponse67);

    Reponse reponse68 = new Reponse();
    reponse68.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse68.setScoreTotal(0);
    reponse68.setScoreEngagement(0);
    reponseRepository.save(reponse68);

    Reponse reponse69 = new Reponse();
    reponse69.setIntitule("Aucune de ces réponses.");
    reponse69.setScoreTotal(0);
    reponse69.setScoreEngagement(0);
    reponseRepository.save(reponse69);

    Reponse reponse70 = new Reponse();
    reponse70.setIntitule("N/A");
    reponse70.setScoreTotal(1.26);
    reponse70.setScoreEngagement(0);
    reponseRepository.save(reponse70);

    // question 18
    Reponse reponse71 = new Reponse();
    reponse71.setIntitule("oui");
    reponse71.setScoreTotal(2);
    reponse71.setScoreEngagement(0.5);
    reponseRepository.save(reponse71);

    Reponse reponse72 = new Reponse();
    reponse72.setIntitule("non");
    reponse72.setScoreTotal(0);
    reponse72.setScoreEngagement(0);
    reponseRepository.save(reponse72);

    Reponse reponse73 = new Reponse();
    reponse73.setIntitule("N/A");
    reponse73.setScoreTotal(1);
    reponse73.setScoreEngagement(0);
    reponseRepository.save(reponse73);

    // question 19
    Reponse reponse74 = new Reponse();
    reponse74.setIntitule("");
    reponse74.setScoreTotal(0);
    reponse74.setScoreEngagement(0);
    reponseRepository.save(reponse74);

    // question 20
    Reponse reponse75 = new Reponse();
    reponse75.setIntitule("Nous avons installé des appareils à faible débit et/ou économes en eau.");
    reponse75.setScoreTotal(0.89);
    reponse75.setScoreEngagement(0.22);
    reponseRepository.save(reponse75);

    Reponse reponse76 = new Reponse();
    reponse76.setIntitule("Nous avons installé des systèmes de détection des fuites.");
    reponse76.setScoreTotal(0.89);
    reponse76.setScoreEngagement(0.22);
    reponseRepository.save(reponse76);

    Reponse reponse77 = new Reponse();
    reponse77.setIntitule("Nous avons mis en place des systèmes de récupération d'eau de pluie.");
    reponse77.setScoreTotal(0.89);
    reponse77.setScoreEngagement(0.22);
    reponseRepository.save(reponse77);

    Reponse reponse78 = new Reponse();
    reponse78.setIntitule("Nous effectuons régulièrement des audits de notre consommation d'eau pour repérer les zones à forte consommation et les éventuelles inefficacités.");
    reponse78.setScoreTotal(0.89);
    reponse78.setScoreEngagement(0.22);
    reponseRepository.save(reponse78);

    Reponse reponse79 = new Reponse();
    reponse79.setIntitule("Nous avons établi des lignes directrices pour encourager une consommation responsable et rationnelle de l'eau.");
    reponse79.setScoreTotal(0.89);
    reponse79.setScoreEngagement(0.22);
    reponseRepository.save(reponse79);

    Reponse reponse80 = new Reponse();
    reponse80.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse80.setScoreTotal(0);
    reponse80.setScoreEngagement(0);
    reponseRepository.save(reponse80);

    Reponse reponse81 = new Reponse();
    reponse81.setIntitule("Aucune de ces réponses.");
    reponse81.setScoreTotal(0);
    reponse81.setScoreEngagement(0);
    reponseRepository.save(reponse81);

    Reponse reponse82 = new Reponse();
    reponse82.setIntitule("N/A");
    reponse82.setScoreTotal(2.22);
    reponse82.setScoreEngagement(0);
    reponseRepository.save(reponse82);

    // question 21
    Reponse reponse83 = new Reponse();
    reponse83.setIntitule("oui");
    reponse83.setScoreTotal(0.89);
    reponse83.setScoreEngagement(0.22);
    reponse83.setEstEngageForce(true);
    reponseRepository.save(reponse83);

    Reponse reponse84 = new Reponse();
    reponse84.setIntitule("non");
    reponse84.setScoreTotal(0);
    reponse84.setScoreEngagement(0);
    reponseRepository.save(reponse84);

    Reponse reponse85 = new Reponse();
    reponse85.setIntitule("N/A - Nous n'avons pas de travailleur·euses.");
    reponse85.setScoreTotal(0.44);
    reponse85.setScoreEngagement(0);
    reponseRepository.save(reponse85);

    // question 22
    Reponse reponse86 = new Reponse();
    reponse86.setIntitule("Nous avons réalisé une analyse de notre chaîne de valeur, incluant nos fournisseurs, services et matériaux, afin de repérer les principaux domaines où l'eau est utilisée.");
    reponse86.setScoreTotal(0.89);
    reponse86.setScoreEngagement(0.22);
    reponseRepository.save(reponse86);

    Reponse reponse87 = new Reponse();
    reponse87.setIntitule("Nous avons défini des objectifs pour réduire l'empreinte hydrique de notre chaîne d'approvisionnement.");
    reponse87.setScoreTotal(0.89);
    reponse87.setScoreEngagement(0.22);
    reponseRepository.save(reponse87);

    Reponse reponse88 = new Reponse();
    reponse88.setIntitule("Nous collaborons avec nos fournisseurs et les encourageons à collecter des données et à publier leur empreinte hydrique.");
    reponse88.setScoreTotal(0.89);
    reponse88.setScoreEngagement(0.22);
    reponseRepository.save(reponse88);

    Reponse reponse89 = new Reponse();
    reponse89.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse89.setScoreTotal(0);
    reponse89.setScoreEngagement(0);
    reponseRepository.save(reponse89);

    Reponse reponse90 = new Reponse();
    reponse90.setIntitule("Aucune de ces réponses.");
    reponse90.setScoreTotal(0);
    reponse90.setScoreEngagement(0);
    reponseRepository.save(reponse90);

    Reponse reponse91 = new Reponse();
    reponse91.setIntitule("N/A");
    reponse91.setScoreTotal(1.33);
    reponse91.setScoreEngagement(0);
    reponseRepository.save(reponse91);

    // question 23
    Reponse reponse92 = new Reponse();
    reponse92.setIntitule("Nous avons effectué une étude approfondie de nos produits dans le but d'identifier les opportunités d'amélioration dans l'utilisation des ressources (exemple : analyse de cycle de vie).");
    reponse92.setScoreTotal(2);
    reponse92.setScoreEngagement(0.5);
    reponseRepository.save(reponse92);

    Reponse reponse93 = new Reponse();
    reponse93.setIntitule("Nous investissons dans des technologies et des pratiques plus économes en ressources, et explorons de nouvelles possibilités de réduire l'utilisation des ressources.");
    reponse93.setScoreTotal(2);
    reponse93.setScoreEngagement(0.5);
    reponseRepository.save(reponse93);

    Reponse reponse94 = new Reponse();
    reponse94.setIntitule("Nous partageons de manière transparente l'origine et notre utilisation de matières premières et/ou de nos fournitures.");
    reponse94.setScoreTotal(2);
    reponse94.setScoreEngagement(0.5);
    reponseRepository.save(reponse94);

    Reponse reponse95= new Reponse();
    reponse95.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse95.setScoreTotal(0);
    reponse95.setScoreEngagement(0);
    reponseRepository.save(reponse95);

    Reponse reponse96= new Reponse();
    reponse96.setIntitule("Aucune des réponses ci-dessous.");
    reponse96.setScoreTotal(0);
    reponse96.setScoreEngagement(0);
    reponseRepository.save(reponse96);

    Reponse reponse97= new Reponse();
    reponse97.setIntitule("N/A");
    reponse97.setScoreTotal(3);
    reponse97.setScoreEngagement(0);
    reponseRepository.save(reponse97);

    // question 24
    Reponse reponse98= new Reponse();
    reponse98.setIntitule("oui");
    reponse98.setScoreTotal(2);
    reponse98.setScoreEngagement(0.5);
    reponseRepository.save(reponse98);

    Reponse reponse99= new Reponse();
    reponse99.setIntitule("non");
    reponse99.setScoreTotal(0);
    reponse99.setScoreEngagement(0);
    reponseRepository.save(reponse99);

    Reponse reponse100= new Reponse();
    reponse100.setIntitule("N/A");
    reponse100.setScoreTotal(1);
    reponse100.setScoreEngagement(0);
    reponseRepository.save(reponse100);

    // question 25
    Reponse reponse101= new Reponse();
    reponse101.setIntitule("je ne sais pas");
    reponse101.setScoreTotal(0);
    reponse101.setScoreEngagement(0);
    reponseRepository.save(reponse101);

    Reponse reponse102= new Reponse();
    reponse102.setIntitule("<20%");
    reponse102.setScoreTotal(0);
    reponse102.setScoreEngagement(0);
    reponseRepository.save(reponse102);

    Reponse reponse103= new Reponse();
    reponse103.setIntitule("20-49%");
    reponse103.setScoreTotal(0.5);
    reponse103.setScoreEngagement(0.13);
    reponseRepository.save(reponse103);

    Reponse reponse104= new Reponse();
    reponse104.setIntitule("50-74%");
    reponse104.setScoreTotal(1);
    reponse104.setScoreEngagement(0.25);
    reponseRepository.save(reponse104);

    Reponse reponse105= new Reponse();
    reponse105.setIntitule("75-99%");
    reponse105.setScoreTotal(1.5);
    reponse105.setScoreEngagement(0.38);
    reponseRepository.save(reponse105);

    Reponse reponse106= new Reponse();
    reponse106.setIntitule("100%");
    reponse106.setScoreTotal(2);
    reponse106.setScoreEngagement(0.5);
    reponseRepository.save(reponse106);

    Reponse reponse107= new Reponse();
    reponse107.setIntitule("N/A");
    reponse107.setScoreTotal(1);
    reponse107.setScoreEngagement(0);
    reponseRepository.save(reponse107);

    // question 26
    Reponse reponse108= new Reponse();
    reponse108.setIntitule("oui");
    reponse108.setScoreTotal(2);
    reponse108.setScoreEngagement(0.5);
    reponseRepository.save(reponse108);

    Reponse reponse109= new Reponse();
    reponse109.setIntitule("non");
    reponse109.setScoreTotal(0);
    reponse109.setScoreEngagement(0);
    reponseRepository.save(reponse109);

    Reponse reponse110= new Reponse();
    reponse110.setIntitule("N/A");
    reponse110.setScoreTotal(1);
    reponse110.setScoreEngagement(0);
    reponseRepository.save(reponse110);

    // question 27 (pas besoin)
    // question 28 (pas besoin)

    // question 29
    Reponse reponse111= new Reponse();
    reponse111.setIntitule("Nous avons des programmes de recyclage couvrant au minimum le papier et le carton, les PMC, le verre et les déchets organiques.");
    reponse111.setScoreTotal(0);
    reponse111.setScoreEngagement(0);
    reponse111.setEstEngageForce(true);
    reponseRepository.save(reponse111);

    Reponse reponse112= new Reponse();
    reponse112.setIntitule("Nous avons identifier au sein de l'organisation une personne responsable de la gestion des déchets (réduction, tri et éliminiation).");
    reponse112.setScoreTotal(0.62);
    reponse112.setScoreEngagement(0.15);
    reponseRepository.save(reponse112);

    Reponse reponse113= new Reponse();
    reponse113.setIntitule("Nous mettons en place des systèmes efficaces de collecte pour les matériaux recyclables, en partenariat avec des fournisseurs spécialisés dans le recyclage.");
    reponse113.setScoreTotal(0.62);
    reponse113.setScoreEngagement(0.15);
    reponseRepository.save(reponse113);

    Reponse reponse114= new Reponse();
    reponse114.setIntitule("Nous avons établi des lignes directrices pour l'élimination responsable des déchets qui ne peuvent être recyclés ou récupérés, en veillant au respect des réglementations et des normes applicables en matière d'élimination des déchets.");
    reponse114.setScoreTotal(0.62);
    reponse114.setScoreEngagement(0.15);
    reponse114.setEstEngageForce(true);
    reponseRepository.save(reponse114);

    Reponse reponse115= new Reponse();
    reponse115.setIntitule("Nous mettons à disposition des articles réutilisables, tels que des tasses, des verres et des ustensiles, pour réduire l'usage de plastique jetable.");
    reponse115.setScoreTotal(0.62);
    reponse115.setScoreEngagement(0.15);
    reponse115.setEstEngageForce(true);
    reponseRepository.save(reponse115);

    Reponse reponse116= new Reponse();
    reponse116.setIntitule("Nous privilégions l'achat de produits et de fournitures de bureau en vrac ou avec un emballage réduit au minimum, afin de limiter les déchets d'emballage.");
    reponse116.setScoreTotal(0.62);
    reponse116.setScoreEngagement(0.15);
    reponse116.setEstEngageForce(true);
    reponseRepository.save(reponse116);

    Reponse reponse117= new Reponse();
    reponse117.setIntitule("Nous favorisons l'achat de produits rechargeables, comme les cartouches d'encre et les piles, afin de limiter notre production de déchets.");
    reponse117.setScoreTotal(0.62);
    reponse117.setScoreEngagement(0.15);
    reponse117.setEstEngageForce(true);
    reponseRepository.save(reponse117);

    Reponse reponse118= new Reponse();
    reponse118.setIntitule("Nous privilégions les options de don ou de réutilisation, plutôt que de jeter, pour des articles tels que les meubles ou les équipements.");
    reponse118.setScoreTotal(0.62);
    reponse118.setScoreEngagement(0.15);
    reponse118.setEstEngageForce(true);
    reponseRepository.save(reponse118);

    Reponse reponse119= new Reponse();
    reponse119.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse119.setScoreTotal(0);
    reponse119.setScoreEngagement(0);
    reponseRepository.save(reponse119);

    Reponse reponse120= new Reponse();
    reponse120.setIntitule("Aucune de ces réponses.");
    reponse120.setScoreTotal(0);
    reponse120.setScoreEngagement(0);
    reponseRepository.save(reponse120);

    Reponse reponse121= new Reponse();
    reponse121.setIntitule("N/A");
    reponse121.setScoreTotal(2.15);
    reponse121.setScoreEngagement(0);
    reponseRepository.save(reponse121);

    // question 30
    Reponse reponse122= new Reponse();
    reponse122.setIntitule("oui");
    reponse122.setScoreTotal(0.62);
    reponse122.setScoreEngagement(0.15);
    reponse122.setEstEngageForce(true);
    reponseRepository.save(reponse122);

    Reponse reponse123= new Reponse();
    reponse123.setIntitule("non");
    reponse123.setScoreTotal(0);
    reponse123.setScoreEngagement(0);
    reponseRepository.save(reponse123);

    Reponse reponse124= new Reponse();
    reponse124.setIntitule("N/A");
    reponse124.setScoreTotal(0.31);
    reponse124.setScoreEngagement(0);
    reponseRepository.save(reponse124);

    // question 31
    Reponse reponse125= new Reponse();
    reponse125.setIntitule("Nous réutilisons les déchets générés au cours des processus de fabrication.");
    reponse125.setScoreTotal(0.62);
    reponse125.setScoreEngagement(0.15);
    reponseRepository.save(reponse125);

    Reponse reponse126= new Reponse();
    reponse126.setIntitule("Nous avons pris des mesures pour simplifier le recyclage ou la réutilisation de nos produits.");
    reponse126.setScoreTotal(0.62);
    reponse126.setScoreEngagement(0.15);
    reponseRepository.save(reponse126);

    Reponse reponse127= new Reponse();
    reponse127.setIntitule("Nous disposons de programmes de reprise des produits en fin de vie.");
    reponse127.setScoreTotal(0.62);
    reponse127.setScoreEngagement(0.15);
    reponseRepository.save(reponse127);

    Reponse reponse128= new Reponse();
    reponse128.setIntitule("Nous réalisons régulièrement des audits de notre production de déchets pour repérer les principales sources, les possibilités d'amélioration et les opportunités de réduction.");
    reponse128.setScoreTotal(0.62);
    reponse128.setScoreEngagement(0.15);
    reponseRepository.save(reponse128);

    Reponse reponse129= new Reponse();
    reponse129.setIntitule("Nous sensibilisons les travailleur·euses et/ou les consommateur·rices aux principes et aux avantages de l'économie circulaire.");
    reponse129.setScoreTotal(0.62);
    reponse129.setScoreEngagement(0.15);
    reponseRepository.save(reponse129);

    Reponse reponse130= new Reponse();
    reponse130.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse130.setScoreTotal(0);
    reponse130.setScoreEngagement(0);
    reponseRepository.save(reponse130);

    Reponse reponse131= new Reponse();
    reponse131.setIntitule("Aucune de ces réponses.");
    reponse131.setScoreTotal(0);
    reponse131.setScoreEngagement(0);
    reponseRepository.save(reponse131);

    Reponse reponse132= new Reponse();
    reponse132.setIntitule("N/A");
    reponse132.setScoreTotal(1.54);
    reponse132.setScoreEngagement(0);
    reponseRepository.save(reponse132);

    // question 32
    Reponse reponse133= new Reponse();
    reponse133.setIntitule("Nous avons réalisé une analyse des impacts potentiels de nos activités sur la biodiversité.");
    reponse133.setScoreTotal(2);
    reponse133.setScoreEngagement(0.5);
    reponseRepository.save(reponse133);

    Reponse reponse134= new Reponse();
    reponse134.setIntitule("Nous avons mis en place des actions pour préserver et améliorer la biodiversité (comme la plantation d’arbres, de végétaux locaux ou la création de refuges pour la faune).");
    reponse134.setScoreTotal(1.33);
    reponse134.setScoreEngagement(0.33);
    reponseRepository.save(reponse134);

    Reponse reponse135= new Reponse();
    reponse135.setIntitule("Nous avons créé ou restauré des espaces naturels (par exemple, en réaménageant des zones dégradées ou en favorisant la végétation locale).");
    reponse135.setScoreTotal(1.33);
    reponse135.setScoreEngagement(0.33);
    reponseRepository.save(reponse135);

    Reponse reponse136= new Reponse();
    reponse136.setIntitule("Nous limitons fortement l’utilisation de produits nocifs pour la biodiversité (tels que les pesticides ou les engrais chimiques).");
    reponse136.setScoreTotal(1.33);
    reponse136.setScoreEngagement(0.33);
    reponseRepository.save(reponse136);

    Reponse reponse137= new Reponse();
    reponse137.setIntitule("Nous veillons à une gestion responsable et durable des terres (en réduisant les impacts liés à l’aménagement ou à l’exploitation et en préservant la qualité des sols).");
    reponse137.setScoreTotal(1.33);
    reponse137.setScoreEngagement(0.33);
    reponseRepository.save(reponse137);

    Reponse reponse138= new Reponse();
    reponse138.setIntitule("Nous avons formalisé notre engagement envers la protection des écosystèmes et de la biodiversité.");
    reponse138.setScoreTotal(1.33);
    reponse138.setScoreEngagement(0.33);
    reponseRepository.save(reponse138);

    Reponse reponse139= new Reponse();
    reponse139.setIntitule("Autre : veuillez expliquer dans les commentaires");
    reponse139.setScoreTotal(0);
    reponse139.setScoreEngagement(0);
    reponseRepository.save(reponse139);

    Reponse reponse140= new Reponse();
    reponse140.setIntitule("Aucune de ces réponses.");
    reponse140.setScoreTotal(0);
    reponse140.setScoreEngagement(0);
    reponseRepository.save(reponse140);

    Reponse reponse141= new Reponse();
    reponse141.setIntitule("N/A");
    reponse141.setScoreTotal(4.33);
    reponse141.setScoreEngagement(0);
    reponseRepository.save(reponse141);

    // question 33
    Reponse reponse142= new Reponse();
    reponse142.setIntitule("oui");
    reponse142.setScoreTotal(1.33);
    reponse142.setScoreEngagement(0.33);
    reponseRepository.save(reponse142);

    Reponse reponse143= new Reponse();
    reponse143.setIntitule("non");
    reponse143.setScoreTotal(0);
    reponse143.setScoreEngagement(0);
    reponseRepository.save(reponse143);

    Reponse reponse144= new Reponse();
    reponse144.setIntitule("N/A");
    reponse144.setScoreTotal(0.67);
    reponse144.setScoreEngagement(0);
    reponseRepository.save(reponse144);

    // question 34
    Reponse reponse145= new Reponse();
    reponse145.setIntitule("Nous incluons dans toutes nos offres d'emploi une déclaration d'engagement en faveur de la diversité, de l'équité et de l'inclusion.");
    reponse145.setScoreTotal(0.73);
    reponse145.setScoreEngagement(0.18);
    reponse145.setEstEngageForce(true);
    reponseRepository.save(reponse145);

    Reponse reponse146= new Reponse();
    reponse146.setIntitule("Nous analysons la formulation et les exigences de nos descriptions de poste pour nous assurer qu'elles sont inclusives et équitables.");
    reponse146.setScoreTotal(0.73);
    reponse146.setScoreEngagement(0.18);
    reponse146.setEstEngageForce(true);
    reponseRepository.save(reponse146);

    Reponse reponse147= new Reponse();
    reponse147.setIntitule("Nous recrutons activement par l'intermédiaire d'organisations ou de services qui s'adressent à des personnes souvent exclues du marché du travail (ex : personnes en situation de handicap, personnes qui ont été incarcérées, demandeurs d'emploi jeunes ou de longue durée, etc.)");
    reponse147.setScoreTotal(0.73);
    reponse147.setScoreEngagement(0.18);
    reponseRepository.save(reponse147);

    Reponse reponse148= new Reponse();
    reponse148.setIntitule("Nous procédons à des examens anonymes ou \"à l'aveugle\" des candidatures ou des CV sans y associer de noms ou de caractéristiques identifiables.");
    reponse148.setScoreTotal(0.73);
    reponse148.setScoreEngagement(0.18);
    reponseRepository.save(reponse148);

    Reponse reponse149= new Reponse();
    reponse149.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponse149.setScoreTotal(0);
    reponse149.setScoreEngagement(0);
    reponseRepository.save(reponse149);

    Reponse reponse150= new Reponse();
    reponse150.setIntitule("Rien de tout cela.");
    reponse150.setScoreTotal(0);
    reponse150.setScoreEngagement(0);
    reponseRepository.save(reponse150);

    Reponse reponse151= new Reponse();
    reponse151.setIntitule("N/A");
    reponse151.setScoreTotal(1);
    reponse151.setScoreEngagement(0);
    reponseRepository.save(reponse151);

    // question 35
    Reponse reponse152= new Reponse();
    reponse152.setIntitule("Nous avons désigné une personne ou un groupe explicitement responsable de la diversité, de l'équité et de l'inclusion.");
    reponse152.setScoreTotal(0.73);
    reponse152.setScoreEngagement(0.18);
    reponseRepository.save(reponse152);

    Reponse reponse153= new Reponse();
    reponse153.setIntitule("Nous proposons des formations à tous·tes les travailleur·euses sur des sujets liés à la diversité, à l'équité et à l'inclusion.");
    reponse153.setScoreTotal(0.73);
    reponse153.setScoreEngagement(0.18);
    reponseRepository.save(reponse153);

    Reponse reponse154= new Reponse();
    reponse154.setIntitule("Nos installations sont conçues pour répondre aux exigences d'accessibilité pour les personnes souffrant d'un handicap physique.");
    reponse154.setScoreTotal(0.73);
    reponse154.setScoreEngagement(0.18);
    reponseRepository.save(reponse154);

    Reponse reponse155= new Reponse();
    reponse155.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponse155.setScoreTotal(0);
    reponse155.setScoreEngagement(0);
    reponseRepository.save(reponse155);

    Reponse reponse156= new Reponse();
    reponse156.setIntitule("Rien de tout cela.");
    reponse156.setScoreTotal(0);
    reponse156.setScoreEngagement(0);
    reponseRepository.save(reponse156);

    Reponse reponse157= new Reponse();
    reponse157.setIntitule("N/A");
    reponse157.setScoreTotal(1.09);
    reponse157.setScoreEngagement(0);
    reponseRepository.save(reponse157);

    // question 36
    Reponse reponse158= new Reponse();
    reponse158.setIntitule("Une affirmation claire et explicite de l’engagement de l’organisation envers la non-discrimination et l’égalité de traitement pour tous·tes, indépendamment de l’origine, de l’ethnie, du genre, de l’orientation sexuelle, du handicap, de l’âge, de la religion ou de toute autre considération qui limiterait l'inclusion et l'équité.");
    reponse158.setScoreTotal(0.73);
    reponse158.setScoreEngagement(0.18);
    reponseRepository.save(reponse158);

    Reponse reponse159= new Reponse();
    reponse159.setIntitule("Identification des rôles et des responsabilités pour établir un lieu de travail inclusif et créer l'implication de tous·tes à tous les niveaux.");
    reponse159.setScoreTotal(0.73);
    reponse159.setScoreEngagement(0.18);
    reponseRepository.save(reponse159);

    Reponse reponse160= new Reponse();
    reponse160.setIntitule("Mise en œuvre de programmes visant à sensibiliser les travailleur·euses aux biais inconscients, à renforcer leurs compétences culturelles et à promouvoir des comportements inclusifs pour une culture d’inclusion active.");
    reponse160.setScoreTotal(0.73);
    reponse160.setScoreEngagement(0.18);
    reponseRepository.save(reponse160);

    Reponse reponse161= new Reponse();
    reponse161.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponse161.setScoreTotal(0);
    reponse161.setScoreEngagement(0);
    reponseRepository.save(reponse161);

    Reponse reponse162= new Reponse();
    reponse162.setIntitule("Rien de tout cela.");
    reponse162.setScoreTotal(0);
    reponse162.setScoreEngagement(0);
    reponseRepository.save(reponse162);

    Reponse reponse163= new Reponse();
    reponse163.setIntitule("N/A");
    reponse163.setScoreTotal(1.09);
    reponse163.setScoreEngagement(0);
    reponseRepository.save(reponse163);

    // question 37
    Reponse reponse164= new Reponse();
    reponse164.setIntitule("Oui, nous nous assurons que chaque travailleur·euse ait suivi une formation sur la diversité et l'inclusion.");
    reponse164.setScoreTotal(0.29);
    reponse164.setScoreEngagement(0.07);
    reponseRepository.save(reponse164);

    Reponse reponse165= new Reponse();
    reponse165.setIntitule("non");
    reponse165.setScoreTotal(0);
    reponse165.setScoreEngagement(0);
    reponseRepository.save(reponse165);

    Reponse reponse166= new Reponse();
    reponse166.setIntitule("N/A");
    reponse166.setScoreTotal(0.14);
    reponse166.setScoreEngagement(0);
    reponseRepository.save(reponse166);

    // question 38
    Reponse reponse167= new Reponse();
    reponse167.setIntitule("oui");
    reponse167.setScoreTotal(0.73);
    reponse167.setScoreEngagement(0.18);
    reponseRepository.save(reponse167);

    Reponse reponse168= new Reponse();
    reponse168.setIntitule("non");
    reponse168.setScoreTotal(0);
    reponse168.setScoreEngagement(0);
    reponseRepository.save(reponse168);

    Reponse reponse169= new Reponse();
    reponse169.setIntitule("N/A");
    reponse169.setScoreTotal(0.36);
    reponse169.setScoreEngagement(0);
    reponseRepository.save(reponse169);

    // question 39
    Reponse reponse170= new Reponse();
    reponse170.setIntitule("je ne sais pas.");
    reponse170.setScoreTotal(0);
    reponse170.setScoreEngagement(0);
    reponseRepository.save(reponse170);

    Reponse reponse171= new Reponse();
    reponse171.setIntitule(">15x plus élevé");
    reponse171.setScoreTotal(0);
    reponse171.setScoreEngagement(0);
    reponseRepository.save(reponse171);

    Reponse reponse172= new Reponse();
    reponse172.setIntitule("11-15x plus élevé");
    reponse172.setScoreTotal(0.14);
    reponse172.setScoreEngagement(0.04);
    reponseRepository.save(reponse172);

    Reponse reponse173= new Reponse();
    reponse173.setIntitule("6-10x plus élevé");
    reponse173.setScoreTotal(0.21);
    reponse173.setScoreEngagement(0.05);
    reponseRepository.save(reponse173);

    Reponse reponse174= new Reponse();
    reponse174.setIntitule("1-5x plus élevé");
    reponse174.setScoreTotal(0.29);
    reponse174.setScoreEngagement(0.07);
    reponseRepository.save(reponse174);

    Reponse reponse175= new Reponse();
    reponse175.setIntitule("N/A");
    reponse175.setScoreTotal(0.14);
    reponse175.setScoreEngagement(0);
    reponseRepository.save(reponse175);

    // question 40
    Reponse reponse176= new Reponse();
    reponse176.setIntitule("0%");
    reponse176.setScoreTotal(0);
    reponse176.setScoreEngagement(0);
    reponseRepository.save(reponse176);

    Reponse reponse177= new Reponse();
    reponse177.setIntitule("1-14%");
    reponse177.setScoreTotal(0.14);
    reponse177.setScoreEngagement(0.04);
    reponseRepository.save(reponse177);

    Reponse reponse178= new Reponse();
    reponse178.setIntitule("15-29%");
    reponse178.setScoreTotal(0.21);
    reponse178.setScoreEngagement(0.05);
    reponseRepository.save(reponse178);

    Reponse reponse179= new Reponse();
    reponse179.setIntitule("30%+");
    reponse179.setScoreTotal(0.29);
    reponse179.setScoreEngagement(0.07);
    reponseRepository.save(reponse179);

    Reponse reponse180= new Reponse();
    reponse180.setIntitule("je ne sais pas.");
    reponse180.setScoreTotal(0);
    reponse180.setScoreEngagement(0);
    reponseRepository.save(reponse180);

    Reponse reponse181= new Reponse();
    reponse181.setIntitule("N/A");
    reponse181.setScoreTotal(0.14);
    reponse181.setScoreEngagement(0);
    reponseRepository.save(reponse181);

    // question 41 - 42
    Reponse reponse182= new Reponse();
    reponse182.setIntitule("0%");
    reponse182.setScoreTotal(0.14);
    reponse182.setScoreEngagement(0);
    reponseRepository.save(reponse182);

    Reponse reponse183= new Reponse();
    reponse183.setIntitule("1-24%");
    reponse183.setScoreTotal(0.14);
    reponse183.setScoreEngagement(0.04);
    reponseRepository.save(reponse183);

    Reponse reponse184= new Reponse();
    reponse184.setIntitule("25-49%");
    reponse184.setScoreTotal(0.21);
    reponse184.setScoreEngagement(0.05);
    reponseRepository.save(reponse184);

    Reponse reponse185= new Reponse();
    reponse185.setIntitule("50%+");
    reponse185.setScoreTotal(0.29);
    reponse185.setScoreEngagement(0.07);
    reponseRepository.save(reponse185);

    Reponse reponse186= new Reponse();
    reponse186.setIntitule("je ne sais pas.");
    reponse186.setScoreTotal(0);
    reponse186.setScoreEngagement(0);
    reponseRepository.save(reponse186);

    Reponse reponse187= new Reponse();
    reponse187.setIntitule("N/A");
    reponse187.setScoreTotal(1);
    reponse187.setScoreEngagement(0);
    reponseRepository.save(reponse187);

    // question 43 - 44
    Reponse reponse188= new Reponse();
    reponse188.setIntitule("0%");
    reponse188.setScoreTotal(0);
    reponse188.setScoreEngagement(0);
    reponseRepository.save(reponse188);

    Reponse reponse189= new Reponse();
    reponse189.setIntitule("1-14%");
    reponse189.setScoreTotal(0.14);
    reponse189.setScoreEngagement(0.04);
    reponseRepository.save(reponse189);

    Reponse reponse190= new Reponse();
    reponse190.setIntitule("15-29%");
    reponse190.setScoreTotal(0.21);
    reponse190.setScoreEngagement(0.05);
    reponseRepository.save(reponse190);

    Reponse reponse191= new Reponse();
    reponse191.setIntitule("30%+");
    reponse191.setScoreTotal(0.29);
    reponse191.setScoreEngagement(0.07);
    reponseRepository.save(reponse191);

    Reponse reponse192= new Reponse();
    reponse192.setIntitule("je ne sais pas.");
    reponse192.setScoreTotal(0);
    reponse192.setScoreEngagement(0);
    reponseRepository.save(reponse192);

    Reponse reponse193= new Reponse();
    reponse193.setIntitule("N/A");
    reponse193.setScoreTotal(0.14);
    reponse193.setScoreEngagement(0);
    reponseRepository.save(reponse193);

    // question 45
    Reponse reponse194= new Reponse();
    reponse194.setIntitule("Nous élaborons et communiquons des politiques claires en matière de sécurité, facilement accessibles.");
    reponse194.setScoreTotal(1.43);
    reponse194.setScoreEngagement(0.36);
    reponseRepository.save(reponse194);

    Reponse reponse195= new Reponse();
    reponse195.setIntitule("Nous élaborons et communiquons des politiques claires de lutte contre le harcèlement et la violence, décrivant les comportements inacceptables et les conséquences en cas d'infraction.");
    reponse195.setScoreTotal(1.43);
    reponse195.setScoreEngagement(0.36);
    reponseRepository.save(reponse195);

    Reponse reponse196= new Reponse();
    reponse196.setIntitule("Nous mettons en place en place des systèmes de signalement confidentiels et anonymes permettant aux travailleur·euses de signaler les incidents de harcèlement ou de violence sans crainte de représailles.");
    reponse196.setScoreTotal(1.43);
    reponse196.setScoreEngagement(0.36);
    reponseRepository.save(reponse196);

    Reponse reponse197= new Reponse();
    reponse197.setIntitule("Nous définissons et communiquons des procédures claires pour l'examen des plaintes, en veillant à ce que les enquêtes soient approfondies et impartiales.");
    reponse197.setScoreTotal(1.43);
    reponse197.setScoreEngagement(0.36);
    reponseRepository.save(reponse197);

    Reponse reponse198= new Reponse();
    reponse198.setIntitule("Nous mettons en œuvre des programmes de formation annuels pour apprendre aux travailleur·euses à reconnaître et à prévenir le harcèlement, la violence ou les comportements dangereux sur le lieu de travail.");
    reponse198.setScoreTotal(1.43);
    reponse198.setScoreEngagement(0.36);
    reponseRepository.save(reponse198);

    Reponse reponse199= new Reponse();
    reponse199.setIntitule("Nous mettons à jour nos politiques de lutte contre le harcèlement et de gestion des plaintes et des incidents chaque année, et nous informons les travailleur·euses des ressources disponibles à cet égard.");
    reponse199.setScoreTotal(1.43);
    reponse199.setScoreEngagement(0.36);
    reponseRepository.save(reponse199);

    Reponse reponse200= new Reponse();
    reponse200.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponse200.setScoreTotal(0);
    reponse200.setScoreEngagement(0);
    reponseRepository.save(reponse200);

    Reponse reponse201= new Reponse();
    reponse201.setIntitule("Aucune de ces réponses.");
    reponse201.setScoreTotal(0);
    reponse201.setScoreEngagement(0);
    reponseRepository.save(reponse201);

    Reponse reponse202= new Reponse();
    reponse202.setIntitule("N/A");
    reponse202.setScoreTotal(4.29);
    reponse202.setScoreEngagement(0);
    reponseRepository.save(reponse202);

    // question 46
    Reponse reponseSim1 = new Reponse();
    reponseSim1.setIntitule("non");
    reponseSim1.setScoreTotal(0.0);
    reponseSim1.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim1);

    Reponse reponseSim2 = new Reponse();
    reponseSim2.setIntitule("oui");
    reponseSim2.setScoreTotal(1.43);
    reponseSim2.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim2);

    Reponse reponseSim3 = new Reponse();
    reponseSim3.setIntitule("N/A");
    reponseSim3.setScoreTotal(0.71);
    reponseSim3.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim3);

    // question 47
    Reponse reponseSim4 = new Reponse();
    reponseSim4.setIntitule("Nous fournissons aux travailleur·euses des services de conseil en matière de santé comportementale, des ressources en ligne ou des programmes de soutien en matière de bien-être au travail.");
    reponseSim4.setScoreTotal(1.67);
    reponseSim4.setScoreEngagement(0.42);
    reponseRepository.save(reponseSim4);

    Reponse reponseSim5 = new Reponse();
    reponseSim5.setIntitule("Nous avons mis en place des politiques et des programmes visant à promouvoir la santé et le bien-être sur le lieu de travail.");
    reponseSim5.setScoreTotal(1.67);
    reponseSim5.setScoreEngagement(0.42);
    reponseSim5.setEstEngageForce(true);
    reponseRepository.save(reponseSim5);

    Reponse reponseSim6 = new Reponse();
    reponseSim6.setIntitule("Nous parrainons et encourageons les travailleur·euses à participer à des activités de santé et de bien-être pendant la semaine de travail (par exemple, des programmes de marche ou d'escalade).");
    reponseSim6.setScoreTotal(1.67);
    reponseSim6.setScoreEngagement(0.42);
    reponseRepository.save(reponseSim6);

    Reponse reponseSim7 = new Reponse();
    reponseSim7.setIntitule("Nous invitons les travailleur·euses à effectuer des évaluations des risques pour la santé ou à participer à des activités de santé et de bien-être (par exemple un abonnement subventionné à une salle de sport).");
    reponseSim7.setScoreTotal(1.67);
    reponseSim7.setScoreEngagement(0.42);
    reponseRepository.save(reponseSim7);

    Reponse reponseSim8 = new Reponse();
    reponseSim8.setIntitule("Plus de 25 % des travailleur·euses ont effectué une évaluation des risques pour la santé au cours des douze derniers mois.");
    reponseSim8.setScoreTotal(1.67);
    reponseSim8.setScoreEngagement(0.42);
    reponseRepository.save(reponseSim8);

    Reponse reponseSim9 = new Reponse();
    reponseSim9.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim9.setScoreTotal(0.0);
    reponseSim9.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim9);

    Reponse reponseSim10 = new Reponse();
    reponseSim10.setIntitule("Aucune de ces réponses.");
    reponseSim10.setScoreTotal(0.0);
    reponseSim10.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim10);

    Reponse reponseSim11 = new Reponse();
    reponseSim11.setIntitule("N/A");
    reponseSim11.setScoreTotal(4.17);
    reponseSim11.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim11);

    Reponse reponseSim12 = new Reponse();
    reponseSim12.setIntitule("non");
    reponseSim12.setScoreTotal(0.0);
    reponseSim12.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim12);

    Reponse reponseSim13 = new Reponse();
    reponseSim13.setIntitule("oui");
    reponseSim13.setScoreTotal(1.67);
    reponseSim13.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim13);

    Reponse reponseSim14 = new Reponse();
    reponseSim14.setIntitule("N/A");
    reponseSim14.setScoreTotal(0.83);
    reponseSim14.setScoreEngagement(0.42);
    reponseRepository.save(reponseSim14);

    Reponse reponseSim15 = new Reponse();
    reponseSim15.setIntitule("Oui, nous avons un plan de formation.");
    reponseSim15.setScoreTotal(1.0);
    reponseSim15.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim15);

    Reponse reponseSim16 = new Reponse();
    reponseSim16.setIntitule("non");
    reponseSim16.setScoreTotal(0.0);
    reponseSim16.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim16);

    Reponse reponseSim17 = new Reponse();
    reponseSim17.setIntitule("N/A");
    reponseSim17.setScoreTotal(0.5);
    reponseSim17.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim17);

    Reponse reponseSim18 = new Reponse();
    reponseSim18.setIntitule("Nous disposons d'un processus formel d'intégration des nouveaux·elles travailleur·euses.");
    reponseSim18.setScoreTotal(1.0);
    reponseSim18.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim18);

    Reponse reponseSim19 = new Reponse();
    reponseSim19.setIntitule("Nous encourageons les promotions internes et l'embauche pour des postes avancés (en publiant d'abord les offres d'emploi en interne).");
    reponseSim19.setScoreTotal(1.0);
    reponseSim19.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim19);

    Reponse reponseSim20 = new Reponse();
    reponseSim20.setIntitule("Nous proposons des formations polyvalentes pour les avancements de carrière ou les transitions (par exemple, une formation en gestion pour les non-cadres).");
    reponseSim20.setScoreTotal(1.0);
    reponseSim20.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim20);

    Reponse reponseSim21 = new Reponse();
    reponseSim21.setIntitule("Nous facilitons les opportunités de développement professionnel externe et disposons d'un budget à cet effet (participation à des conférences, formations en ligne, etc.)");
    reponseSim21.setScoreTotal(1.0);
    reponseSim21.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim21);

    Reponse reponseSim22 = new Reponse();
    reponseSim22.setIntitule("Nous offrons des remboursements ou des programmes pour des formations continues certifiantes (par exemple, diplômes universitaires, licences professionnelles).");
    reponseSim22.setScoreTotal(1.0);
    reponseSim22.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim22);

    Reponse reponseSim23 = new Reponse();
    reponseSim23.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim23.setScoreTotal(0.0);
    reponseSim23.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim23);

    Reponse reponseSim24 = new Reponse();
    reponseSim24.setIntitule("Rien de tout cela.");
    reponseSim24.setScoreTotal(0.0);
    reponseSim24.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim24);

    Reponse reponseSim25 = new Reponse();
    reponseSim25.setIntitule("N/A");
    reponseSim25.setScoreTotal(2.50);
    reponseSim25.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim25);

    Reponse reponseSim26 = new Reponse();
    reponseSim26.setIntitule("0%");
    reponseSim26.setScoreTotal(0.0);
    reponseSim26.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim26);

    Reponse reponseSim27 = new Reponse();
    reponseSim27.setIntitule("1-43%");
    reponseSim27.setScoreTotal(0.17);
    reponseSim27.setScoreEngagement(0.04);
    reponseRepository.save(reponseSim27);

    Reponse reponseSim28 = new Reponse();
    reponseSim28.setIntitule("50-62%");
    reponseSim28.setScoreTotal(0.33);
    reponseSim28.setScoreEngagement(0.08);
    reponseRepository.save(reponseSim28);

    Reponse reponseSim29 = new Reponse();
    reponseSim29.setIntitule("63-75%");
    reponseSim29.setScoreTotal(0.50);
    reponseSim29.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim29);

    Reponse reponseSim30 = new Reponse();
    reponseSim30.setIntitule(">75%");
    reponseSim30.setScoreTotal(0.67);
    reponseSim30.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim30);

    Reponse reponseSim31 = new Reponse();
    reponseSim31.setIntitule("non");
    reponseSim31.setScoreTotal(0.0);
    reponseSim31.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim31);

    Reponse reponseSim32 = new Reponse();
    reponseSim32.setIntitule("N/A");
    reponseSim32.setScoreTotal(0.33);
    reponseSim32.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim32);

    Reponse reponseSim33 = new Reponse();
    reponseSim33.setIntitule("0");
    reponseSim33.setScoreTotal(0.0);
    reponseSim33.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim33);

    Reponse reponseSim34 = new Reponse();
    reponseSim34.setIntitule("Le montant suivant:");
    reponseSim34.setScoreTotal(0.0);
    reponseSim34.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim34);

    Reponse reponseSim35 = new Reponse();
    reponseSim35.setIntitule("N/A");
    reponseSim35.setScoreTotal(0.67);
    reponseSim35.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim35);

    Reponse reponseSim36 = new Reponse();
    reponseSim36.setIntitule("0%");
    reponseSim36.setScoreTotal(0.0);
    reponseSim36.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim36);

    Reponse reponseSim37 = new Reponse();
    reponseSim37.setIntitule("1-4%");
    reponseSim37.setScoreTotal(0.33);
    reponseSim37.setScoreEngagement(0.08);
    reponseRepository.save(reponseSim37);

    Reponse reponseSim38 = new Reponse();
    reponseSim38.setIntitule("5-14%");
    reponseSim38.setScoreTotal(0.50);
    reponseSim38.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim38);

    Reponse reponseSim39 = new Reponse();
    reponseSim39.setIntitule("15%");
    reponseSim39.setScoreTotal(0.67);
    reponseSim39.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim39);

    Reponse reponseSim40 = new Reponse();
    reponseSim40.setIntitule("Je ne sais pas");
    reponseSim40.setScoreTotal(0.0);
    reponseSim40.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim40);

    Reponse reponseSim41 = new Reponse();
    reponseSim41.setIntitule("N/A");
    reponseSim41.setScoreTotal(0.33);
    reponseSim41.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim41);

    Reponse reponseSim42 = new Reponse();
    reponseSim42.setIntitule("Nous avons mis en place des processus permettant aux travailleur·euses de donner leur avis et de contribuer aux prises de décisions opérationnelles importantes et/ou stratégiques et/ou sur tout changement de pratique qui affecterait leurs habitudes de travail (exemples : team et management meetings).");
    reponseSim42.setScoreTotal(1.0);
    reponseSim42.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim42);

    Reponse reponseSim43 = new Reponse();
    reponseSim43.setIntitule("Nous disposons de mécanismes formels de retour d'information pour répondre aux préoccupations et améliorer les pratiques de l'entreprise (retour sur les préoccupations et contributions).");
    reponseSim43.setScoreTotal(1.0);
    reponseSim43.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim43);

    Reponse reponseSim44 = new Reponse();
    reponseSim44.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim44.setScoreTotal(0.0);
    reponseSim44.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim44);

    Reponse reponseSim45 = new Reponse();
    reponseSim45.setIntitule("Rien de tout cela.");
    reponseSim45.setScoreTotal(0.0);
    reponseSim45.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim45);

    Reponse reponseSim46 = new Reponse();
    reponseSim46.setIntitule("N/A");
    reponseSim46.setScoreTotal(1.0);
    reponseSim46.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim46);

    Reponse reponseSim47 = new Reponse();
    reponseSim47.setIntitule("L'entreprise contrôle la satisfaction des travailleur·euses.");
    reponseSim47.setScoreTotal(1.11);
    reponseSim47.setScoreEngagement(0.28);
    reponseRepository.save(reponseSim47);

    Reponse reponseSim48 = new Reponse();
    reponseSim48.setIntitule("L'entreprise partage la satisfaction des travailleur·euses en interne.");
    reponseSim48.setScoreTotal(1.11);
    reponseSim48.setScoreEngagement(0.28);
    reponseRepository.save(reponseSim48);

    Reponse reponseSim49 = new Reponse();
    reponseSim49.setIntitule("L'entreprise partage la satisfaction des travailleur·euses publiquement.");
    reponseSim49.setScoreTotal(1.11);
    reponseSim49.setScoreEngagement(0.28);
    reponseRepository.save(reponseSim49);

    Reponse reponseSim50 = new Reponse();
    reponseSim50.setIntitule("L'entreprise a défini des objectifs en matière de satisfaction des travailleur·euses.");
    reponseSim50.setScoreTotal(1.11);
    reponseSim50.setScoreEngagement(0.28);
    reponseRepository.save(reponseSim50);

    Reponse reponseSim51 = new Reponse();
    reponseSim51.setIntitule("Au cours de l'année écoulée, l'entreprise a atteint les objectifs fixés en matière de satisfaction des travailleur·euses.");
    reponseSim51.setScoreTotal(1.11);
    reponseSim51.setScoreEngagement(0.28);
    reponseRepository.save(reponseSim51);

    Reponse reponseSim52 = new Reponse();
    reponseSim52.setIntitule("Rien de tout cela.");
    reponseSim52.setScoreTotal(0.0);
    reponseSim52.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim52);

    Reponse reponseSim53 = new Reponse();
    reponseSim53.setIntitule("N/A");
    reponseSim53.setScoreTotal(0.0);
    reponseSim53.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim53);

    Reponse reponseSim54 = new Reponse();
    reponseSim54.setIntitule("Pas de versement de bonus ou pas de plan de bonus.");
    reponseSim54.setScoreTotal(0.0);
    reponseSim54.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim54);

    Reponse reponseSim55 = new Reponse();
    reponseSim55.setIntitule("<1%");
    reponseSim55.setScoreTotal(0.28);
    reponseSim55.setScoreEngagement(0.07);
    reponseRepository.save(reponseSim55);

    Reponse reponseSim56 = new Reponse();
    reponseSim56.setIntitule("1-2%");
    reponseSim56.setScoreTotal(0.56);
    reponseSim56.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim56);

    Reponse reponseSim57 = new Reponse();
    reponseSim57.setIntitule("2-3%");
    reponseSim57.setScoreTotal(0.83);
    reponseSim57.setScoreEngagement(0.21);
    reponseRepository.save(reponseSim57);

    Reponse reponseSim58 = new Reponse();
    reponseSim58.setIntitule(">3%");
    reponseSim58.setScoreTotal(1.11);
    reponseSim58.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim58);

    Reponse reponseSim59 = new Reponse();
    reponseSim59.setIntitule("N/A");
    reponseSim59.setScoreTotal(0.56);
    reponseSim59.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim59);

    Reponse reponseSim60 = new Reponse();
    reponseSim60.setIntitule("0%");
    reponseSim60.setScoreTotal(0.0);
    reponseSim60.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim60);

    Reponse reponseSim61 = new Reponse();
    reponseSim61.setIntitule("1-43%");
    reponseSim61.setScoreTotal(0.28);
    reponseSim61.setScoreEngagement(0.07);
    reponseRepository.save(reponseSim61);

    Reponse reponseSim62 = new Reponse();
    reponseSim62.setIntitule("50-62%");
    reponseSim62.setScoreTotal(0.56);
    reponseSim62.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim62);

    Reponse reponseSim63 = new Reponse();
    reponseSim63.setIntitule("63-75%");
    reponseSim63.setScoreTotal(0.83);
    reponseSim63.setScoreEngagement(0.21);
    reponseRepository.save(reponseSim63);

    Reponse reponseSim64 = new Reponse();
    reponseSim64.setIntitule(">75%");
    reponseSim64.setScoreTotal(1.11);
    reponseSim64.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim64);

    Reponse reponseSim65 = new Reponse();
    reponseSim65.setIntitule("N/A");
    reponseSim65.setScoreTotal(0.56);
    reponseSim65.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim65);

    Reponse reponseSim66 = new Reponse();
    reponseSim66.setIntitule("<65%");
    reponseSim66.setScoreTotal(0.0);
    reponseSim66.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim66);

    Reponse reponseSim67 = new Reponse();
    reponseSim67.setIntitule("65-80%");
    reponseSim67.setScoreTotal(0.56);
    reponseSim67.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim67);

    Reponse reponseSim68 = new Reponse();
    reponseSim68.setIntitule("81-90%");
    reponseSim68.setScoreTotal(0.83);
    reponseSim68.setScoreEngagement(0.21);
    reponseRepository.save(reponseSim68);

    Reponse reponseSim69 = new Reponse();
    reponseSim69.setIntitule("90%+");
    reponseSim69.setScoreTotal(1.11);
    reponseSim69.setScoreEngagement(0.28);
    reponseRepository.save(reponseSim69);

    Reponse reponseSim70 = new Reponse();
    reponseSim70.setIntitule("Je ne sais pas.");
    reponseSim70.setScoreTotal(0.0);
    reponseSim70.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim70);

    Reponse reponseSim71 = new Reponse();
    reponseSim71.setIntitule("N/A");
    reponseSim71.setScoreTotal(0.56);
    reponseSim71.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim71);

    Reponse reponseSim72 = new Reponse();
    reponseSim72.setIntitule("<5%");
    reponseSim72.setScoreTotal(1.11);
    reponseSim72.setScoreEngagement(0.28);
    reponseRepository.save(reponseSim72);

    Reponse reponseSim73 = new Reponse();
    reponseSim73.setIntitule("<12%");
    reponseSim73.setScoreTotal(0.83);
    reponseSim73.setScoreEngagement(0.21);
    reponseRepository.save(reponseSim73);

    Reponse reponseSim74 = new Reponse();
    reponseSim74.setIntitule("<25%");
    reponseSim74.setScoreTotal(0.56);
    reponseSim74.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim74);

    Reponse reponseSim75 = new Reponse();
    reponseSim75.setIntitule("<40%");
    reponseSim75.setScoreTotal(0.28);
    reponseSim75.setScoreEngagement(0.07);
    reponseRepository.save(reponseSim75);

    Reponse reponseSim76 = new Reponse();
    reponseSim76.setIntitule("40%+");
    reponseSim76.setScoreTotal(0.0);
    reponseSim76.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim76);

    Reponse reponseSim77 = new Reponse();
    reponseSim77.setIntitule("Je ne sais pas.");
    reponseSim77.setScoreTotal(0.0);
    reponseSim77.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim77);

    Reponse reponseSim78 = new Reponse();
    reponseSim78.setIntitule("N/A");
    reponseSim78.setScoreTotal(0.56);
    reponseSim78.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim78);

    // question 60
    Reponse reponseSim79 = new Reponse();
    reponseSim79.setIntitule("Nous offrons des produits ou des services à prix réduit aux groupes défavorisés.");
    reponseSim79.setScoreTotal(0.53);
    reponseSim79.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim79);

    Reponse reponseSim80 = new Reponse();
    reponseSim80.setIntitule("Nous nous engageons dans des projets innovants au sein de notre communauté afin de résoudre des problèmes tels que la pauvreté, l'inégalité et la durabilité environnementale.");
    reponseSim80.setScoreTotal(0.53);
    reponseSim80.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim80);

    Reponse reponseSim81 = new Reponse();
    reponseSim81.setIntitule("Nous investissons dans des projets d'entreprenariat social qui cherchent à relever des défis sociaux grâce à des modèles d'entreprise durables, ou nous les soutenons.");
    reponseSim81.setScoreTotal(0.53);
    reponseSim81.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim81);

    Reponse reponseSim82 = new Reponse();
    reponseSim82.setIntitule("Nous participons aux efforts de sensibilisation et nous nous engageons auprès des décideur·euses politiques pour aborder les problèmes systémiques et contribuer aux changements politiques.");
    reponseSim82.setScoreTotal(0.53);
    reponseSim82.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim82);

    Reponse reponseSim83 = new Reponse();
    reponseSim83.setIntitule("Nous collaborons avec des ONG et des fondations établies pour soutenir des projets sociaux, en tirant parti de leur expertise et de leurs réseaux pour un plus grand impact.");
    reponseSim83.setScoreTotal(0.53);
    reponseSim83.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim83);

    Reponse reponseSim84 = new Reponse();
    reponseSim84.setIntitule("Nous encourageons l'engagement social de nos travailleur·euses (par exemple en offrant du temps rémunéré pour le bénévolat ou en organisant des journées de teambuilding dédiées à des projets solidaires).");
    reponseSim84.setScoreTotal(0.53);
    reponseSim84.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim84);

    Reponse reponseSim85 = new Reponse();
    reponseSim85.setIntitule("Autre, veuillez décrire dans les commentaires.");
    reponseSim85.setScoreTotal(0.0);
    reponseSim85.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim85);

    Reponse reponseSim86 = new Reponse();
    reponseSim86.setIntitule("Aucune de ces réponses.");
    reponseSim86.setScoreTotal(0.0);
    reponseSim86.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim86);

    Reponse reponseSim87 = new Reponse();
    reponseSim87.setIntitule("N/A");
    reponseSim87.setScoreTotal(1.87);
    reponseSim87.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim87);

    // question 61
    Reponse reponseSim88 = new Reponse();
    reponseSim88.setIntitule("Non");
    reponseSim88.setScoreTotal(0.0);
    reponseSim88.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim88);

    Reponse reponseSim89 = new Reponse();
    reponseSim89.setIntitule("Oui : veuillez indiquer le nombre d'heures");
    reponseSim89.setScoreTotal(1.0);
    reponseSim89.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim89);

    Reponse reponseSim90 = new Reponse();
    reponseSim90.setIntitule("N/A");
    reponseSim90.setScoreTotal(0.5);
    reponseSim90.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim90);

    // question 62
    Reponse reponseSim91 = new Reponse();
    reponseSim91.setIntitule("Non");
    reponseSim91.setScoreTotal(0.0);
    reponseSim91.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim91);

    Reponse reponseSim92 = new Reponse();
    reponseSim92.setIntitule("Oui : veuillez indiquer le");
    reponseSim92.setScoreTotal(1.0);
    reponseSim92.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim92);

    Reponse reponseSim93 = new Reponse();
    reponseSim93.setIntitule("N/A");
    reponseSim93.setScoreTotal(0.5);
    reponseSim93.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim93);

    Reponse reponseSim94 = new Reponse();
    reponseSim94.setIntitule("Non");
    reponseSim94.setScoreTotal(0.0);
    reponseSim94.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim94);

    Reponse reponseSim95 = new Reponse();
    reponseSim95.setIntitule("Oui : veuillez indiquer le");
    reponseSim95.setScoreTotal(1.0);
    reponseSim95.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim95);

    Reponse reponseSim96 = new Reponse();
    reponseSim96.setIntitule("N/A");
    reponseSim96.setScoreTotal(0.5);
    reponseSim96.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim96);

    Reponse reponseSim97 = new Reponse();
    reponseSim97.setIntitule("Non");
    reponseSim97.setScoreTotal(0.0);
    reponseSim97.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim97);

    Reponse reponseSim98 = new Reponse();
    reponseSim98.setIntitule("Oui : veuillez indiquer le");
    reponseSim98.setScoreTotal(1.0);
    reponseSim98.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim98);

    Reponse reponseSim99 = new Reponse();
    reponseSim99.setIntitule("N/A");
    reponseSim99.setScoreTotal(0.5);
    reponseSim99.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim99);

    Reponse reponseSim100 = new Reponse();
    reponseSim100.setIntitule("Non");
    reponseSim100.setScoreTotal(0.0);
    reponseSim100.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim100);

    Reponse reponseSim101 = new Reponse();
    reponseSim101.setIntitule("Oui : veuillez indiquer le");
    reponseSim101.setScoreTotal(1.0);
    reponseSim101.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim101);

    // question 63
    Reponse reponseSim102 = new Reponse();
    reponseSim102.setIntitule("Non");
    reponseSim102.setScoreTotal(0.0);
    reponseSim102.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim102);

    Reponse reponseSim103 = new Reponse();
    reponseSim103.setIntitule("Oui : veuillez indiquer le");
    reponseSim103.setScoreTotal(1.0);
    reponseSim103.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim103);

    Reponse reponseSim104 = new Reponse();
    reponseSim104.setIntitule("N/A");
    reponseSim104.setScoreTotal(0.5);
    reponseSim104.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim104);

    Reponse reponseSim105 = new Reponse();
    reponseSim105.setIntitule("Non");
    reponseSim105.setScoreTotal(0.0);
    reponseSim105.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim105);

    Reponse reponseSim106 = new Reponse();
    reponseSim106.setIntitule("Oui : veuillez indiquer le");
    reponseSim106.setScoreTotal(1.0);
    reponseSim106.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim106);

    // question 64
    Reponse reponseSim107 = new Reponse();
    reponseSim107.setIntitule("Notre organisation est dirigée par ses fondateur·trices ou propriétaires uniquement.");
    reponseSim107.setScoreTotal(0.0);
    reponseSim107.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim107);

    Reponse reponseSim108 = new Reponse();
    reponseSim108.setIntitule("Notre conseil d'administration est composé d'au moins un·e membre qui n'est pas un·e fondateur·trice ou un·e propriétaire de l'entreprise.");
    reponseSim108.setScoreTotal(1.33);
    reponseSim108.setScoreEngagement(0.33);
    reponseRepository.save(reponseSim108);

    Reponse reponseSim109 = new Reponse();
    reponseSim109.setIntitule("Notre conseil d'administration est composé d'au moins un·e membre représentant les travailleur·euses de l'entreprise.");
    reponseSim109.setScoreTotal(1.33);
    reponseSim109.setScoreEngagement(0.33);
    reponseRepository.save(reponseSim109);

    // question 65
    Reponse reponseSim110 = new Reponse();
    reponseSim110.setIntitule("Les travailleur·euses cadres et/ou non-cadres.");
    reponseSim110.setScoreTotal(1.33);
    reponseSim110.setScoreEngagement(0.33);
    reponseRepository.save(reponseSim110);

    Reponse reponseSim111 = new Reponse();
    reponseSim111.setIntitule("Une expertise locale et/ou sociale. Par exemple un·e représentant·e de parties prenantes stragégiques, d'une université locale, d'une organisation territoriale ou sans but lucratif.");
    reponseSim111.setScoreTotal(1.33);
    reponseSim111.setScoreEngagement(0.33);
    reponseRepository.save(reponseSim111);

    Reponse reponseSim112 = new Reponse();
    reponseSim112.setIntitule("Une expertise environnementale. Par exemple un·e expert·e en développement durable, un·e  expert·e scientifique, une organisation territoriale ou sans but lucratif.");
    reponseSim112.setScoreTotal(1.33);
    reponseSim112.setScoreEngagement(0.33);
    reponseRepository.save(reponseSim112);

    Reponse reponseSim113 = new Reponse();
    reponseSim113.setIntitule("Aucune de ces réponses.");
    reponseSim113.setScoreTotal(0.0);
    reponseSim113.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim113);

    Reponse reponseSim114 = new Reponse();
    reponseSim114.setIntitule("N/A");
    reponseSim114.setScoreTotal(1.0);
    reponseSim114.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim114);

    // question 68
    Reponse reponseSim115 = new Reponse();
    reponseSim115.setIntitule("0%");
    reponseSim115.setScoreTotal(0.0);
    reponseSim115.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim115);

    Reponse reponseSim116 = new Reponse();
    reponseSim116.setIntitule("1-24%");
    reponseSim116.setScoreTotal(0.40);
    reponseSim116.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim116);

    Reponse reponseSim117 = new Reponse();
    reponseSim117.setIntitule("25-49%");
    reponseSim117.setScoreTotal(1.20);
    reponseSim117.setScoreEngagement(0.30);
    reponseRepository.save(reponseSim117);

    Reponse reponseSim118 = new Reponse();
    reponseSim118.setIntitule(">50%");
    reponseSim118.setScoreTotal(2.0);
    reponseSim118.setScoreEngagement(0.50);
    reponseRepository.save(reponseSim118);

    Reponse reponseSim119 = new Reponse();
    reponseSim119.setIntitule("N/A");
    reponseSim119.setScoreTotal(1.0);
    reponseSim119.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim119);

    // question 69
    Reponse reponseSim120 = new Reponse();
    reponseSim120.setIntitule("Oui");
    reponseSim120.setScoreTotal(1.33);
    reponseSim120.setScoreEngagement(0.33);
    reponseRepository.save(reponseSim120);

    Reponse reponseSim121 = new Reponse();
    reponseSim121.setIntitule("Non");
    reponseSim121.setScoreTotal(0.0);
    reponseSim121.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim121);

    Reponse reponseSim122 = new Reponse();
    reponseSim122.setIntitule("N/A");
    reponseSim122.setScoreTotal(0.67);
    reponseSim122.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim122);

    // question 71
    Reponse reponseSim123 = new Reponse();
    reponseSim123.setIntitule("1-24%");
    reponseSim123.setScoreTotal(0.50);
    reponseSim123.setScoreEngagement(0.13);
    reponseRepository.save(reponseSim123);

    Reponse reponseSim124 = new Reponse();
    reponseSim124.setIntitule("25-49%");
    reponseSim124.setScoreTotal(1.0);
    reponseSim124.setScoreEngagement(0.25);
    reponseRepository.save(reponseSim124);

    Reponse reponseSim125 = new Reponse();
    reponseSim125.setIntitule("50-75%");
    reponseSim125.setScoreTotal(1.50);
    reponseSim125.setScoreEngagement(0.38);
    reponseRepository.save(reponseSim125);

    Reponse reponseSim126 = new Reponse();
    reponseSim126.setIntitule(">75%");
    reponseSim126.setScoreTotal(2.00);
    reponseSim126.setScoreEngagement(0.50);
    reponseRepository.save(reponseSim126);

    Reponse reponseSim127 = new Reponse();
    reponseSim127.setIntitule("Nous ne procédons à aucun contrôle ou audit de nos fournisseurs.");
    reponseSim127.setScoreTotal(0.0);
    reponseSim127.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim127);

    Reponse reponseSim128 = new Reponse();
    reponseSim128.setIntitule("N/A");
    reponseSim128.setScoreTotal(1.0);
    reponseSim128.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim128);

    // question 72
    Reponse reponseSim129 = new Reponse();
    reponseSim129.setIntitule("Nous intégrons des critères ESG dans la sélection des fournisseurs.");
    reponseSim129.setScoreTotal(0.57);
    reponseSim129.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim129);

    Reponse reponseSim130 = new Reponse();
    reponseSim130.setIntitule("Nous intégrons des clauses ESG dans les contrats avec nos fournisseurs.");
    reponseSim130.setScoreTotal(0.57);
    reponseSim130.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim130);

    Reponse reponseSim131 = new Reponse();
    reponseSim131.setIntitule("Nous collaborons avec avec nos fournisseurs pour améliorer leurs pratiques ESG.");
    reponseSim131.setScoreTotal(0.57);
    reponseSim131.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim131);

    Reponse reponseSim132 = new Reponse();
    reponseSim132.setIntitule("Nous encourageons nos fournisseurs à faire preuve de transparence et à divulguer leurs performances en matière d'ESG.");
    reponseSim132.setScoreTotal(0.57);
    reponseSim132.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim132);

    Reponse reponseSim133 = new Reponse();
    reponseSim133.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim133.setScoreTotal(0.0);
    reponseSim133.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim133);

    Reponse reponseSim134 = new Reponse();
    reponseSim134.setIntitule("Aucune de ces réponses.");
    reponseSim134.setScoreTotal(0.0);
    reponseSim134.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim134);

    Reponse reponseSim135 = new Reponse();
    reponseSim135.setIntitule("N/A");
    reponseSim135.setScoreTotal(1.14);
    reponseSim135.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim135);

    // question 73
    Reponse reponseSim136 = new Reponse();
    reponseSim136.setIntitule("Nous proposons des garanties sur nos produits et services, ainsi que des politiques de protection adaptées.");
    reponseSim136.setScoreTotal(0.57);
    reponseSim136.setScoreEngagement(0.14);
    reponseSim136.setEstEngageForce(true);
    reponseRepository.save(reponseSim136);

    Reponse reponseSim137 = new Reponse();
    reponseSim137.setIntitule("Nous disposons d'une ou plusieurs certifications de qualité ou d'accréditations de tiers attestant de la qualité de nos produits ou services.");
    reponseSim137.setScoreTotal(0.57);
    reponseSim137.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim137);

    Reponse reponseSim138 = new Reponse();
    reponseSim138.setIntitule("Nous avons mis en place des mécanismes formels assurant un contrôle rigoureux de la qualité de nos produits ou services.");
    reponseSim138.setScoreTotal(0.57);
    reponseSim138.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim138);

    Reponse reponseSim139 = new Reponse();
    reponseSim139.setIntitule("Nous avons mis en place des mécanismes pour recueillir les retours d'information, gérer le service après-vente et traiter les réclamations.");
    reponseSim139.setScoreTotal(0.57);
    reponseSim139.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim139);

    Reponse reponseSim140 = new Reponse();
    reponseSim140.setIntitule("Nous contrôlons la satisfaction des client·es ou des consommateur·rices.");
    reponseSim140.setScoreTotal(0.57);
    reponseSim140.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim140);

    Reponse reponseSim141 = new Reponse();
    reponseSim141.setIntitule("L'entreprise offre une assistance en temps réel à ses client·es.");
    reponseSim141.setScoreTotal(0.57);
    reponseSim141.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim141);

    Reponse reponseSim142 = new Reponse();
    reponseSim142.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim142.setScoreTotal(0.0);
    reponseSim142.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim142);

    Reponse reponseSim143 = new Reponse();
    reponseSim143.setIntitule("Aucune de ces réponses.");
    reponseSim143.setScoreTotal(0.0);
    reponseSim143.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim143);

    Reponse reponseSim144 = new Reponse();
    reponseSim144.setIntitule("N/A");
    reponseSim144.setScoreTotal(1.71);
    reponseSim144.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim144);

    // question 74
    Reponse reponseSim145 = new Reponse();
    reponseSim145.setIntitule("Nous avons mis en place des mécanismes pour recueillir les retours d'information, gérer le service après-vente et traiter les réclamations.");
    reponseSim145.setScoreTotal(0.57);
    reponseSim145.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim145);

    Reponse reponseSim146 = new Reponse();
    reponseSim146.setIntitule("Nous contrôlons la satisfaction des client·es ou des consommateur·rices.");
    reponseSim146.setScoreTotal(0.57);
    reponseSim146.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim146);

    Reponse reponseSim147 = new Reponse();
    reponseSim147.setIntitule("L'entreprise offre une assistance en temps réel à ses client·es.");
    reponseSim147.setScoreTotal(0.57);
    reponseSim147.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim147);

    Reponse reponseSim148 = new Reponse();
    reponseSim148.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim148.setScoreTotal(0.0);
    reponseSim148.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim148);

    Reponse reponseSim149 = new Reponse();
    reponseSim149.setIntitule("Aucune de ces réponses.");
    reponseSim149.setScoreTotal(0.0);
    reponseSim149.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim149);

    Reponse reponseSim150 = new Reponse();
    reponseSim150.setIntitule("N/A");
    reponseSim150.setScoreTotal(1.71);
    reponseSim150.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim150);

    // question 75
    Reponse reponseSim151 = new Reponse();
    reponseSim151.setIntitule("Aucun engagement social ou environnemental.");
    reponseSim151.setScoreTotal(0.57);
    reponseSim151.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim151);

    Reponse reponseSim152 = new Reponse();
    reponseSim152.setIntitule("Un engagement général en matière de responsabilité sociale ou environnementale (par exemple, préservation de l'environnement).");
    reponseSim152.setScoreTotal(0.57);
    reponseSim152.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim152);

    Reponse reponseSim153 = new Reponse();
    reponseSim153.setIntitule("Un engagement en faveur d'un impact social positif spécifique (par exemple, politique de prix réduit pour une certaine catégorie de clients ayant moins facilement accès à vos services ou vos produits).");
    reponseSim153.setScoreTotal(0.57);
    reponseSim153.setScoreEngagement(0.14);
    reponseRepository.save(reponseSim153);

    Reponse reponseSim154 = new Reponse();
    reponseSim154.setIntitule("Un engagement en faveur d'un impact positif spécifique sur l'environnement (par exemple, modèle d'affaires basé sur la location, la réparation et/ou la réutilisation plutôt que sur l'achat et l'élimination).");
    reponseSim154.setScoreTotal(0.0);
    reponseSim154.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim154);

    Reponse reponseSim155 = new Reponse();
    reponseSim155.setIntitule("Nous n'avons pas de mission écrite et formelle.");
    reponseSim155.setScoreTotal(0.0);
    reponseSim155.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim155);

    Reponse reponseSim156 = new Reponse();
    reponseSim156.setIntitule("N/A");
    reponseSim156.setScoreTotal(1.71);
    reponseSim156.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim156);

    // question 76
    Reponse reponseSim157 = new Reponse();
    reponseSim157.setIntitule("Nous sommes conscient·es des objectifs de développement durable (ODD) des Nations unies et de leur importance.");
    reponseSim157.setScoreTotal(0.67);
    reponseSim157.setScoreEngagement(0.17);
    reponseSim157.setEstEngageForce(true);
    reponseRepository.save(reponseSim157);

    Reponse reponseSim158 = new Reponse();
    reponseSim158.setIntitule("Nous sensibilisons nos travailleur·euses aux ODD et les impliquons dans la poursuite de ces objectifs.");
    reponseSim158.setScoreTotal(0.67);
    reponseSim158.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim158);

    Reponse reponseSim159 = new Reponse();
    reponseSim159.setIntitule("Nous alignons les activités et les initiatives de l'entreprise sur des objectifs de développement durable spécifiques.");
    reponseSim159.setScoreTotal(0.67);
    reponseSim159.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim159);

    Reponse reponseSim160 = new Reponse();
    reponseSim160.setIntitule("Nous disposons d'indicateurs de performance ou de mesures de réussite pour mesurer l'impact positif de l'entreprise sur les ODD.");
    reponseSim160.setScoreTotal(0.67);
    reponseSim160.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim160);

    Reponse reponseSim161 = new Reponse();
    reponseSim161.setIntitule("Aucune de ces réponses.");
    reponseSim161.setScoreTotal(0.0);
    reponseSim161.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim161);

    Reponse reponseSim162 = new Reponse();
    reponseSim162.setIntitule("N/A");
    reponseSim162.setScoreTotal(1.33);
    reponseSim162.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim162);

    // question 77
    Reponse reponseSim163 = new Reponse();
    reponseSim163.setIntitule("Cartographie des parties prenantes : Nous avons identifié et classifié les parties prenantes internes et externes pouvant avoir un impact sur ou être affectées par nos décisions, telles que les employé·es, les actionnaires, les client·es, les régulateurs, les investisseurs, et les communautés locales.");
    reponseSim163.setScoreTotal(0.67);
    reponseSim163.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim163);

    Reponse reponseSim164 = new Reponse();
    reponseSim164.setIntitule("Évaluation de la matérialité d'impact : Nous avons analysé les enjeux environnementaux, sociaux et de gouvernance (ESG) les plus importants pour l'entreprise, en termes d'impact sur la société et l'environnement.");
    reponseSim164.setScoreTotal(0.67);
    reponseSim164.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim164);

    Reponse reponseSim165 = new Reponse();
    reponseSim165.setIntitule("Évaluation de la matérialité financière : Nous avons identifié les risques et opportunités liés aux enjeux ESG ayant un impact significatif sur les revenus, les coûts et la valeur de l'entreprise (inondations, sécheresse, grèves, etc.).");
    reponseSim165.setScoreTotal(0.67);
    reponseSim165.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim165);

    Reponse reponseSim166 = new Reponse();
    reponseSim166.setIntitule("Rapport au conseil d'administration : Nous avons présenté les résultats de l'engagement des parties prenantes et des évaluations de matérialité au plus haut niveau de supervision de l'entreprise, tel que le conseil d'administration.");
    reponseSim166.setScoreTotal(0.67);
    reponseSim166.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim166);

    Reponse reponseSim167 = new Reponse();
    reponseSim167.setIntitule("Analyse comparative : Nous avons réalisé une analyse comparative avec les pairs de l'industrie pour identifier les questions matérielles communes et les défis spécifiques à l'industrie qui devraient être abordés par l'entreprise.");
    reponseSim167.setScoreTotal(0.67);
    reponseSim167.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim167);

    Reponse reponseSim168 = new Reponse();
    reponseSim168.setIntitule("Matrice de matérialité : Nous avons élaboré une matrice visuelle de matérialité qui illustre l'importance relative des différents enjeux ESG pour l'entreprise et ses parties prenantes, facilitant ainsi la priorisation des actions.");
    reponseSim168.setScoreTotal(0.67);
    reponseSim168.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim168);

    Reponse reponseSim169 = new Reponse();
    reponseSim169.setIntitule("Collaboration avec des experts externes : Nous avons travaillé avec des experts externes en matière de durabilité pour auditer et valider nos analyses, assurant ainsi la crédibilité et l'exactitude des évaluations.");
    reponseSim169.setScoreTotal(0.67);
    reponseSim169.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim169);

    Reponse reponseSim170 = new Reponse();
    reponseSim170.setIntitule("Intégration stratégique : Nous avons intégré les évaluations de la matérialité d'impact et financière dans la stratégie globale de l'entreprise, incluant les processus de gestion des risques et les plans d'action pour atténuer les risques identifiés.");
    reponseSim170.setScoreTotal(0.67);
    reponseSim170.setScoreEngagement(0.17);
    reponseRepository.save(reponseSim170);

    Reponse reponseSim171 = new Reponse();
    reponseSim171.setIntitule("Aucune de ces réponses.");
    reponseSim171.setScoreTotal(0.0);
    reponseSim171.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim171);

    Reponse reponseSim172 = new Reponse();
    reponseSim172.setIntitule("N/A");
    reponseSim172.setScoreTotal(2.67);
    reponseSim172.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim172);

    // question 78
    Reponse reponseSim173 = new Reponse();
    reponseSim173.setIntitule("Notre consommation d'énergie, notre stratégie et nos pratiques pour la réduire.");
    reponseSim173.setScoreTotal(0.19);
    reponseSim173.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim173);

    Reponse reponseSim174 = new Reponse();
    reponseSim174.setIntitule("Notre empreinte carbone, notre stratégie et nos pratiques pour la réduire.");
    reponseSim174.setScoreTotal(0.19);
    reponseSim174.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim174);

    Reponse reponseSim175 = new Reponse();
    reponseSim175.setIntitule("Notre politique d'achat responsable.");
    reponseSim175.setScoreTotal(0.19);
    reponseSim175.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim175);

    Reponse reponseSim176 = new Reponse();
    reponseSim176.setIntitule("Notre consommation d'eau, notre stratégie et nos pratiques pour la réduire.");
    reponseSim176.setScoreTotal(0.19);
    reponseSim176.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim176);

    Reponse reponseSim177 = new Reponse();
    reponseSim177.setIntitule("Notre production de déchets, notre stratégie et nos pratiques pour la réduire.");
    reponseSim177.setScoreTotal(0.19);
    reponseSim177.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim177);

    Reponse reponseSim178 = new Reponse();
    reponseSim178.setIntitule("Notre stratégie en matière de circularité et/ou biodiversité.");
    reponseSim178.setScoreTotal(0.19);
    reponseSim178.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim178);

    Reponse reponseSim179 = new Reponse();
    reponseSim179.setIntitule("L'impact de notre modèle d'affaires sur l'environnement.");
    reponseSim179.setScoreTotal(0.19);
    reponseSim179.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim179);

    Reponse reponseSim180 = new Reponse();
    reponseSim180.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim180.setScoreTotal(0.0);
    reponseSim180.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim180);

    Reponse reponseSim181 = new Reponse();
    reponseSim181.setIntitule("Aucune de ces réponses.");
    reponseSim181.setScoreTotal(0.0);
    reponseSim181.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim181);

    Reponse reponseSim182 = new Reponse();
    reponseSim182.setIntitule("N/A");
    reponseSim182.setScoreTotal(1.14);
    reponseSim182.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim182);

    // question 79
    Reponse reponseSim183 = new Reponse();
    reponseSim183.setIntitule("Notre politique et nos performances en matière de promotion de la diversité et de l'inclusion.");
    reponseSim183.setScoreTotal(0.19);
    reponseSim183.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim183);

    Reponse reponseSim184 = new Reponse();
    reponseSim184.setIntitule("Notre politique et nos performances en matière de sécurité au travail.");
    reponseSim184.setScoreTotal(0.19);
    reponseSim184.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim184);

    Reponse reponseSim185 = new Reponse();
    reponseSim185.setIntitule("Notre politique et nos performances en matière de promotion de la santé et du bien-être.");
    reponseSim185.setScoreTotal(0.19);
    reponseSim185.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim185);

    Reponse reponseSim186 = new Reponse();
    reponseSim186.setIntitule("Notre politique et nos performances en matière d'engagement civique");
    reponseSim186.setScoreTotal(0.19);
    reponseSim186.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim186);

    Reponse reponseSim187 = new Reponse();
    reponseSim187.setIntitule("L'impact de notre modèle d'affaires sur la société.");
    reponseSim187.setScoreTotal(0.19);
    reponseSim187.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim187);

    Reponse reponseSim188 = new Reponse();
    reponseSim188.setIntitule("Notre politique de formation et de développement des compétences");
    reponseSim188.setScoreTotal(0.19);
    reponseSim188.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim188);

    Reponse reponseSim189 = new Reponse();
    reponseSim189.setIntitule("Le taux de satisfaction ou d'engagement de nos équipes");
    reponseSim189.setScoreTotal(0.19);
    reponseSim189.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim189);

    Reponse reponseSim190 = new Reponse();
    reponseSim190.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim190.setScoreTotal(0.0);
    reponseSim190.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim190);

    Reponse reponseSim191 = new Reponse();
    reponseSim191.setIntitule("Aucune de ces réponses");
    reponseSim191.setScoreTotal(0.0);
    reponseSim191.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim191);

    // question 80
    Reponse reponseSim192 = new Reponse();
    reponseSim192.setIntitule("La composition du conseil d'administration.");
    reponseSim192.setScoreTotal(0.19);
    reponseSim192.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim192);

    Reponse reponseSim193 = new Reponse();
    reponseSim193.setIntitule("L'organigramme de l'équipe.");
    reponseSim193.setScoreTotal(0.19);
    reponseSim193.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim193);

    Reponse reponseSim194 = new Reponse();
    reponseSim194.setIntitule("Les résultats financiers (au moins transparents pour les travailleur·euses).");
    reponseSim194.setScoreTotal(0.19);
    reponseSim194.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim194);

    Reponse reponseSim195 = new Reponse();
    reponseSim195.setIntitule("La mission formelle et écrite.");
    reponseSim195.setScoreTotal(0.19);
    reponseSim195.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim195);

    Reponse reponseSim196 = new Reponse();
    reponseSim196.setIntitule("L'intégration de nos parties prenantes dans la gestion et la stratégie d'impact (informations sur la manière dont l'entreprise engage le dialogue avec ses parties prenantes (client·es, employé·es, actionnaires, communautés locales), et comment nous intégrons leurs attentes dans notre stratégie.");
    reponseSim196.setScoreTotal(0.19);
    reponseSim196.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim196);

    Reponse reponseSim197 = new Reponse();
    reponseSim197.setIntitule("Les Objectifs de Développement Durable auxquels nous contribuons directement et indirectement.");
    reponseSim197.setScoreTotal(0.19);
    reponseSim197.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim197);

    Reponse reponseSim198 = new Reponse();
    reponseSim198.setIntitule("Notre politique en matière de gestion et de protection des données (site web : cookies, guide d'utilisation, RGPD).");
    reponseSim198.setScoreTotal(0.19);
    reponseSim198.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim198);

    Reponse reponseSim199 = new Reponse();
    reponseSim199.setIntitule("Le taux de satisfaction de nos clients.");
    reponseSim199.setScoreTotal(0.19);
    reponseSim199.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim199);

    Reponse reponseSim200 = new Reponse();
    reponseSim200.setIntitule("Autre : veuillez expliquer dans les commentaires.");
    reponseSim200.setScoreTotal(0.0);
    reponseSim200.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim200);

    Reponse reponseSim201 = new Reponse();
    reponseSim201.setIntitule("Aucune de ces réponses.");
    reponseSim201.setScoreTotal(0.0);
    reponseSim201.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim201);

    // question 81
    Reponse reponseSim202 = new Reponse();
    reponseSim202.setIntitule("Nous n'avons pas de rapport d'impact.");
    reponseSim202.setScoreTotal(0.0);
    reponseSim202.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim202);

    Reponse reponseSim203 = new Reponse();
    reponseSim203.setIntitule("Élaborer un rapport complet de durabilité qui divulgue de manière transparente les impacts, les performances et les progrès de l'entreprise sur les questions importantes.");
    reponseSim203.setScoreTotal(0.19);
    reponseSim203.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim203);

    Reponse reponseSim204 = new Reponse();
    reponseSim204.setIntitule("Élaborer un rapport intégré, qui combine les informations financières et de développement durable d'une manière holistique afin de fournir une image plus complète de la performance de l'entreprise.");
    reponseSim204.setScoreTotal(0.19);
    reponseSim204.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim204);

    Reponse reponseSim205 = new Reponse();
    reponseSim205.setIntitule("Aligner les rapports sur le développement durable sur les objectifs de développement durable des Nations unies, en montrant comment les activités de l'entreprise contribuent à des objectifs mondiaux plus larges.");
    reponseSim205.setScoreTotal(0.19);
    reponseSim205.setScoreEngagement(0.05);
    reponseSim205.setEstEngageForce(true);
    reponseRepository.save(reponseSim205);

    Reponse reponseSim206 = new Reponse();
    reponseSim206.setIntitule("Obtenir l'assurance d'une tierce partie pour les rapports sur le développement durable afin de renforcer la crédibilité et de démontrer l'engagement de l'entreprise en faveur de la transparence.");
    reponseSim206.setScoreTotal(0.19);
    reponseSim206.setScoreEngagement(0.05);
    reponseRepository.save(reponseSim206);

    // question 82
    Reponse reponseSim207 = new Reponse();
    reponseSim207.setIntitule("Code de conduite éthique : déclaration écrite claire de la mission de l'organisation, ses valeurs et ses principes éthiques, sa politique de conduite éthique des affaires, le respect des droits de l'homme, les normes de travail équitables, sa politique pour adopter un comportement responsable à l'égard des parties prenantes, y compris les client·es, les travailleur·euses, les fournisseurs et les communautés locales.");
    reponseSim207.setScoreTotal(0.42);
    reponseSim207.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim207);

    Reponse reponseSim208 = new Reponse();
    reponseSim208.setIntitule("Code de conduite interne : déclaration écrite sur les normes de conduite professionnelle attendues de tous·tes les travailleur·euses, y compris l'interdiction de comportements inappropriés tels que la fraude, la corruption, le harcèlement et la discrimination.");
    reponseSim208.setScoreTotal(0.42);
    reponseSim208.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim208);

    Reponse reponseSim209 = new Reponse();
    reponseSim209.setIntitule("Charte sur les conflits d'intérêts : déclaration écrite des politiques d'identification et de gestion des conflits d'intérêts potentiels, et de divulgation transparente des relations financières et personnelles susceptibles d'influencer les décisions de l'entreprise.");
    reponseSim209.setScoreTotal(0.42);
    reponseSim209.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim209);

    Reponse reponseSim210 = new Reponse();
    reponseSim210.setIntitule("Charte de lanceur d'alerte : déclaration écrite encadrant les modalités par lesquelles les employés ou parties prenantes peuvent signaler des comportements illégaux, contraires à l'éthique ou mettant en danger l'intérêt général, tout en garantissant leur protection contre d'éventuelles représailles.");
    reponseSim210.setScoreTotal(0.42);
    reponseSim210.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim210);

    Reponse reponseSim211 = new Reponse();
    reponseSim211.setIntitule("Protection des données et de la vie privée : déclaration écrite et partagée sur la confidentialité et la protection des informations sensibles des client·es, des travailleur·euses et de l'entreprise, conformément aux lois et réglementations en matière de protection des données.");
    reponseSim211.setScoreTotal(0.42);
    reponseSim211.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim211);

    Reponse reponseSim212 = new Reponse();
    reponseSim212.setIntitule("Charte Diversité et Inclusion : déclaration écrite et partagée formalisant l'engagement de votre organisation à promouvoir l'égalité des chances, à valoriser la diversité et à créer un environnement inclusif, respectueux et exempt de discrimination.");
    reponseSim212.setScoreTotal(0.42);
    reponseSim212.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim212);

    Reponse reponseSim213 = new Reponse();
    reponseSim213.setIntitule("Charte d'engagement civique : déclaration écrite et partagée qui exprime les principes et actions par lesquels une organisation et ses membres s’engagent à contribuer positivement à la société, par le biais d'actions concrètes ou de philantropie.");
    reponseSim213.setScoreTotal(0.42);
    reponseSim213.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim213);

    Reponse reponseSim214 = new Reponse();
    reponseSim214.setIntitule("Code de conduite Fournisseurs : déclaration écrite et partagée avec les fournisseurs qui définit les standards éthiques, sociaux et environnementaux que les fournisseurs de votre organisation doivent respecter dans le cadre de leur collaboration.");
    reponseSim214.setScoreTotal(0.42);
    reponseSim214.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim214);

    Reponse reponseSim215 = new Reponse();
    reponseSim215.setIntitule("Politique de télétravail : déclaration écrite et partagée pour promouvoir les bonnes pratiques pour gérer l'impact écologique généré par le travail à distance, incluant la consommation d'énergie domestique, l'utilisation des équipements numériques, les déchets électroniques et la réduction des déplacements professionnels.");
    reponseSim215.setScoreTotal(0.42);
    reponseSim215.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim215);

    Reponse reponseSim216 = new Reponse();
    reponseSim216.setIntitule("Charte d'achat responsable : déclaration écrite et partagée qui formalise les engagements d'une organisation à intégrer des critères éthiques, sociaux et environnementaux dans ses pratiques d'approvisionnement et ses relations avec les fournisseurs.");
    reponseSim216.setScoreTotal(0.42);
    reponseSim216.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim216);

    Reponse reponseSim217 = new Reponse();
    reponseSim217.setIntitule("Politique sur le marketing éthique : déclaration écrite et partagée qui établit les principes et pratiques d'une organisation pour promouvoir ses produits ou services de manière transparente, responsable et respectueuse des valeurs sociales, environnementales et des consommateurs.");
    reponseSim217.setScoreTotal(0.42);
    reponseSim217.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim217);

    Reponse reponseSim218 = new Reponse();
    reponseSim218.setIntitule("Charte sur les clients des secteurs controversés : déclaration écrite et partagée au sein de l'entreprise, définissant les critères éthiques et responsables qui guident l'acceptation ou le rejet de partenariats avec des entreprises évoluant dans des secteurs jugés socialement, écologiquement ou économiquement problématiques.");
    reponseSim218.setScoreTotal(0.42);
    reponseSim218.setScoreEngagement(0.10);
    reponseRepository.save(reponseSim218);

    Reponse reponseSim219 = new Reponse();
    reponseSim219.setIntitule("Aucune des réponses ci-dessus.");
    reponseSim219.setScoreTotal(0.0);
    reponseSim219.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim219);

    // question 83
    Reponse reponseSim220 = new Reponse();
    reponseSim220.setIntitule("Une déclaration claire de l'engagement de l'entreprise à prévenir et combattre la corruption sous toutes ses formes.");
    reponseSim220.setScoreTotal(1.60);
    reponseSim220.setScoreEngagement(0.40);
    reponseRepository.save(reponseSim220);

    Reponse reponseSim221 = new Reponse();
    reponseSim221.setIntitule("Des lignes directrices sur l'acceptation et l'offre de cadeaux, divertissements et hospitalités, conformément aux normes légales et éthiques.");
    reponseSim221.setScoreTotal(1.60);
    reponseSim221.setScoreEngagement(0.40);
    reponseRepository.save(reponseSim221);

    Reponse reponseSim222 = new Reponse();
    reponseSim222.setIntitule("Des formations régulières et des programmes de sensibilisation pour éduquer les employé·es sur les politiques anti-corruption et leurs responsabilités.");
    reponseSim222.setScoreTotal(1.60);
    reponseSim222.setScoreEngagement(0.40);
    reponseRepository.save(reponseSim222);

    Reponse reponseSim223 = new Reponse();
    reponseSim223.setIntitule("Des mécanismes de signalement et une protection pour les personnes signalant des soupçons de corruption.");
    reponseSim223.setScoreTotal(1.60);
    reponseSim223.setScoreEngagement(0.40);
    reponseRepository.save(reponseSim223);

    Reponse reponseSim224 = new Reponse();
    reponseSim224.setIntitule("Des procédures de vérification préalable (due diligence) sur les partenaires commerciaux, agents et tiers pour atténuer les risques de corruption.");
    reponseSim224.setScoreTotal(1.60);
    reponseSim224.setScoreEngagement(0.40);
    reponseRepository.save(reponseSim224);

    Reponse reponseSim225 = new Reponse();
    reponseSim225.setIntitule("Des contrôles internes et des mécanismes de suivi pour détecter et prévenir les pratiques de corruption.");
    reponseSim225.setScoreTotal(2.00);
    reponseSim225.setScoreEngagement(0.50);
    reponseRepository.save(reponseSim225);

    Reponse reponseSim226 = new Reponse();
    reponseSim226.setIntitule("Aucune des réponses ci-dessus");
    reponseSim226.setScoreTotal(0.00);
    reponseSim226.setScoreEngagement(0.00);
    reponseRepository.save(reponseSim226);

    Reponse reponseSim227 = new Reponse();
    reponseSim227.setIntitule("N/A");
    reponseSim227.setScoreTotal(5.0);
    reponseSim227.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim227);

    // question 84
    Reponse reponseSim228 = new Reponse();
    reponseSim228.setIntitule("Plainte pour harcèlement ou discrimination");
    reponseSim228.setScoreTotal(0.0);
    reponseSim228.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim228);

    Reponse reponseSim229 = new Reponse();
    reponseSim229.setIntitule("Litige relatif à l'**éthique des affaires**");
    reponseSim229.setScoreTotal(0.0);
    reponseSim229.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim229);

    Reponse reponseSim230 = new Reponse();
    reponseSim230.setIntitule("Litige social");
    reponseSim230.setScoreTotal(0.0);
    reponseSim230.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim230);

    Reponse reponseSim231 = new Reponse();
    reponseSim231.setIntitule("Grèves");
    reponseSim231.setScoreTotal(0.0);
    reponseSim231.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim231);

    Reponse reponseSim232 = new Reponse();
    reponseSim232.setIntitule("Autre : préciser");
    reponseSim232.setScoreTotal(0.0);
    reponseSim232.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim232);

    Reponse reponseSim233 = new Reponse();
    reponseSim233.setIntitule("Non");
    reponseSim233.setScoreTotal(0.0);
    reponseSim233.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim233);

    // question 85
    Reponse reponseSim234 = new Reponse();
    reponseSim234.setIntitule("Non");
    reponseSim234.setScoreTotal(0.0);
    reponseSim234.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim234);

    Reponse reponseSim235 = new Reponse();
    reponseSim235.setIntitule("Oui : préciser");
    reponseSim235.setScoreTotal(0.0);
    reponseSim235.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim235);

    // question 86
    Reponse reponseSim236 = new Reponse();
    reponseSim236.setIntitule("Tous·tes les travailleur·euses ayant accès aux données sont formé·es aux politiques de confidentialité des données (protection des informations sensibles, la prévention des fuites de données et le respect des réglementations en vigueur.");
    reponseSim236.setScoreTotal(1.14);
    reponseSim236.setScoreEngagement(0.23);
    reponseSim236.setEstEngageForce(true);
    reponseRepository.save(reponseSim236);

    Reponse reponseSim237 = new Reponse();
    reponseSim237.setIntitule("La désignation d'un.e responsabla à la protection des données (DPO - Data Protection Officer).");
    reponseSim237.setScoreTotal(1.14);
    reponseSim237.setScoreEngagement(0.23);
    reponseRepository.save(reponseSim237);

    Reponse reponseSim238 = new Reponse();
    reponseSim238.setIntitule("Une politique de cybersécurité clairement définie incluant notamment l'identification des cyber-risques.");
    reponseSim238.setScoreTotal(1.14);
    reponseSim238.setScoreEngagement(0.23);
    reponseRepository.save(reponseSim238);

    Reponse reponseSim239 = new Reponse();
    reponseSim239.setIntitule("La réalisation d'audits externes incluant notamment des test de phishing, d'intrusion et de piratage de la sécurité des données.");
    reponseSim239.setScoreTotal(2.0);
    reponseSim239.setScoreEngagement(0.50);
    reponseRepository.save(reponseSim239);

    Reponse reponseSim240 = new Reponse();
    reponseSim240.setIntitule("Une couverture d'assurance contre le cyber-risques.");
    reponseSim240.setScoreTotal(1.14);
    reponseSim240.setScoreEngagement(0.23);
    reponseRepository.save(reponseSim240);

    Reponse reponseSim241 = new Reponse();
    reponseSim241.setIntitule("Aucune de ces réponses.");
    reponseSim241.setScoreTotal(0.0);
    reponseSim241.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim241);

    Reponse reponseSim242 = new Reponse();
    reponseSim242.setIntitule("N/A");
    reponseSim242.setScoreTotal(3.23);
    reponseSim242.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim242);

    // question 87
    Reponse reponseSim243 = new Reponse();
    reponseSim243.setIntitule("Nous avons mis en place quelques mesures de base mais nous ne disposons pas d'une politique de protection de la vie privée formelle.");
    reponseSim243.setScoreTotal(1.14);
    reponseSim243.setScoreEngagement(0.23);
    reponseRepository.save(reponseSim243);

    Reponse reponseSim244 = new Reponse();
    reponseSim244.setIntitule("Nous avons formalisé la politique de protection de la vie privée avec une déclaration claire sur notre engagement à protéger la vie privée et la confidentialité des informations personnelles.");
    reponseSim244.setScoreTotal(1.14);
    reponseSim244.setScoreEngagement(0.23);
    reponseRepository.save(reponseSim244);

    Reponse reponseSim245 = new Reponse();
    reponseSim245.setIntitule("Nous contrôlons, révisons et mettons à jour continuellement la politique pour faire face aux risques émergents et à l'évolution des exigences réglementaires. ");
    reponseSim245.setScoreTotal(1.14);
    reponseSim245.setScoreEngagement(0.23);
    reponseRepository.save(reponseSim245);

    Reponse reponseSim246 = new Reponse();
    reponseSim246.setIntitule("Aucune de ces réponses.");
    reponseSim246.setScoreTotal(0.0);
    reponseSim246.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim246);

    Reponse reponseSim247 = new Reponse();
    reponseSim247.setIntitule("N/A");
    reponseSim247.setScoreTotal(1.71);
    reponseSim247.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim247);

    // question 88
    Reponse reponseSim248 = new Reponse();
    reponseSim248.setIntitule("Oui");
    reponseSim248.setScoreTotal(0.0);
    reponseSim248.setScoreEngagement(0.0);
    reponseSim248.setEstEngageForce(true);
    reponseRepository.save(reponseSim248);

    Reponse reponseSim249 = new Reponse();
    reponseSim249.setIntitule("Non");
    reponseSim249.setScoreTotal(0.0);
    reponseSim249.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim249);

    Reponse reponseSim250 = new Reponse();
    reponseSim250.setIntitule("Je ne sais pas ");
    reponseSim250.setScoreTotal(0.0);
    reponseSim250.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim250);

    // question 89
    Reponse reponseSim251 = new Reponse();
    reponseSim251.setIntitule("0%");
    reponseSim251.setScoreTotal(0.0);
    reponseSim251.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim251);

    Reponse reponseSim252 = new Reponse();
    reponseSim252.setIntitule("1-24%");
    reponseSim252.setScoreTotal(0.0);
    reponseSim252.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim252);

    Reponse reponseSim253 = new Reponse();
    reponseSim253.setIntitule("25-49%");
    reponseSim253.setScoreTotal(0.0);
    reponseSim253.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim253);

    Reponse reponseSim254 = new Reponse();
    reponseSim254.setIntitule("50-74%");
    reponseSim254.setScoreTotal(2.50);
    reponseSim254.setScoreEngagement(0.63);
    reponseRepository.save(reponseSim254);

    Reponse reponseSim255 = new Reponse();
    reponseSim255.setIntitule("75-100%");
    reponseSim255.setScoreTotal(5.0);
    reponseSim255.setScoreEngagement(1.25);
    reponseRepository.save(reponseSim255);

    Reponse reponseSim256 = new Reponse();
    reponseSim256.setIntitule("Précisez le nom de l'organisme et/ou label : ");
    reponseSim256.setScoreTotal(0.0);
    reponseSim256.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim256);

    Reponse reponseSim257 = new Reponse();
    reponseSim257.setIntitule("N/A");
    reponseSim257.setScoreTotal(2.50);
    reponseSim257.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim257);

    // question 90
    Reponse reponseSim258 = new Reponse();
    reponseSim258.setIntitule("Benefit Corporation (B Corp) ");
    reponseSim258.setScoreTotal(5.0);
    reponseSim258.setScoreEngagement(1.25);
    reponseRepository.save(reponseSim258);

    Reponse reponseSim259 = new Reponse();
    reponseSim259.setIntitule("EMAS ou ISO 14001 - Système de management environnemental ");
    reponseSim259.setScoreTotal(5.0);
    reponseSim259.setScoreEngagement(1.25);
    reponseRepository.save(reponseSim259);

    Reponse reponseSim260 = new Reponse();
    reponseSim260.setIntitule("ISO 26000 -  Responsabilité sociétale ");
    reponseSim260.setScoreTotal(5.0);
    reponseSim260.setScoreEngagement(1.25);
    reponseRepository.save(reponseSim260);

    Reponse reponseSim261 = new Reponse();
    reponseSim261.setIntitule("ISO 9001 - Système de management de qualité");
    reponseSim261.setScoreTotal(5.0);
    reponseSim261.setScoreEngagement(1.25);
    reponseRepository.save(reponseSim261);

    Reponse reponseSim262 = new Reponse();
    reponseSim262.setIntitule("Label Diversité et Inclusion");
    reponseSim262.setScoreTotal(5.0);
    reponseSim262.setScoreEngagement(1.25);
    reponseRepository.save(reponseSim262);

    Reponse reponseSim263 = new Reponse();
    reponseSim263.setIntitule("Autre : veuillez préciser dans les commentaires.");
    reponseSim263.setScoreTotal(0.0);
    reponseSim263.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim263);

    Reponse reponseSim264 = new Reponse();
    reponseSim264.setIntitule("Non");
    reponseSim264.setScoreTotal(0.0);
    reponseSim264.setScoreEngagement(0.0);
    reponseRepository.save(reponseSim264);


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
    question1.setTemplate(Templates.ALL);
    questionRepository.save(question1);

    Question question2 = new Question();
    question2.setIntitule("Si vous la suivez, veuillez indiquer votre consommation d'énergie totale des 12 derniers mois (en kWh)");
    question2.setReponses(new ArrayList<>());
    question2.setNbrChoixMax(1);
    question2.setEstQuestionLibre(true);
    question2.setNombrePointMax(0);
    question2.setEnjeuxPrincipal("Energie & carbone");
    question2.setEnjeuxSecondaire("gestion de l'energie");
    question2.setCategorie(Question.CATEGORIE.Environment);
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
    question7.setTemplate(Templates.ALL);
    questionRepository.save(question7);

    Question question8 = new Question();
    question8.setIntitule("Si vous la calculez, veuillez indiquer votre empreinte carbone de Scope 1 (en tonnes de CO2 équivalent) :");
    question8.setReponses(new ArrayList<>());
    question8.setNbrChoixMax(1);
    question8.setEstQuestionLibre(true);
    question8.setNombrePointMax(0);
    question8.setEnjeuxPrincipal("Energie & carbone");
    question8.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question8.setCategorie(Question.CATEGORIE.Environment);
    question8.setTemplate(Templates.ALL);
    questionRepository.save(question8);

    Question question9 = new Question();
    question9.setIntitule("Si vous la calculez, veuillez indiquer votre empreinte carbone de Scope 2 (en tonnes de CO2 équivalent) :");
    question9.setReponses(new ArrayList<>());
    question9.setNbrChoixMax(1);
    question9.setEstQuestionLibre(true);
    question9.setNombrePointMax(0);
    question9.setEnjeuxPrincipal("Energie & carbone");
    question9.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question9.setCategorie(Question.CATEGORIE.Environment);
    question9.setTemplate(Templates.ALL);
    questionRepository.save(question9);

    Question question10 = new Question();
    question10.setIntitule("Si vous la calculez, veuillez indiquer votre empreinte carbone de Scope 3 (en tonnes de CO2 équivalent) :");
    question10.setReponses(new ArrayList<>());
    question10.setNbrChoixMax(1);
    question10.setEstQuestionLibre(true);
    question10.setNombrePointMax(0);
    question10.setEnjeuxPrincipal("Energie & carbone");
    question10.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question10.setCategorie(Question.CATEGORIE.Environment);
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
    question11.setTemplate(Templates.ALL);
    questionRepository.save(question11);

    Question question12 = new Question();
    question12.setIntitule("Quelle(s) pratique(s) avez-vous mise(s) en place pour limiter votre empreinte carbone ?");
    question12.setReponses(List.of(reponse37,reponse38,reponse39,reponse40,reponse40Bis,reponse41));
    question12.setNbrChoixMax(4);
    question12.setEstQuestionLibre(false);
    question12.setNombrePointMax(0.63);
    question12.setEnjeuxPrincipal("Energie & carbone");
    question12.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question12.setCategorie(Question.CATEGORIE.Environment);
    question12.setTemplate(Templates.ALL);
    questionRepository.save(question12);

    Question question13 = new Question();
    question13.setIntitule("Proposez-vous des ateliers de sensibilisation et des formations sur les émissions de gaz à effet de serre à destination de vos travailleur·euses ? (par exemple, la fresque du climat)");
    question13.setReponses(List.of(reponse42,reponse43,reponse44));
    question13.setNbrChoixMax(1);
    question13.setEstQuestionLibre(false);
    question13.setNombrePointMax(0.21);
    question13.setEnjeuxPrincipal("Energie & carbone");
    question13.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question13.setCategorie(Question.CATEGORIE.Environment);
    question13.setTemplate(Templates.WORKERS);
    questionRepository.save(question13);

    Question question14 = new Question();
    question14.setIntitule("Quel pourcentage de vos fournisseurs (en valeur monétaire) se trouvent à moins de 80 km de vos installations ?");
    question14.setReponses(List.of(reponse45,reponse46,reponse47,reponse48,reponse49,reponse50));
    question14.setNbrChoixMax(1);
    question14.setEstQuestionLibre(false);
    question14.setNombrePointMax(0.21);
    question14.setEnjeuxPrincipal("Energie & carbone");
    question14.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question14.setCategorie(Question.CATEGORIE.Environment);
    question14.setTemplate(Templates.ALL);
    questionRepository.save(question14);

    Question question15 = new Question();
    question15.setIntitule("Quel pourcentage de votre transport amont et aval (approvisionnement et livraison) est effectué à l'aide de modes de transport à faibles émissions de carbone (par exemple, vélo-cargo, train, voilier, etc.) ?");
    question15.setReponses(List.of(reponse51,reponse52,reponse53,reponse54,reponse55,reponse56,reponse57));
    question15.setNbrChoixMax(1);
    question15.setEstQuestionLibre(false);
    question15.setNombrePointMax(0.21);
    question15.setEnjeuxPrincipal("Energie & carbone");
    question15.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question15.setCategorie(Question.CATEGORIE.Environment);
    question15.setTemplate(Templates.PRODUITS);
    questionRepository.save(question15);

    Question question16 = new Question();
    question16.setIntitule("Avez-vous optimisé votre chaîne de valeur afin de réduire les distances de transport, par exemple en rapprochant vos fournisseurs, en centralisant vos sites de production ou en réorganisant vos réseaux de distribution ?");
    question16.setReponses(List.of(reponse58,reponse59,reponse60,reponse61));
    question16.setNbrChoixMax(1);
    question16.setEstQuestionLibre(false);
    question16.setNombrePointMax(0.21);
    question16.setEnjeuxPrincipal("Energie & carbone");
    question16.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question16.setCategorie(Question.CATEGORIE.Environment);
    question16.setTemplate(Templates.PRODUITS);
    questionRepository.save(question16);

    Question question17 = new Question();
    question17.setIntitule("Quelle(s) mesure(s) avez-vous prise(s) avec vos fournisseurs pour limiter les émissions carbones liées à votre chaine d'approvisionnement ?");
    question17.setReponses(List.of(reponse62,reponse63,reponse64,reponse65,reponse66,reponse67,reponse68,reponse69,reponse70));
    question17.setNbrChoixMax(8);
    question17.setEstQuestionLibre(false);
    question17.setNombrePointMax(1.26);
    question17.setEnjeuxPrincipal("Energie & carbone");
    question17.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question17.setCategorie(Question.CATEGORIE.Environment);
    question17.setTemplate(Templates.ALL);
    questionRepository.save(question17);

    Question question18 = new Question();
    question18.setIntitule("Mesurez-vous la consommation d'eau de XXX ?");
    question18.setReponses(List.of(reponse71,reponse72,reponse73));
    question18.setNbrChoixMax(1);
    question18.setEstQuestionLibre(false);
    question18.setNombrePointMax(1);
    question18.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question18.setEnjeuxSecondaire("EAU");
    question18.setCategorie(Question.CATEGORIE.Environment);
    question18.setTemplate(Templates.FACILITY);
    questionRepository.save(question18);

    Question question19 = new Question();
    question19.setIntitule("Si vous la mesurez, veuillez indiquer votre consommation d'eau (en litres) :");
    question19.setReponses(new ArrayList<>());
    question19.setNbrChoixMax(1);
    question19.setEstQuestionLibre(true);
    question19.setNombrePointMax(0);
    question19.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question19.setEnjeuxSecondaire("EAU");
    question19.setCategorie(Question.CATEGORIE.Environment);
    question19.setTemplate(Templates.FACILITY);
    questionRepository.save(question19);

    Question question20 = new Question();
    question20.setIntitule("Qu'avez-vous mis en place pour limiter votre consommation d'eau ? Veuillez sélectionner toutes les réponses applicables.");
    question20.setReponses(List.of(reponse75,reponse76,reponse77,reponse78,reponse79,reponse80,reponse81,reponse82));
    question20.setNbrChoixMax(6);
    question20.setEstQuestionLibre(false);
    question20.setNombrePointMax(2.22);
    question20.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question20.setEnjeuxSecondaire("EAU");
    question20.setCategorie(Question.CATEGORIE.Environment);
    question20.setTemplate(Templates.FACILITY);
    questionRepository.save(question20);

    Question question21 = new Question();
    question21.setIntitule("Avez-vous mis en place des initiatives pour sensibiliser vos travailleur·euses à la gestion de l'eau et à sa consommation ?");
    question21.setReponses(List.of(reponse83,reponse84,reponse85));
    question21.setNbrChoixMax(1);
    question21.setEstQuestionLibre(false);
    question21.setNombrePointMax(0.44);
    question21.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question21.setEnjeuxSecondaire("EAU");
    question21.setCategorie(Question.CATEGORIE.Environment);
    question21.setTemplate(Templates.WORKERS);
    questionRepository.save(question21);

    Question question22 = new Question();
    question22.setIntitule("XXX a-t-elle pris l'une ou plusieurs de ces mesures concernant la consommation d'eau dans sa chaine d'approvisionnement ?");
    question22.setReponses(List.of(reponse86,reponse87,reponse88,reponse89,reponse90,reponse91));
    question22.setNbrChoixMax(4);
    question22.setEstQuestionLibre(false);
    question22.setNombrePointMax(1.33);
    question22.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question22.setEnjeuxSecondaire("EAU");
    question22.setCategorie(Question.CATEGORIE.Environment);
    question22.setTemplate(Templates.ALL);
    questionRepository.save(question22);

    Question question23 = new Question();
    question23.setIntitule("XXX a-t-elle pris l'une ou plusieurs de ces mesures concernant l'utilisation des ressources ?");
    question23.setReponses(List.of(reponse92,reponse93,reponse94,reponse95,reponse96,reponse97));
    question23.setNbrChoixMax(4);
    question23.setEstQuestionLibre(false);
    question23.setNombrePointMax(3);
    question23.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question23.setEnjeuxSecondaire("MATIERES PREMIERES ET FOURNITURES");
    question23.setCategorie(Question.CATEGORIE.Environment);
    question23.setTemplate(Templates.PRODUITS);
    questionRepository.save(question23);

    Question question24 = new Question();
    question24.setIntitule("Avez-vous mis en place des initiatives pour sensibiliser vos travailleur·euses à l'utilisation des ressources ?");
    question24.setReponses(List.of(reponse98,reponse99,reponse100));
    question24.setNbrChoixMax(1);
    question24.setEstQuestionLibre(false);
    question24.setNombrePointMax(1);
    question24.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question24.setEnjeuxSecondaire("MATIERES PREMIERES ET FOURNITURES");
    question24.setCategorie(Question.CATEGORIE.Environment);
    question24.setTemplate(Templates.WORKERS);
    questionRepository.save(question24);

    Question question25 = new Question();
    question25.setIntitule("Quel pourcentage de vos matériaux (en volume) provient de matériaux recyclés, de composants réutilisés et/ou de matériaux certifiés d'origine durable ?");
    question25.setReponses(List.of(reponse101,reponse102,reponse103,reponse104,reponse105,reponse106,reponse107));
    question25.setNbrChoixMax(1);
    question25.setEstQuestionLibre(false);
    question25.setNombrePointMax(1);
    question25.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question25.setEnjeuxSecondaire("MATIERES PREMIERES ET FOURNITURES");
    question25.setCategorie(Question.CATEGORIE.Environment);
    question25.setTemplate(Templates.PRODUITS);
    questionRepository.save(question25);

    Question question26 = new Question();
    question26.setIntitule("Suivez-vous les quantités et les types de déchets produits par XXX ?");
    question26.setReponses(List.of(reponse108,reponse109,reponse110));
    question26.setNbrChoixMax(1);
    question26.setEstQuestionLibre(false);
    question26.setNombrePointMax(1);
    question26.setEnjeuxPrincipal("DÉCHETS");
    question26.setEnjeuxSecondaire("DÉCHETS");
    question26.setCategorie(Question.CATEGORIE.Environment);
    question26.setTemplate(Templates.FACILITY);
    questionRepository.save(question26);

    Question question27 = new Question();
    question27.setIntitule("Si vous la suivez, veuillez indiquer la quantité totale de déchets produits par votre organisation au cours des 12 derniers mois (en tonnes) ?");
    question27.setReponses(new ArrayList<>());
    question27.setNbrChoixMax(1);
    question27.setEstQuestionLibre(true);
    question27.setNombrePointMax(0);
    question27.setEnjeuxPrincipal("DÉCHETS");
    question27.setEnjeuxSecondaire("DÉCHETS");
    question27.setCategorie(Question.CATEGORIE.Environment);
    question27.setTemplate(Templates.FACILITY);
    questionRepository.save(question27);

    Question question28 = new Question();
    question28.setIntitule("Si vous la suivez, veuillez indiquer la quantité de déchets dangereux produits par votre organisation au cours des 12 derniers mois (en tonnes) ?\n"
        + "(exemples de déchets dangereux : équipements électroniques, piles, cartouches d'encre, déchets industriels, batteries, peintures, etc.)");
    question28.setReponses(new ArrayList<>());
    question28.setNbrChoixMax(1);
    question28.setEstQuestionLibre(true);
    question28.setNombrePointMax(0);
    question28.setEnjeuxPrincipal("DÉCHETS");
    question28.setEnjeuxSecondaire("DÉCHETS");
    question28.setCategorie(Question.CATEGORIE.Environment);
    question28.setTemplate(Templates.FACILITY);
    questionRepository.save(question28);

    Question question29 = new Question();
    question29.setIntitule("Quelle(s) pratique(s) avez-vous mise(s) en place pour réduire la production de déchets et optimiser leur gestion ?");
    question29.setReponses(List.of(reponse111,reponse112,reponse113,reponse114,reponse115,
        reponse116,reponse117,reponse118,reponse119,reponse120,reponse121));
    question29.setNbrChoixMax(9);
    question29.setEstQuestionLibre(false);
    question29.setNombrePointMax(2.15);
    question29.setEnjeuxPrincipal("DÉCHETS");
    question29.setEnjeuxSecondaire("DÉCHETS");
    question29.setCategorie(Question.CATEGORIE.Environment);
    question29.setTemplate(Templates.FACILITY);
    questionRepository.save(question29);

    Question question30 = new Question();
    question30.setIntitule("Avez-vous mis en place des initiatives pour sensibiliser vos travailleur·euses à la réduction, la gestion et le recyclage des déchets ?");
    question30.setReponses(List.of(reponse122,reponse123,reponse124));
    question30.setNbrChoixMax(1);
    question30.setEstQuestionLibre(false);
    question30.setNombrePointMax(0.31);
    question30.setEnjeuxPrincipal("DÉCHETS");
    question30.setEnjeuxSecondaire("DÉCHETS");
    question30.setCategorie(Question.CATEGORIE.Environment);
    question30.setTemplate(Templates.WORKERS);
    questionRepository.save(question30);

    Question question31 = new Question();
    question31.setIntitule("Quelle(s) pratique(s) XXX a-t-elle mise(s) en place en matière d'économie circulaire pour limiter la production de déchets ?");
    question31.setReponses(List.of(reponse125,reponse126,reponse127,reponse128,reponse129,reponse130,reponse131,reponse132));
    question31.setNbrChoixMax(6);
    question31.setEstQuestionLibre(false);
    question31.setNombrePointMax(1.54);
    question31.setEnjeuxPrincipal("DÉCHETS");
    question31.setEnjeuxSecondaire("DÉCHETS");
    question31.setCategorie(Question.CATEGORIE.Environment);
    question31.setTemplate(Templates.PRODUITS);
    questionRepository.save(question31);

    Question question32 = new Question();
    question32.setIntitule("XXX a-t-elle mis en place une ou plusieurs initiatives visant à protéger les écosystèmes et préserver la biodiversité ?");
    question32.setReponses(List.of(reponse133,reponse134,reponse135,reponse136,reponse137,reponse138,reponse139,reponse140,reponse141));
    question32.setNbrChoixMax(7);
    question32.setEstQuestionLibre(false);
    question32.setNombrePointMax(4.33);
    question32.setEnjeuxPrincipal("ÉCOSYSTÈMES ET BIODIVERSITÉ");
    question32.setEnjeuxSecondaire("ÉCOSYSTÈMES ET BIODIVERSITÉ");
    question32.setCategorie(Question.CATEGORIE.Environment);
    question32.setTemplate(Templates.PRODUITS);
    questionRepository.save(question32);

    Question question33 = new Question();
    question33.setIntitule("Proposez-vous des ateliers de sensibilisation et des formations sur biodiversité à destination de vos travailleur·euses ?");
    question33.setReponses(List.of(reponse142,reponse143,reponse144));
    question33.setNbrChoixMax(1);
    question33.setEstQuestionLibre(false);
    question33.setNombrePointMax(0.67);
    question33.setEnjeuxPrincipal("ÉCOSYSTÈMES ET BIODIVERSITÉ");
    question33.setEnjeuxSecondaire("ÉCOSYSTÈMES ET BIODIVERSITÉ");
    question33.setCategorie(Question.CATEGORIE.Environment);
    question33.setTemplate(Templates.WORKERS);
    questionRepository.save(question33);

    Question question34 = new Question();
    question34.setIntitule("Comment XXX crée-t-elle un processus de recrutement et d'embauche inclusif ?");
    question34.setReponses(List.of(reponse145,reponse146,reponse147,reponse148,reponse149,reponse150,reponse151));
    question34.setNbrChoixMax(5);
    question34.setEstQuestionLibre(false);
    question34.setNombrePointMax(1.45);
    question34.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question34.setEnjeuxSecondaire("INCLUSION ET EQUITE");
    question34.setCategorie(CATEGORIE.Social);
    question34.setTemplate(Templates.WORKERS);
    questionRepository.save(question34);

    Question question35 = new Question();
    question35.setIntitule("Comment XXX crée-t-elle un processus de recrutement et d'embauche inclusif ?");
    question35.setReponses(List.of(reponse152,reponse153,reponse154,reponse155,reponse156,reponse157));
    question35.setNbrChoixMax(4);
    question35.setEstQuestionLibre(false);
    question35.setNombrePointMax(1.09);
    question35.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question35.setEnjeuxSecondaire("INCLUSION ET EQUITE");
    question35.setCategorie(CATEGORIE.Social);
    question35.setTemplate(Templates.WORKERS);
    questionRepository.save(question35);

    Question question36 = new Question();
    question36.setIntitule("En dehors du règlement de travail légal, quelles sont la ou les pratiques suivantes que XXX a mis en oeuvre en matière de diversité et d'inclusion  ?");
    question36.setReponses(List.of(reponse158,reponse159,reponse160,reponse161,reponse162,reponse163));
    question36.setNbrChoixMax(4);
    question36.setEstQuestionLibre(false);
    question36.setNombrePointMax(1.09);
    question36.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question36.setEnjeuxSecondaire("INCLUSION ET EQUITE");
    question36.setCategorie(CATEGORIE.Social);
    question36.setTemplate(Templates.WORKERS);
    questionRepository.save(question36);

    Question question37 = new Question();
    question37.setIntitule("Est-ce que XXX monitore les formations en matière de diversité et d'inclusion ?");
    question37.setReponses(List.of(reponse164,reponse165,reponse166));
    question37.setNbrChoixMax(1);
    question37.setEstQuestionLibre(false);
    question37.setNombrePointMax(1.09);
    question37.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question37.setEnjeuxSecondaire("INCLUSION ET EQUITE");
    question37.setCategorie(CATEGORIE.Social);
    question37.setTemplate(Templates.WORKERS);
    questionRepository.save(question37);

    Question question38 = new Question();
    question38.setIntitule("La politique salariale de XXX est-elle régulièrement examinée pour s'assurer que les travailleur·euses bénéficient d'un traitement égal pour un travail égal ?");
    question38.setReponses(List.of(reponse167,reponse168,reponse169));
    question38.setNbrChoixMax(1);
    question38.setEstQuestionLibre(false);
    question38.setNombrePointMax(0.63);
    question38.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question38.setEnjeuxSecondaire("INCLUSION ET EQUITE");
    question38.setCategorie(CATEGORIE.Social);
    question38.setTemplate(Templates.WORKERS);
    questionRepository.save(question38);

    Question question39 = new Question();
    question39.setIntitule("Quel est le multiple du salaire de la personne la mieux rémunérée, y compris les primes, par rapport à celui de la personne à temps plein la moins bien rémunérée ?");
    question39.setReponses(List.of(reponse170,reponse171,reponse172,reponse173,reponse174,reponse175));
    question39.setNbrChoixMax(1);
    question39.setEstQuestionLibre(false);
    question39.setNombrePointMax(0.14);
    question39.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question39.setEnjeuxSecondaire("INCLUSION ET EQUITE");
    question39.setCategorie(CATEGORIE.Social);
    question39.setTemplate(Templates.WORKERS);
    questionRepository.save(question39);

    Question question40 = new Question();
    question40.setIntitule("Quel pourcentage des travailleur·euses est âgé de moins de vingt-quatre ans ou de plus de cinquante ans ?");
    question40.setReponses(List.of(reponse176,reponse177,reponse178,reponse179,reponse180,reponse181));
    question40.setNbrChoixMax(1);
    question40.setEstQuestionLibre(false);
    question40.setNombrePointMax(0.14);
    question40.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question40.setEnjeuxSecondaire("DIVERSITE");
    question40.setCategorie(CATEGORIE.Social);
    question40.setTemplate(Templates.WORKERS);
    questionRepository.save(question40);

    Question question41 = new Question();
    question41.setIntitule("Quel est le pourcentage des ***cadres*** de XXX qui s'identifient comme femmes ?");
    question41.setReponses(List.of(reponse182,reponse183,reponse184,reponse185,reponse186,reponse187));
    question41.setNbrChoixMax(1);
    question41.setEstQuestionLibre(false);
    question41.setNombrePointMax(0.14);
    question41.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question41.setEnjeuxSecondaire("DIVERSITE");
    question41.setCategorie(CATEGORIE.Social);
    question41.setTemplate(Templates.WORKERS);
    questionRepository.save(question41);

    Question question42 = new Question();
    question42.setIntitule("Quel est le pourcentage des travailleur·euses de XXX qui s'identifient comme femmes ?");
    question42.setReponses(List.of(reponse182,reponse183,reponse184,reponse185,reponse186,reponse187));
    question42.setNbrChoixMax(1);
    question42.setEstQuestionLibre(false);
    question42.setNombrePointMax(0.14);
    question42.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question42.setEnjeuxSecondaire("DIVERSITE");
    question42.setCategorie(CATEGORIE.Social);
    question42.setTemplate(Templates.WORKERS);
    questionRepository.save(question42);

    Question question43 = new Question();
    question43.setIntitule("Quel pourcentage des travailleur·euses se considère comme appartenant à un groupe social sous-représenté (ex : personnes LGBTQIA+, issues de minorités ethniques, etc.)");
    question43.setReponses(List.of(reponse188,reponse189,reponse190,reponse191,reponse192,reponse193));
    question43.setNbrChoixMax(1);
    question43.setEstQuestionLibre(false);
    question43.setNombrePointMax(0.14);
    question43.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question43.setEnjeuxSecondaire("DIVERSITE");
    question43.setCategorie(CATEGORIE.Social);
    question43.setTemplate(Templates.WORKERS);
    questionRepository.save(question43);

    Question question44 = new Question();
    question44.setIntitule("Quel pourcentage des travailleur·euses de XXX fait partie d'un groupe souvent exclu du marché du travail (ex : personnes en situation de handicap, anciens détenus, jeunes demandeurs d'emploi, chômeurs de longue durée, etc.) ?");
    question44.setReponses(List.of(reponse188,reponse189,reponse190,reponse191,reponse192,reponse193));
    question44.setNbrChoixMax(1);
    question44.setEstQuestionLibre(false);
    question44.setNombrePointMax(0.14);
    question44.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question44.setEnjeuxSecondaire("DIVERSITE");
    question44.setCategorie(CATEGORIE.Social);
    question44.setTemplate(Templates.WORKERS);
    questionRepository.save(question44);

    Question question45 = new Question();
    question45.setIntitule("Comment XXX démontre-t-elle son engagement à garantir la santé et la sécurité des travailleur·euses, en allant au-delà des obligations légales ?");
    question45.setReponses(List.of(reponse194,reponse195,reponse196,reponse197,reponse198,reponse199,reponse200,reponse201,reponse202));
    question45.setNbrChoixMax(1);
    question45.setEstQuestionLibre(false);
    question45.setNombrePointMax(0.14);
    question45.setEnjeuxPrincipal("DIVERSITE, INCLUSION ET EQUITE");
    question45.setEnjeuxSecondaire("DIVERSITE");
    question45.setCategorie(CATEGORIE.Social);
    question45.setTemplate(Templates.WORKERS);
    questionRepository.save(question45);

    // question 46
    Question questionSim1 = new Question();
    questionSim1.setIntitule("Est-ce que XXX mesure le taux d'accidents dans l'entreprise par année fiscale ? Si oui, veuillez préciser ce taux : \n"
        + "Nombre d'accidents du travail au cours de l'année de référence/ Nombre total d'heures travaillées au cours d'une année par l'ensemble des salariés)*200 000.\n"
        + "Indication : 1710 heures travaillées en 2023 pour un équivalent temps plein en Belgique (225*7,6)");
    questionSim1.setReponses(List.of(reponseSim1,reponseSim2,reponseSim3));
    questionSim1.setNbrChoixMax(2);
    questionSim1.setEstQuestionLibre(false);
    questionSim1.setNombrePointMax(0.71);
    questionSim1.setEnjeuxPrincipal("SÉCURITÉ, SANTÉ & BIEN-ÊTRE");
    questionSim1.setEnjeuxSecondaire("SECURITE AU TRAVAIL");
    questionSim1.setCategorie(Question.CATEGORIE.Social);
    questionSim1.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim1);

    // question 47
    Question questionSim2 = new Question();
    questionSim2.setIntitule("Quelles initiatives ou politiques en matière de santé et de bien-être XXX propose-t-elle à ses travailleur·euses ?");
    questionSim2.setReponses(List.of(reponseSim4,reponseSim5,reponseSim6,reponseSim7,reponseSim8,reponseSim9,reponseSim10,reponseSim11));
    questionSim2.setNbrChoixMax(7);
    questionSim2.setEstQuestionLibre(false);
    questionSim2.setNombrePointMax(4.17);
    questionSim2.setEnjeuxPrincipal("SÉCURITÉ, SANTÉ & BIEN-ÊTRE");
    questionSim2.setEnjeuxSecondaire("SANTÉ ET BIEN-ÊTRE");
    questionSim2.setCategorie(Question.CATEGORIE.Social);
    questionSim2.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim2);

    // question 48
    Question questionSim3 = new Question();
    questionSim3.setIntitule("Est-ce que XXX mesure le taux d'absentéisme dans l'entreprise par année fiscale ? \n"
        + "Si oui, veuillez préciser ce taux : \n"
        + "\n"
        + "nombre de jours d'absentéisme/Nombre de jours de travail * nombre de salariés * 200 000)");
    questionSim3.setReponses(List.of(reponseSim12,reponseSim13,reponseSim14));
    questionSim3.setNbrChoixMax(2);
    questionSim3.setEstQuestionLibre(false);
    questionSim3.setNombrePointMax(0.83);
    questionSim3.setEnjeuxPrincipal("SÉCURITÉ, SANTÉ & BIEN-ÊTRE");
    questionSim3.setEnjeuxSecondaire("SANTÉ ET BIEN-ÊTRE");
    questionSim3.setCategorie(Question.CATEGORIE.Social);
    questionSim3.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim3);

    // question 49
    Question questionSim4 = new Question();
    questionSim4.setIntitule("Est-ce que XXX a mis en place une politique de formation des travailleur·euses qui prévoit un certain nombre d'heures de formation et/ou un budget annuel par travailleur·euse ? ");
    questionSim4.setReponses(List.of(reponseSim15,reponseSim16,reponseSim17));
    questionSim4.setNbrChoixMax(2);
    questionSim4.setEstQuestionLibre(false);
    questionSim4.setNombrePointMax(0.5);
    questionSim4.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim4.setEnjeuxSecondaire("DEVELOPPEMENT DES COMPETENCES");
    questionSim4.setCategorie(Question.CATEGORIE.Social);
    questionSim4.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim4);

    // question 50
    Question questionSim5 = new Question();
    questionSim5.setIntitule("Est-ce que XXX offre aux travailleur·euses l'une des possibilités de formation suivantes en vue de leur développement professionnel ?");
    questionSim5.setReponses(List.of(reponseSim18,reponseSim19,reponseSim20,reponseSim21,reponseSim22,reponseSim23,reponseSim24,reponseSim25));
    questionSim5.setNbrChoixMax(7);
    questionSim5.setEstQuestionLibre(false);
    questionSim5.setNombrePointMax(2.50);
    questionSim5.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim5.setEnjeuxSecondaire("DEVELOPPEMENT DES COMPETENCES");
    questionSim5.setCategorie(Question.CATEGORIE.Social);
    questionSim5.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim5);

    // question 51
    Question questionSim6 = new Question();
    questionSim6.setIntitule("Est-ce que XXX mesure le pourcentage de travailleur·euses ayant bénéficié d'une formation au cours des 12 derniers mois ?\n"
        + "Si oui, veuillez préciser ce pourcentage.");
    questionSim6.setReponses(List.of(reponseSim26,reponseSim27,reponseSim28,reponseSim29,reponseSim30,reponseSim31,reponseSim32));
    questionSim6.setNbrChoixMax(6);
    questionSim6.setEstQuestionLibre(false);
    questionSim6.setNombrePointMax(0.33);
    questionSim6.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim6.setEnjeuxSecondaire("DEVELOPPEMENT DES COMPETENCES");
    questionSim6.setCategorie(Question.CATEGORIE.Social);
    questionSim6.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim6);

    // question 52
    Question questionSim7 = new Question();
    questionSim7.setIntitule("Quel est le montant total des dépenses consacrées à la formation des travailleur·euses au cours de la dernière année fiscale ?");
    questionSim7.setReponses(List.of(reponseSim33,reponseSim34,reponseSim35));
    questionSim7.setNbrChoixMax(2);
    questionSim7.setEstQuestionLibre(false);
    questionSim7.setNombrePointMax(0.33);
    questionSim7.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim7.setEnjeuxSecondaire("DEVELOPPEMENT DES COMPETENCES");
    questionSim7.setCategorie(Question.CATEGORIE.Social);
    questionSim7.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim7);

    // question 53
    Question questionSim8 = new Question();
    questionSim8.setIntitule("Quel est le pourcentage de travailleur·euses ayant bénéficié d'une promotion interne au cours des 12 derniers mois ?");
    questionSim8.setReponses(List.of(reponseSim36,reponseSim37,reponseSim38,reponseSim39,reponseSim40,reponseSim41));
    questionSim8.setNbrChoixMax(5);
    questionSim8.setEstQuestionLibre(false);
    questionSim8.setNombrePointMax(0.33);
    questionSim8.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim8.setEnjeuxSecondaire("DEVELOPPEMENT DES COMPETENCES");
    questionSim8.setCategorie(Question.CATEGORIE.Social);
    questionSim8.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim8);

    // question 54
    Question questionSim9 = new Question();
    questionSim9.setIntitule("Comment est-ce que XXX engage et responsabilise les travailleur·euses ?");
    questionSim9.setReponses(List.of(reponseSim42,reponseSim43,reponseSim44,reponseSim45,reponseSim46));
    questionSim9.setNbrChoixMax(4);
    questionSim9.setEstQuestionLibre(false);
    questionSim9.setNombrePointMax(1.0);
    questionSim9.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim9.setEnjeuxSecondaire("DEVELOPPEMENT DES COMPETENCES");
    questionSim9.setCategorie(Question.CATEGORIE.Social);
    questionSim9.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim9);

    // question 55
    Question questionSim10 = new Question();
    questionSim10.setIntitule("Lesquelles des affirmations suivantes sont vraies en ce qui concerne la satisfaction et/ou l'engagement des travailleur·euses au sein de XXX ?");
    questionSim10.setReponses(List.of(reponseSim47,reponseSim48,reponseSim49,reponseSim50,reponseSim51,reponseSim52,reponseSim53));
    questionSim10.setNbrChoixMax(6);
    questionSim10.setEstQuestionLibre(false);
    questionSim10.setNombrePointMax(2.22);
    questionSim10.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim10.setEnjeuxSecondaire("ENGAGEMENT ET SATISFACTION");
    questionSim10.setCategorie(Question.CATEGORIE.Social);
    questionSim10.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim10);

    // question 56
    Question questionSim11 = new Question();
    questionSim11.setIntitule("Quel est le pourcentage équivalent du chiffre d'affaires distribué aux travailleur·euses sous forme de prime au cours du dernier exercice fiscal ?");
    questionSim11.setReponses(List.of(reponseSim54,reponseSim55,reponseSim56,reponseSim57,reponseSim58,reponseSim59));
    questionSim11.setNbrChoixMax(5);
    questionSim11.setEstQuestionLibre(false);
    questionSim11.setNombrePointMax(0.56);
    questionSim11.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim11.setEnjeuxSecondaire("ENGAGEMENT ET SATISFACTION");
    questionSim11.setCategorie(Question.CATEGORIE.Social);
    questionSim11.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim11);

    // question 57
    Question questionSim12 = new Question();
    questionSim12.setIntitule("Quel est le pourcentage de travailleur·euses ayant bénéficié d'une prime au cours du dernier exercice fiscal ?");
    questionSim12.setReponses(List.of(reponseSim60,reponseSim61,reponseSim62,reponseSim63,reponseSim64,reponseSim65));
    questionSim12.setNbrChoixMax(5);
    questionSim12.setEstQuestionLibre(false);
    questionSim12.setNombrePointMax(0.56);
    questionSim12.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim12.setEnjeuxSecondaire("ENGAGEMENT ET SATISFACTION");
    questionSim12.setCategorie(Question.CATEGORIE.Social);
    questionSim12.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim12);

    // question 58
    Question questionSim13 = new Question();
    questionSim13.setIntitule("Quel est le pourcentage de vos travailleur·euses qui sont \"Satisfait·es\" ou \"Engagé·es\" ?");
    questionSim13.setReponses(List.of(reponseSim66,reponseSim67,reponseSim68,reponseSim69,reponseSim70,reponseSim71));
    questionSim13.setNbrChoixMax(5);
    questionSim13.setEstQuestionLibre(false);
    questionSim13.setNombrePointMax(0.56);
    questionSim13.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim13.setEnjeuxSecondaire("ENGAGEMENT ET SATISFACTION");
    questionSim13.setCategorie(Question.CATEGORIE.Social);
    questionSim13.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim13);

    // question 59
    Question questionSim14 = new Question();
    questionSim14.setIntitule("Quel est le **turn-over** en pourcentage de XXX ?\n"
        + "\n"
        + "(Sur l'année fiscale précédente, diviser le nombre de départs d'employés (volontaires ou non) par l'effectif moyen de l'entreprise, puis multiplier le résultat par 100 pour obtenir un pourcentage)");
    questionSim14.setReponses(List.of(reponseSim72,reponseSim73,reponseSim74,reponseSim75,reponseSim76,reponseSim77,reponseSim78));
    questionSim14.setNbrChoixMax(6);
    questionSim14.setEstQuestionLibre(false);
    questionSim14.setNombrePointMax(0.56);
    questionSim14.setEnjeuxPrincipal("EMPLOI ET PRATIQUES DE TRAVAIL");
    questionSim14.setEnjeuxSecondaire("ENGAGEMENT ET SATISFACTION");
    questionSim14.setCategorie(Question.CATEGORIE.Social);
    questionSim14.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim14);

    // question 60
    Question questionSim15 = new Question();
    questionSim15.setIntitule("Comment XXX s'implique-t-elle dans des projets sociaux ?");
    questionSim15.setReponses(List.of(reponseSim79,reponseSim80,reponseSim81,reponseSim82,reponseSim83,reponseSim84,reponseSim85,reponseSim86,reponseSim87));
    questionSim15.setNbrChoixMax(8);
    questionSim15.setEstQuestionLibre(false);
    questionSim15.setNombrePointMax(1.87);
    questionSim15.setEnjeuxPrincipal("ENGAGEMENT CIVIQUE");
    questionSim15.setEnjeuxSecondaire("ENGAGEMENT SOCIAL");
    questionSim15.setCategorie(Question.CATEGORIE.Social);
    questionSim15.setTemplate(Templates.ALL);
    questionRepository.save(questionSim15);

    // question 61
    Question questionSim16 = new Question();
    questionSim16.setIntitule("Est-ce que XXX monitore régulièrement les heures consacrées à l'engagement social ? ");
    questionSim16.setReponses(List.of(reponseSim88,reponseSim89,reponseSim90));
    questionSim16.setNbrChoixMax(2);
    questionSim16.setEstQuestionLibre(false);
    questionSim16.setNombrePointMax(0.50);
    questionSim16.setEnjeuxPrincipal("ENGAGEMENT CIVIQUE");
    questionSim16.setEnjeuxSecondaire("ENGAGEMENT SOCIAL");
    questionSim16.setCategorie(Question.CATEGORIE.Social);
    questionSim16.setTemplate(Templates.ALL);
    questionRepository.save(questionSim16);

    // question 62
    Question questionSim17 = new Question();
    questionSim17.setIntitule("Comment XXX aborde-t-elle la philanthropie ?");
    questionSim17.setReponses(List.of(reponseSim91,reponseSim92,reponseSim93,reponseSim94,reponseSim95,reponseSim96,reponseSim97,reponseSim98,reponseSim99,reponseSim100,reponseSim101));
    questionSim17.setNbrChoixMax(10);
    questionSim17.setEstQuestionLibre(false);
    questionSim17.setNombrePointMax(2.13);
    questionSim17.setEnjeuxPrincipal("ENGAGEMENT CIVIQUE");
    questionSim17.setEnjeuxSecondaire("PHILANTHROPIE");
    questionSim17.setCategorie(Question.CATEGORIE.Social);
    questionSim17.setTemplate(Templates.ALL);
    questionRepository.save(questionSim17);

    // question63
    Question questionSim18 = new Question();
    questionSim18.setIntitule("Quel est le pourcentage du chiffre d'affaires distribué à titre philanthropique au cours du dernier exercice fiscal ?");
    questionSim18.setReponses(List.of(reponseSim102,reponseSim103,reponseSim104,reponseSim105,reponseSim106));
    questionSim18.setNbrChoixMax(4);
    questionSim18.setEstQuestionLibre(false);
    questionSim18.setNombrePointMax(0.50);
    questionSim18.setEnjeuxPrincipal("ENGAGEMENT CIVIQUE");
    questionSim18.setEnjeuxSecondaire("PHILANTHROPIE");
    questionSim18.setCategorie(Question.CATEGORIE.Social);
    questionSim18.setTemplate(Templates.ALL);
    questionRepository.save(questionSim18);

    // question 64
    Question questionSim19 = new Question();
    questionSim19.setIntitule("Laquelle de ces options décrit le mieux la structure de gouvernance de XXX ? ");
    questionSim19.setReponses(List.of(reponseSim107,reponseSim108,reponseSim109));
    questionSim19.setNbrChoixMax(2);
    questionSim19.setEstQuestionLibre(false);
    questionSim19.setNombrePointMax(1.33);
    questionSim19.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim19.setEnjeuxSecondaire("STRUCTURE DE GOUVERNANCE");
    questionSim19.setCategorie(CATEGORIE.Gouvernance);
    questionSim19.setTemplate(Templates.ALL);
    questionRepository.save(questionSim19);

    // question 65
    Question questionSim20 = new Question();
    questionSim20.setIntitule("Le conseil d'administration de XXX dispose-t-il de sièges avec droit de vote représentant :");
    questionSim20.setReponses(List.of(reponseSim110,reponseSim111,reponseSim112,reponseSim113,reponseSim114));
    questionSim20.setNbrChoixMax(4);
    questionSim20.setEstQuestionLibre(false);
    questionSim20.setNombrePointMax(2.0);
    questionSim20.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim20.setEnjeuxSecondaire("STRUCTURE DE GOUVERNANCE");
    questionSim20.setCategorie(CATEGORIE.Gouvernance);
    questionSim20.setTemplate(Templates.ALL);
    questionRepository.save(questionSim20);

    // question 66
    Question questionSim21 = new Question();
    questionSim21.setIntitule("Combien de membres compte votre conseil d'administration au total ? ");
    questionSim21.setReponses(new ArrayList<>());
    questionSim21.setNbrChoixMax(1);
    questionSim21.setEstQuestionLibre(true);
    questionSim21.setNombrePointMax(0);
    questionSim21.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim21.setEnjeuxSecondaire("STRUCTURE DE GOUVERNANCE");
    questionSim21.setCategorie(CATEGORIE.Gouvernance);
    questionSim21.setTemplate(Templates.ALL);
    questionRepository.save(questionSim21);

    // question 67
    Question questionSim22 = new Question();
    questionSim22.setIntitule("Combien de membres compte votre conseil d'administration au total ? ");
    questionSim22.setReponses(new ArrayList<>());
    questionSim22.setNbrChoixMax(1);
    questionSim22.setEstQuestionLibre(true);
    questionSim22.setNombrePointMax(0);
    questionSim22.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim22.setEnjeuxSecondaire("STRUCTURE DE GOUVERNANCE");
    questionSim22.setCategorie(CATEGORIE.Gouvernance);
    questionSim22.setTemplate(Templates.ALL);
    questionRepository.save(questionSim22);

    // question 68
    Question questionSim23 = new Question();
    questionSim23.setIntitule("Quel est le pourcentage des membres de votre conseil d'administration qui s'identifient comme femmes ? (Veuillez préciser le % précis dans les commentaires) ");
    questionSim23.setReponses(List.of(reponseSim115,reponseSim116,reponseSim117,reponseSim118,reponseSim119));
    questionSim23.setNbrChoixMax(4);
    questionSim23.setEstQuestionLibre(false);
    questionSim23.setNombrePointMax(1.0);
    questionSim23.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim23.setEnjeuxSecondaire("STRUCTURE DE GOUVERNANCE");
    questionSim23.setCategorie(CATEGORIE.Gouvernance);
    questionSim23.setTemplate(Templates.ALL);
    questionRepository.save(questionSim23);

    // question 69
    Question questionSim24 = new Question();
    questionSim24.setIntitule("Tous·tes les membres du conseil d'administration et de la direction remplissent-ils·elles un questionnaire annuel sur les conflits d'intérêts ?");
    questionSim24.setReponses(List.of(reponseSim120,reponseSim121,reponseSim122));
    questionSim24.setNbrChoixMax(2);
    questionSim24.setEstQuestionLibre(false);
    questionSim24.setNombrePointMax(0.67);
    questionSim24.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim24.setEnjeuxSecondaire("STRUCTURE DE GOUVERNANCE");
    questionSim24.setCategorie(CATEGORIE.Gouvernance);
    questionSim24.setTemplate(Templates.ALL);
    questionRepository.save(questionSim24);

    // question 70
    Question questionSim25 = new Question();
    questionSim25.setIntitule("Est-ce que XXX a mis en place un comité d'audit ?");
    questionSim25.setReponses(new ArrayList<>());
    questionSim25.setNbrChoixMax(1);
    questionSim25.setEstQuestionLibre(true);
    questionSim25.setNombrePointMax(0);
    questionSim25.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim25.setEnjeuxSecondaire("STRUCTURE DE GOUVERNANCE");
    questionSim25.setCategorie(CATEGORIE.Gouvernance);
    questionSim25.setTemplate(Templates.ALL);
    questionRepository.save(questionSim25);

    // question 71
    Question questionSim26 = new Question();
    questionSim26.setIntitule("Quel pourcentage des principaux fournisseurs (représentant au moins 80 % des dépenses) fait l’objet d’audits ou contrôles annuels d’assurance qualité ?");
    questionSim26.setReponses(List.of(reponseSim123,reponseSim124,reponseSim125,reponseSim126,reponseSim127,reponseSim128));
    questionSim26.setNbrChoixMax(5);
    questionSim26.setEstQuestionLibre(false);
    questionSim26.setNombrePointMax(1.0);
    questionSim26.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim26.setEnjeuxSecondaire("INTEGRATION DES PARTIES PRENANTES");
    questionSim26.setCategorie(CATEGORIE.Gouvernance);
    questionSim26.setTemplate(Templates.ALL);
    questionRepository.save(questionSim26);

    // question 72
    Question questionSim27 = new Question();
    questionSim27.setIntitule("Quel pourcentage des principaux fournisseurs (représentant au moins 80 % des dépenses) fait l’objet d’audits ou contrôles annuels d’assurance qualité ?");
    questionSim27.setReponses(List.of(reponseSim129,reponseSim130,reponseSim131,reponseSim132,reponseSim133,reponseSim134,reponseSim135));
    questionSim27.setNbrChoixMax(6);
    questionSim27.setEstQuestionLibre(false);
    questionSim27.setNombrePointMax(1.14);
    questionSim27.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim27.setEnjeuxSecondaire("INTEGRATION DES PARTIES PRENANTES");
    questionSim27.setCategorie(CATEGORIE.Gouvernance);
    questionSim27.setTemplate(Templates.ALL);
    questionRepository.save(questionSim27);

    // question 73
    Question questionSim28 = new Question();
    questionSim28.setIntitule("Quel pourcentage des principaux fournisseurs (représentant au moins 80 % des dépenses) fait l’objet d’audits ou contrôles annuels d’assurance qualité ?");
    questionSim28.setReponses(List.of(reponseSim136,reponseSim137,reponseSim138,reponseSim139,reponseSim140,reponseSim141,reponseSim142,reponseSim143,reponseSim144));
    questionSim28.setNbrChoixMax(8);
    questionSim28.setEstQuestionLibre(false);
    questionSim28.setNombrePointMax(1.71);
    questionSim28.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim28.setEnjeuxSecondaire("INTEGRATION DES PARTIES PRENANTES");
    questionSim28.setCategorie(CATEGORIE.Gouvernance);
    questionSim28.setTemplate(Templates.ALL);
    questionRepository.save(questionSim28);

    // question 74
    Question questionSim29 = new Question();
    questionSim29.setIntitule("Quel pourcentage des principaux fournisseurs (représentant au moins 80 % des dépenses) fait l’objet d’audits ou contrôles annuels d’assurance qualité ?");
    questionSim29.setReponses(List.of(reponseSim145,reponseSim146,reponseSim147,reponseSim148,reponseSim149,reponseSim150));
    questionSim29.setNbrChoixMax(5);
    questionSim29.setEstQuestionLibre(false);
    questionSim29.setNombrePointMax(1.14);
    questionSim29.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim29.setEnjeuxSecondaire("INTEGRATION DES PARTIES PRENANTES");
    questionSim29.setCategorie(CATEGORIE.Gouvernance);
    questionSim29.setTemplate(Templates.ALL);
    questionRepository.save(questionSim29);

    // question 75
    Question questionSim30 = new Question();
    questionSim30.setIntitule("Avez-vous une mission formelle et écrite qui comprend l'un des élements suivants ?\n"
        + "Une déclaration de mission formelle et écrite de l'entreprise est une déclaration publique ou formellement partagée avec les travailleur·euses de l'entreprise. ");
    questionSim30.setReponses(List.of(reponseSim151,reponseSim152,reponseSim153,reponseSim154,reponseSim155,reponseSim156));
    questionSim30.setNbrChoixMax(5);
    questionSim30.setEstQuestionLibre(false);
    questionSim30.setNombrePointMax(1.0);
    questionSim30.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim30.setEnjeuxSecondaire("GESTION DURABLE");
    questionSim30.setCategorie(CATEGORIE.Gouvernance);
    questionSim30.setTemplate(Templates.ALL);
    questionRepository.save(questionSim30);

    // question 76
    Question questionSim31 = new Question();
    questionSim31.setIntitule("Avez-vous une mission formelle et écrite qui comprend l'un des élements suivants ?\n"
        + "Une déclaration de mission formelle et écrite de l'entreprise est une déclaration publique ou formellement partagée avec les travailleur·euses de l'entreprise. ");
    questionSim31.setReponses(List.of(reponseSim157,reponseSim158,reponseSim159,reponseSim160,reponseSim161,reponseSim162));
    questionSim31.setNbrChoixMax(5);
    questionSim31.setEstQuestionLibre(false);
    questionSim31.setNombrePointMax(1.33);
    questionSim31.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim31.setEnjeuxSecondaire("GESTION DURABLE");
    questionSim31.setCategorie(CATEGORIE.Gouvernance);
    questionSim31.setTemplate(Templates.ALL);
    questionRepository.save(questionSim31);

    // question 77
    Question questionSim32 = new Question();
    questionSim32.setIntitule("Quelles sont les étapes suivantes de l'analyse de double matérialité de XXX que vous avez déjà mises en oeuvres ? ");
    questionSim32.setReponses(List.of(reponseSim163,reponseSim164,reponseSim165,reponseSim166,reponseSim167,reponseSim168,reponseSim169,reponseSim170,reponseSim171,reponseSim172));
    questionSim32.setNbrChoixMax(9);
    questionSim32.setEstQuestionLibre(false);
    questionSim32.setNombrePointMax(2.33);
    questionSim32.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim32.setEnjeuxSecondaire("GESTION DURABLE");
    questionSim32.setCategorie(CATEGORIE.Gouvernance);
    questionSim32.setTemplate(Templates.ALL);
    questionRepository.save(questionSim32);

    // question 78
    Question questionSim33 = new Question();
    questionSim33.setIntitule("Quelles sont les étapes suivantes de l'analyse de double matérialité de XXX que vous avez déjà mises en oeuvres ? ");
    questionSim33.setReponses(List.of(reponseSim173,reponseSim174,reponseSim175,reponseSim176,reponseSim177,reponseSim178,reponseSim179,reponseSim180,reponseSim181,reponseSim182));
    questionSim33.setNbrChoixMax(8);
    questionSim33.setEstQuestionLibre(false);
    questionSim33.setNombrePointMax(0.19);
    questionSim33.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim33.setEnjeuxSecondaire("TRANSPARENCE");
    questionSim33.setCategorie(CATEGORIE.Gouvernance);
    questionSim33.setTemplate(Templates.ALL);
    questionRepository.save(questionSim33);

    // question 79
    Question questionSim34 = new Question();
    questionSim34.setIntitule("Quelles informations sur son impact social XXX rend-elle accessibles et transparentes ?");
    questionSim34.setReponses(List.of(reponseSim183,reponseSim184,reponseSim185,reponseSim186,reponseSim187,reponseSim188,reponseSim189,reponseSim190,reponseSim191));
    questionSim34.setNbrChoixMax(8);
    questionSim34.setEstQuestionLibre(false);
    questionSim34.setNombrePointMax(0.19);
    questionSim34.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim34.setEnjeuxSecondaire("TRANSPARENCE");
    questionSim34.setCategorie(CATEGORIE.Gouvernance);
    questionSim34.setTemplate(Templates.WORKERS);
    questionRepository.save(questionSim34);

    // question 80
    Question questionSim35 = new Question();
    questionSim35.setIntitule("Quelles informations sur son impact social XXX rend-elle accessibles et transparentes ?");
    questionSim35.setReponses(List.of(reponseSim192,reponseSim193,reponseSim194,reponseSim195,reponseSim196,reponseSim197,reponseSim198,reponseSim199,reponseSim200,reponseSim201));
    questionSim35.setNbrChoixMax(9);
    questionSim35.setEstQuestionLibre(false);
    questionSim35.setNombrePointMax(0.19);
    questionSim35.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim35.setEnjeuxSecondaire("TRANSPARENCE");
    questionSim35.setCategorie(CATEGORIE.Gouvernance);
    questionSim35.setTemplate(Templates.ALL);
    questionRepository.save(questionSim35);

    // question 81
    Question questionSim36 = new Question();
    questionSim36.setIntitule("Quelles actions XXX a-t-elle mises en place pour garantir la qualité de son rapport d'impact ?");
    questionSim36.setReponses(List.of(reponseSim202,reponseSim203,reponseSim204,reponseSim205,reponseSim206));
    questionSim36.setNbrChoixMax(4);
    questionSim36.setEstQuestionLibre(false);
    questionSim36.setNombrePointMax(0.19);
    questionSim36.setEnjeuxPrincipal("CONDUITE DES AFFAIRES");
    questionSim36.setEnjeuxSecondaire("TRANSPARENCE");
    questionSim36.setCategorie(CATEGORIE.Gouvernance);
    questionSim36.setTemplate(Templates.ALL);
    questionRepository.save(questionSim36);

    // question 82
    Question questionSim37 = new Question();
    questionSim37.setIntitule("Quelle est l'approche de XXX en matière de formalisation de ses engagements : avez-vous écrit et partagé en interne les politiques suivantes ? ");
    questionSim37.setReponses(List.of(reponseSim207,reponseSim208,reponseSim209,reponseSim210,reponseSim211,reponseSim212,reponseSim213,reponseSim214,reponseSim215,reponseSim216,reponseSim217,reponseSim218,reponseSim219));
    questionSim37.setNbrChoixMax(12);
    questionSim37.setEstQuestionLibre(false);
    questionSim37.setNombrePointMax(0.42);
    questionSim37.setEnjeuxPrincipal("ETHIQUE DES AFFAIRES");
    questionSim37.setEnjeuxSecondaire(" FORMALISATION DES PRATIQUES ");
    questionSim37.setCategorie(CATEGORIE.Gouvernance);
    questionSim37.setTemplate(Templates.ALL);
    questionRepository.save(questionSim37);

    // question 83
    Question questionSim38 = new Question();
    questionSim38.setIntitule("Le programme de lutte contre la corruption de XXX inclut-il un ou plusieurs des éléments suivants ? ");
    questionSim38.setReponses(List.of(reponseSim220,reponseSim221,reponseSim222,reponseSim223,reponseSim224,reponseSim225,reponseSim226,reponseSim227));
    questionSim38.setNbrChoixMax(7);
    questionSim38.setEstQuestionLibre(false);
    questionSim38.setNombrePointMax(5.0);
    questionSim38.setEnjeuxPrincipal("ETHIQUE DES AFFAIRES");
    questionSim38.setEnjeuxSecondaire("LUTTE CONTRE LA CORRUPTION FINANCIÈRE");
    questionSim38.setCategorie(CATEGORIE.Gouvernance);
    questionSim38.setTemplate(Templates.ALL);
    questionRepository.save(questionSim38);

    // question 84
    Question questionSim39 = new Question();
    questionSim39.setIntitule("Le programme de lutte contre la corruption de XXX inclut-il un ou plusieurs des éléments suivants ? ");
    questionSim39.setReponses(List.of(reponseSim228,reponseSim229,reponseSim230,reponseSim231,reponseSim232,reponseSim233));
    questionSim39.setNbrChoixMax(6);
    questionSim39.setEstQuestionLibre(false);
    questionSim39.setNombrePointMax(0.0);
    questionSim39.setEnjeuxPrincipal("ETHIQUE DES AFFAIRES");
    questionSim39.setEnjeuxSecondaire("DIVULGATION DES LITIGES");
    questionSim39.setCategorie(CATEGORIE.Gouvernance);
    questionSim39.setTemplate(Templates.ALL);
    questionRepository.save(questionSim39);

    // question 85
    Question questionSim40 = new Question();
    questionSim40.setIntitule("XXX a-t-elle été confrontée à un problème environnemental majeur ou à un litige au cours de l'année écoulée (Si oui, veuillez préciser) ? ");
    questionSim40.setReponses(List.of(reponseSim234,reponseSim235));
    questionSim40.setNbrChoixMax(2);
    questionSim40.setEstQuestionLibre(false);
    questionSim40.setNombrePointMax(0.0);
    questionSim40.setEnjeuxPrincipal("ETHIQUE DES AFFAIRES");
    questionSim40.setEnjeuxSecondaire("DIVULGATION DES LITIGES");
    questionSim40.setCategorie(CATEGORIE.Gouvernance);
    questionSim40.setTemplate(Templates.ALL);
    questionRepository.save(questionSim40);

    // question 86
    Question questionSim41 = new Question();
    questionSim41.setIntitule("Parmi les initiatives suivantes, laquelle ou lesquelles ont été mises en œuvre pour assurer la protection des données ?");
    questionSim41.setReponses(List.of(reponseSim236,reponseSim237,reponseSim238,reponseSim239,reponseSim240,reponseSim241,reponseSim242));
    questionSim41.setNbrChoixMax(6);
    questionSim41.setEstQuestionLibre(false);
    questionSim41.setNombrePointMax(3.23);
    questionSim41.setEnjeuxPrincipal("PROTECTION  DES DONNEES");
    questionSim41.setEnjeuxSecondaire("SECURITE DES DONNEES");
    questionSim41.setCategorie(CATEGORIE.Gouvernance);
    questionSim41.setTemplate(Templates.ALL);
    questionRepository.save(questionSim41);

    // question 87
    Question questionSim42 = new Question();
    questionSim42.setIntitule("Parmi les initiatives suivantes, laquelle ou lesquelles ont été mises en œuvre pour assurer la protection des données ?");
    questionSim42.setReponses(List.of(reponseSim243,reponseSim244,reponseSim245,reponseSim246,reponseSim247));
    questionSim42.setNbrChoixMax(4);
    questionSim42.setEstQuestionLibre(false);
    questionSim42.setNombrePointMax(1.71);
    questionSim42.setEnjeuxPrincipal("PROTECTION  DES DONNEES");
    questionSim42.setEnjeuxSecondaire("PROTECTION DE LA VIE PRIVEE");
    questionSim42.setCategorie(CATEGORIE.Gouvernance);
    questionSim42.setTemplate(Templates.ALL);
    questionRepository.save(questionSim42);

    // question 88
    Question questionSim43 = new Question();
    questionSim43.setIntitule("XXX respecte-t-elle toutes les obligations spécifiques du RGPD en ce qui concerne la collecte, l'utilisation et la protection des adresses électroniques et des données acquises par le biais de son site web. ?");
    questionSim43.setReponses(List.of(reponseSim248,reponseSim249,reponseSim250));
    questionSim43.setNbrChoixMax(3);
    questionSim43.setEstQuestionLibre(false);
    questionSim43.setNombrePointMax(0.0);
    questionSim43.setEnjeuxPrincipal("PROTECTION  DES DONNEES");
    questionSim43.setEnjeuxSecondaire("PROTECTION DE LA VIE PRIVEE");
    questionSim43.setCategorie(CATEGORIE.Gouvernance);
    questionSim43.setTemplate(Templates.ALL);
    questionRepository.save(questionSim43);

    // question 89
    Question questionSim44 = new Question();
    questionSim44.setIntitule("XXX respecte-t-elle toutes les obligations spécifiques du RGPD en ce qui concerne la collecte, l'utilisation et la protection des adresses électroniques et des données acquises par le biais de son site web. ?");
    questionSim44.setReponses(List.of(reponseSim251,reponseSim252,reponseSim253,reponseSim254,reponseSim255,reponseSim256,reponseSim257));
    questionSim44.setNbrChoixMax(6);
    questionSim44.setEstQuestionLibre(false);
    questionSim44.setNombrePointMax(2.50);
    questionSim44.setEnjeuxPrincipal("CERTIFICATIONS");
    questionSim44.setEnjeuxSecondaire("CERTIFICATIONS D'UN PRODUIT, D'UN SERVICE OU D'UNE PRATIQUE");
    questionSim44.setCategorie(CATEGORIE.Gouvernance);
    questionSim44.setTemplate(Templates.ALL);
    questionRepository.save(questionSim44);

    // question 90
    Question questionSim45 = new Question();
    questionSim45.setIntitule("XXX a-t-elle obtenu des certifications pour ses produits, services ou pratiques ?");
    questionSim45.setReponses(List.of(reponseSim258,reponseSim259,reponseSim260,reponseSim261,reponseSim262,reponseSim263,reponseSim264));
    questionSim45.setNbrChoixMax(7);
    questionSim45.setEstQuestionLibre(false);
    questionSim45.setNombrePointMax(2.50);
    questionSim45.setEnjeuxPrincipal("CERTIFICATIONS");
    questionSim45.setEnjeuxSecondaire("CERTIFICATIONS DE L'ENTREPRISE");
    questionSim45.setCategorie(CATEGORIE.Gouvernance);
    questionSim45.setTemplate(Templates.ALL);
    questionRepository.save(questionSim45);


    // questionnaire
    Questionnaire questionnaire = new Questionnaire();
    questionnaire.setName("ESG");
    questionnaire.setStatut("A compléter");
    questionnaire.setQuestions(List.of(question1,question2,question3,question4,question5,question6,
        question7,question8,question9,question10,question11,question12,question13,question14,
        question15,question16,question17,question18,question19,question20,question21,question22,
        question23,question24,question25,question26,question27,question28,question29,question30,
        question31,question32,question33,question34,question35,question36,question37,question38,
        question39,question40,question41,question42,question43,question44,question45,questionSim1,
        questionSim2,questionSim3,questionSim4,questionSim5,questionSim6,questionSim7,questionSim8,
        questionSim9,questionSim10,questionSim11,questionSim12,questionSim13,questionSim14,
        questionSim15,questionSim16,questionSim17,questionSim18,questionSim19,questionSim20,questionSim21,
        questionSim22,questionSim23,questionSim24,questionSim25,questionSim26,questionSim27,questionSim28,
        questionSim29,questionSim30,questionSim31,questionSim32,questionSim33,questionSim34,questionSim35,
        questionSim36,questionSim37,questionSim38,questionSim39,questionSim40,questionSim41,questionSim42,
        questionSim43,questionSim44,questionSim45));
    questionnaireRepository.save(questionnaire);
  }

  public Questionnaire getQuestionnaireByNom(String nom) {
    return questionnaireRepository.findByName(nom);
  }
}

