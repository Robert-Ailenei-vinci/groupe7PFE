package vinci.be.backend.controller.consultant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.client.UserCredential;
import vinci.be.backend.model.consultant.Consultant;
import vinci.be.backend.service.consultant.ConsultantService;

@RestController
public class ConsultantController {

  private final ConsultantService consultantService;

  public ConsultantController(ConsultantService consultantService) {
    this.consultantService = consultantService;
  }

  @PostMapping("/consultants/login")
  public ResponseEntity<Consultant> loginConsultant(@RequestBody UserCredential consultant) {

    if(!consultant.isValid()) return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

    Consultant actualConsultant = consultantService.loginConsultant(consultant);

    if(actualConsultant == null) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    return new ResponseEntity<>(actualConsultant, HttpStatus.OK);
  }
}
