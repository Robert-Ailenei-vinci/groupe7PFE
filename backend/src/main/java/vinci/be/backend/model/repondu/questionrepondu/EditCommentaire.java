package vinci.be.backend.model.repondu.questionrepondu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EditCommentaire {

  private String idQuestion;
  private String commentaire;
}
