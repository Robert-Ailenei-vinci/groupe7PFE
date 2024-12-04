package vinci.be.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String email;

    // Constructeur sans id (optionnel si Lombok est utilisé)
    public User(String email) {
        this.email = email;
    }
}
