package vinci.be.backend.model.consultant;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Consultant {
  @Id
  private String id;
  private String email;
  private String mdp;
}
