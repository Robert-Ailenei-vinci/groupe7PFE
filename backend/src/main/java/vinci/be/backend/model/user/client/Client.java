package vinci.be.backend.model.user.client;

import java.util.List;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import vinci.be.backend.model.template.question.Question.Templates;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "clients")
public class Client {
  @Id
  private String id;
  private String prenom;
  private String nom;
  private String email;
  private String fonction;
  private String nomEntreprise;
  private String numEntreprise;
  private String formeJuridique;
  private String adresseSiegeSocial;
  private String adresseSiteWeb;
  private String codeNace;
  private String activitePrincipale;
  private boolean estProprietaire;
  private boolean vendProduit;
  private boolean vendService;
  private double dernierChiffreDAffaire;
  private boolean estFranchise;
  private int nbTravailleur;
  private boolean estDansUnLitige;
  private boolean demandeDeLabel;
  private String partenaire;
  private String commentaire;
  private String password;
  private List<Templates> templates;

  /**
   * Méthode permettant de valider toutes les données d'entrée
   * @return true si les données sont invalides, false sinon
   */
  public boolean invalid() {
    return prenom == null || prenom.isBlank() ||
        nom == null || nom.isBlank() ||
        email == null || !email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$") ||
        nomEntreprise == null || nomEntreprise.isBlank() ||
        dernierChiffreDAffaire < 0 ||
        nbTravailleur < 0 ||
        password == null;
  }

}
