package vinci.be.backend.model.questionPlusPose;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "questionsPlusPoses")
public class QuestionPlusPose {
  @Id
  private String id;
  private String intitule;

  /**
   * Méthode permettant de valider toutes les données d'entrée
   * @return true si les données sont invalides, false sinon
   */
  public boolean invalid() {
    return intitule == null || intitule.isBlank();
  }
}
