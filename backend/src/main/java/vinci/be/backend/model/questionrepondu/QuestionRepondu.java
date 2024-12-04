package vinci.be.backend.model.questionrepondu;

import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vinci.be.backend.model.reponserepondu.ReponseRepondu;

@Getter
@Setter
@AllArgsConstructor
public class QuestionRepondu {
  @Id
  private int id;
  private int idQuestion;
  private int idQuestionnaireRepondu;
  private List<ReponseRepondu> reponseRepondus;
  private double nombrePointObtenu;
  private String commentaire;
}
