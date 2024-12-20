package vinci.be.backend.controller.repondu.reponseRepondu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.template.reponse.EditReponse;
import vinci.be.backend.model.repondu.reponserepondu.ReponseRepondu;
import vinci.be.backend.service.repondu.ReponseReponduService;

@RestController
@CrossOrigin(origins = "*") // Autorise toutes les origines
public class ReponseReponduController {

  private final ReponseReponduService reponseReponduService;

  public ReponseReponduController(ReponseReponduService reponseReponduService) {
    this.reponseReponduService = reponseReponduService;
  }

  @PatchMapping("/reponses/editReponse")
  public ResponseEntity<ReponseRepondu> selectReponse(@RequestBody EditReponse editReponse) {
    // System.out.println("IN"+editReponse);

    ReponseRepondu reponseRepondu = reponseReponduService.selectReponse(editReponse.getIdReponse(),
        editReponse.isSelectionne(), editReponse.isEngage());

    if (reponseRepondu == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    // System.out.println("OUT"+reponseRepondu);
    return new ResponseEntity<>(reponseRepondu,HttpStatus.OK);
  }

}