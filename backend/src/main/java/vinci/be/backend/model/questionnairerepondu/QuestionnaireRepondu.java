package vinci.be.backend.model.questionnairerepondu;

import java.time.LocalDate;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import vinci.be.backend.model.questionrepondu.QuestionRepondu;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "questionnaireRepondus")
public class QuestionnaireRepondu {
  @Id
  private String id;
  private String idQuestionnaire;
  private String idClient;
  private int pourcentageQuestionRepondu;
  private boolean estTermine;
  private boolean estValide;
  private int nombreDeQuestionRepondu;
  private LocalDate dateDerniereValidation;
  private List<QuestionRepondu> questionsRepondues;
  private double score;
}
