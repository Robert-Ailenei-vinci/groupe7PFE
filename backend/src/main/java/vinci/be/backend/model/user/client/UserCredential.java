package vinci.be.backend.model.user.client;

import java.util.regex.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCredential {

  private String email;
  private String password;

  public boolean isValid() {
    return email != null && Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email) && password != null && !password.isEmpty();
  }
}

