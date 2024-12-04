package vinci.be.backend.model.consultant;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Consultant {
  @Id
  private int id;
  private String email;
  private String mdp;
}
