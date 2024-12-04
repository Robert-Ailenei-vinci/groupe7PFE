package vinci.be.backend.model.client;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client {
  @Id
  private int id;
  private String prenom;
  private String nom;
  private String email;
  private String fonction;
  private String nomEntreprise;
  private String numEntreprise;
  private String formeJuridique;
  private String adresseSiegeSocial;
  private String adresseSiteWeb;
  private String codeNaceActivitePrincipale;
  private double dernierChiffreDAffaire;
  private boolean estFranchise;
  private int nbTravailleur;
  private boolean estDansUnLitige;
  private boolean demandeDeLabel;
  private String partenaire;
  private String commentaire;
  private String mdp;
}
