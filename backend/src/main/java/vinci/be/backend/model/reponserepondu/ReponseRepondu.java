package vinci.be.backend.model.reponserepondu;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReponseRepondu {
  @Id
  private int id;
  private int idReponse;
  private int idQuestionRepondu;
  private boolean estEngage;
}
