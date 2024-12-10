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
    reponseRepository.save(reponse114);

    Reponse reponse115= new Reponse();
    reponse115.setIntitule("Nous mettons à disposition des articles réutilisables, tels que des tasses, des verres et des ustensiles, pour réduire l'usage de plastique jetable.");
    reponse115.setScoreTotal(0.62);
    reponse115.setScoreEngagement(0.15);
    reponseRepository.save(reponse115);

    Reponse reponse116= new Reponse();
    reponse116.setIntitule("Nous privilégions l'achat de produits et de fournitures de bureau en vrac ou avec un emballage réduit au minimum, afin de limiter les déchets d'emballage.");
    reponse116.setScoreTotal(0.62);
    reponse116.setScoreEngagement(0.15);
    reponseRepository.save(reponse116);

    Reponse reponse117= new Reponse();
    reponse117.setIntitule("Nous favorisons l'achat de produits rechargeables, comme les cartouches d'encre et les piles, afin de limiter notre production de déchets.");
    reponse117.setScoreTotal(0.62);
    reponse117.setScoreEngagement(0.15);
    reponseRepository.save(reponse117);

    Reponse reponse118= new Reponse();
    reponse118.setIntitule("Nous privilégions les options de don ou de réutilisation, plutôt que de jeter, pour des articles tels que les meubles ou les équipements.");
    reponse118.setScoreTotal(0.62);
    reponse118.setScoreEngagement(0.15);
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
    // question2.setReponses(List.of(reponse3));
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
    // question8.setReponses(List.of(reponse26));
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
    // question9.setReponses(List.of(reponse27));
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
    // question10.setReponses(List.of(reponse28));
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

    Question question12 = new Question();
    question12.setIntitule("Quelle(s) pratique(s) avez-vous mise(s) en place pour limiter votre empreinte carbone ?");
    question12.setReponses(List.of(reponse37,reponse38,reponse39,reponse40,reponse40Bis,reponse41));
    question12.setNbrChoixMax(4);
    question12.setEstQuestionLibre(false);
    question12.setNombrePointMax(0.63);
    question12.setEnjeuxPrincipal("Energie & carbone");
    question12.setEnjeuxSecondaire("EMPREINTE CARBONE");
    question12.setCategorie(Question.CATEGORIE.Environment);
    question12.setEstEngageForce(false);
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
    question13.setEstEngageForce(false);
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
    question14.setEstEngageForce(false);
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
    question15.setEstEngageForce(false);
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
    question16.setEstEngageForce(false);
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
    question17.setEstEngageForce(false);
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
    question18.setEstEngageForce(false);
    question18.setTemplate(Templates.FACILITY);
    questionRepository.save(question18);

    Question question19 = new Question();
    question19.setIntitule("Si vous la mesurez, veuillez indiquer votre consommation d'eau (en litres) :");
    // question19.setReponses(List.of(reponse74));
    question19.setNbrChoixMax(1);
    question19.setEstQuestionLibre(true);
    question19.setNombrePointMax(0);
    question19.setEnjeuxPrincipal("EAU, MATIERES PREMIERES ET FOURNITURES");
    question19.setEnjeuxSecondaire("EAU");
    question19.setCategorie(Question.CATEGORIE.Environment);
    question19.setEstEngageForce(false);
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
    question20.setEstEngageForce(false);
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
    question21.setEstEngageForce(false);
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
    question22.setEstEngageForce(false);
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
    question23.setEstEngageForce(false);
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
    question24.setEstEngageForce(false);
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
    question25.setEstEngageForce(false);
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
    question26.setEstEngageForce(false);
    question26.setTemplate(Templates.FACILITY);
    questionRepository.save(question26);

    Question question27 = new Question();
    question27.setIntitule("Si vous la suivez, veuillez indiquer la quantité totale de déchets produits par votre organisation au cours des 12 derniers mois (en tonnes) ?");
    // question27.setReponses(List.of(reponse108,reponse109,reponse110));
    question27.setNbrChoixMax(1);
    question27.setEstQuestionLibre(true);
    question27.setNombrePointMax(0);
    question27.setEnjeuxPrincipal("DÉCHETS");
    question27.setEnjeuxSecondaire("DÉCHETS");
    question27.setCategorie(Question.CATEGORIE.Environment);
    question27.setEstEngageForce(false);
    question27.setTemplate(Templates.FACILITY);
    questionRepository.save(question27);

    Question question28 = new Question();
    question28.setIntitule("Si vous la suivez, veuillez indiquer la quantité de déchets dangereux produits par votre organisation au cours des 12 derniers mois (en tonnes) ?\n"
        + "(exemples de déchets dangereux : équipements électroniques, piles, cartouches d'encre, déchets industriels, batteries, peintures, etc.)");
    // question27.setReponses(List.of(reponse108,reponse109,reponse110));
    question28.setNbrChoixMax(1);
    question28.setEstQuestionLibre(true);
    question28.setNombrePointMax(0);
    question28.setEnjeuxPrincipal("DÉCHETS");
    question28.setEnjeuxSecondaire("DÉCHETS");
    question28.setCategorie(Question.CATEGORIE.Environment);
    question28.setEstEngageForce(false);
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
    question29.setEstEngageForce(false);
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
    question30.setEstEngageForce(false);
    question30.setTemplate(Templates.WORKERS);
    questionRepository.save(question30);

    // questionnaire
    Questionnaire questionnaire = new Questionnaire();
    questionnaire.setName("ESG");
    questionnaire.setStatut("A compléter");
    questionnaire.setQuestions(List.of(question1,question2,question3,question4,question5,question6,
        question7,question8,question9,question10,question11));
    questionnaireRepository.save(questionnaire);
  }

  public Questionnaire getQuestionnaireByNom(String nom) {
    return questionnaireRepository.findByName(nom);
  }
}

