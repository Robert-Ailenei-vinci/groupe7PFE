package vinci.be.backend.model.reponse;

import org.springframework.data.annotation.Id;

public class Reponse {
  @Id
  private int id;
  private String intitule;
  private double point;
}
