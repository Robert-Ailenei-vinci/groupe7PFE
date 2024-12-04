package vinci.be.backend;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idUser;

    @Column(nullable = false)
    private String email;

    // Constructeur sans IdUser
    public UserModel(String name, String email) {
        this.email = email;
    }
}