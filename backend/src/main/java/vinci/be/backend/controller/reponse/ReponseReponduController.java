package vinci.be.backend.controller.reponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.reponse.EditReponse;
import vinci.be.backend.model.reponserepondu.ReponseRepondu;
import vinci.be.backend.service.repondu.ReponseReponduService;

@RestController
@CrossOrigin(origins = "*") // Autorise toutes les origines
public class ReponseReponduController {

  private final ReponseReponduService reponseReponduService;

  public ReponseReponduController(ReponseReponduService reponseReponduService) {
    this.reponseReponduService = reponseReponduService;
  }

  @PatchMapping("/reponses/selectReponse")
  public ResponseEntity<ReponseRepondu> selectReponse(@RequestBody EditReponse editReponse) {
    System.out.println(editReponse);

    ReponseRepondu reponseRepondu = reponseReponduService.selectReponse(editReponse.getIdReponse(),
        editReponse.isSelectionne());

    if (reponseRepondu == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(reponseRepondu,HttpStatus.OK);
  }
}
