package vinci.be.backend.controller.reponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.questionnairerepondu.QuestionnaireRepondu;
import vinci.be.backend.model.reponserepondu.ReponseRepondu;
import vinci.be.backend.service.repondu.ReponseReponduService;

@RestController
@CrossOrigin(origins = "*") // Autorise toutes les origines
public class ReponseReponduController {

  private final ReponseReponduService reponseReponduService;

  public ReponseReponduController(ReponseReponduService reponseReponduService) {
    this.reponseReponduService = reponseReponduService;
  }

  @PatchMapping("/reponses/selectReponse/{id}")
  public ResponseEntity<ReponseRepondu> selectReponse(@PathVariable String id) {

    ReponseRepondu reponseRepondu = reponseReponduService.selectReponse(id);

    if (reponseRepondu == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(reponseRepondu,HttpStatus.OK);
  }
}
