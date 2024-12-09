package vinci.be.backend.model.reponserepondu;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "reponseRepondus")
public class ReponseRepondu {
  @Id
  private String id;
  private String idReponse;
  private String idQuestionRepondu;
  private String intitule;
  private boolean estEngage;
  private boolean isSelectionne;
}
