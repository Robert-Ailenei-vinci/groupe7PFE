package vinci.be.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.service.QuestionnaireService;

@RestController
@RequestMapping("/api/addInDB")
@CrossOrigin(origins = "*") // Autorise toutes les origines
public class QuestionnaireController {

  private final QuestionnaireService questionnaireService;

  @Autowired
  public QuestionnaireController(QuestionnaireService questionnaireService) {
    this.questionnaireService = questionnaireService;
  }

  @GetMapping
  public void addInDB(){
    questionnaireService.addInDB();
  }
}
