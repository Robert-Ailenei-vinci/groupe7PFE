package vinci.be.backend.controller.consultant;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.service.ConsultantService;

@RestController
@RequestMapping("/consultants")
@CrossOrigin(origins = "*")
public class ConsultantController {

  private final ConsultantService consultantService;

  public ConsultantController(ConsultantService consultantService) {
    this.consultantService = consultantService;
  }
}
