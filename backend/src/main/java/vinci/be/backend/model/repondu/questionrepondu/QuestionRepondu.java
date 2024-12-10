package vinci.be.backend.model.repondu.questionrepondu;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import vinci.be.backend.model.template.question.Question.CATEGORIE;
import vinci.be.backend.model.template.question.Question.Templates;
import vinci.be.backend.model.repondu.reponserepondu.ReponseRepondu;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "questionRepondus")
public class QuestionRepondu {
  @Id
  private String id;
  private String idQuestion;
  private String idQuestionnaireRepondu;
  private String intitule;
  private String enjeuxPrincipal;
  private String enjeuxSecondaire;
  private List<ReponseRepondu> reponseRepondus;
  private double nombrePointObtenu;
  private String commentaire;
  private boolean estEngageForce;
  private CATEGORIE categorie;
  private Templates template;
  private boolean isQuestionDejaSelectionne;

}
