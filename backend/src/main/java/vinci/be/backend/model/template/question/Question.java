package vinci.be.backend.model.template.question;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import vinci.be.backend.model.template.reponse.Reponse;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "questions")
public class Question {

  @Id
  private String id;
  private String intitule;
  private List<Reponse> reponses;
  private int nbrChoixMax;
  private boolean estQuestionLibre;
  private double nombrePointMax;
  private String enjeuxPrincipal;
  private String enjeuxSecondaire;
  private CATEGORIE categorie;
  private boolean estEngageForce;
  private Templates template;

  public enum Templates {
    ALL,
    OWNEDFACILITY,
    WORKERS,
    PRODUITS,
    FACILITY
  }

  public enum CATEGORIE {

    Environment(3.8),
    Social(1.2),
    Gouvernance(1.2);

    private double scoreEngagement;

    CATEGORIE(double scoreEngagement) {
      this.scoreEngagement = scoreEngagement;
    }

    public double getScoreEngagement() {
      return scoreEngagement;
    }

    public void setScoreEngagement(double scoreEngagement) {
      this.scoreEngagement = scoreEngagement;
    }

  }
}
