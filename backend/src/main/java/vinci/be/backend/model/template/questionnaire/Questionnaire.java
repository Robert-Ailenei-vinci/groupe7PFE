package vinci.be.backend.model.template.questionnaire;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import vinci.be.backend.model.template.question.Question;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "questionnaires")
public class Questionnaire {
  @Id
  private String id;
  private String name;
  private String statut;
  private List<Question> questions;


}
