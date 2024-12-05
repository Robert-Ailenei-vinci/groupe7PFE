package vinci.be.backend.model.questionnairerepondu;

import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import vinci.be.backend.model.questionrepondu.QuestionRepondu;

@Getter
@Setter
@AllArgsConstructor
public class QuestionnaireRepondu {
  @Id
  private String id;
  private int idQuestionnaire;
  private int idClient;
  private int pourcentageQuestionRepondu;
  private boolean estTermine;
  private boolean estValide;
  private int nombreDeQuestionRepondu;
  private Date dateDerniereValidation;
  private List<QuestionRepondu> questionsRepondues;
  private double score;
}
