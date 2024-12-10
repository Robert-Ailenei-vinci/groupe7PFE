package vinci.be.backend.model.template.reponse;

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
public class EditReponse {

  private String idReponse;
  private boolean selectionne;
  private boolean engage;

}
