package vinci.be.backend.model.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClientCredential {

  private String email;
  private String mdp;
}
