package vinci.be.backend.controller.repondu;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.questionnairerepondu.QuestionnaireRepondu;
import vinci.be.backend.service.repondu.QuestionnaireReponduService;

@RestController
//@RequestMapping("/questionnaireRepondu")
@CrossOrigin(origins = "*") // Autorise toutes les origines
public class QuestionnaireReponduController {

  private final QuestionnaireReponduService questionnaireReponduService;

  public QuestionnaireReponduController(QuestionnaireReponduService questionnaireReponduService) {
    this.questionnaireReponduService = questionnaireReponduService;
  }


  @PostMapping("/questionnaires/create/questionnaireESG")
  public ResponseEntity<QuestionnaireRepondu> createQuestionnaireESG(@RequestBody Map<String, String> body) {
    String idClient = body.get("idClient");
    QuestionnaireRepondu questionnaire = questionnaireReponduService.createOneESG(idClient);

    if (questionnaire == null) {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    return new  ResponseEntity<>(questionnaire, HttpStatus.CREATED);
  }


  @GetMapping("/questionnaires/{idClient}")
  public ResponseEntity<QuestionnaireRepondu> getQuestionnaireByIdClient(@PathVariable String idClient) {
    QuestionnaireRepondu questionnaire = questionnaireReponduService.getQuestionnaireByIdClient(idClient);

    if (questionnaire == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(questionnaire, HttpStatus.OK);
  }


  @PatchMapping("/questionnaires/validate/{idQuestionnaire}")
  public ResponseEntity<QuestionnaireRepondu> validateQuestionnaire(@PathVariable String idQuestionnaire) {
    QuestionnaireRepondu questionnaire = questionnaireReponduService.validateQuestionnaire(idQuestionnaire);

    if (questionnaire == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(questionnaire, HttpStatus.OK);
  }

  @PatchMapping("/questionnaires/finish/{idQuestionnaire}")
  public ResponseEntity<QuestionnaireRepondu> finishQuestionnaire(@PathVariable String idQuestionnaire) {
    QuestionnaireRepondu questionnaire = questionnaireReponduService.finishQuestionnaire(idQuestionnaire);

    if (questionnaire == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(questionnaire, HttpStatus.OK);
  }

}
