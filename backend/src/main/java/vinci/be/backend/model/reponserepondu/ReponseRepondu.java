package vinci.be.backend.model.reponserepondu;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReponseRepondu {
  @Id
  private String id;
  private int idReponse;
  private int idQuestionRepondu;
  private boolean estEngage;
}
