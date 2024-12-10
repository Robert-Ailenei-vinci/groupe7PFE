package vinci.be.backend.model.repondu.questionnairerepondu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PourcentageQuestionnaire {

  private String idQuestionnaire;
  private double pourcentageTotal;
  private double pourcentageEnvironment;
  private double pourcentageSocial;
  private double pourcentageGouvernance;
}
