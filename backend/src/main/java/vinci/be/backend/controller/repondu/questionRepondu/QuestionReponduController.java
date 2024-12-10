package vinci.be.backend.controller.repondu.questionRepondu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vinci.be.backend.model.repondu.questionrepondu.EditCommentaire;
import vinci.be.backend.model.repondu.questionrepondu.QuestionRepondu;
import vinci.be.backend.service.repondu.QuestionReponduService;

@RestController
@CrossOrigin(origins = "*") // Autorise toutes les origines
public class QuestionReponduController {

  private final QuestionReponduService questionReponduService;

  public QuestionReponduController(QuestionReponduService questionReponduService) {
    this.questionReponduService = questionReponduService;
  }

  @PatchMapping("/questions/editComment")
  public ResponseEntity<QuestionRepondu> editComment(@RequestBody EditCommentaire editCommentaire){

    QuestionRepondu questionRepondu = questionReponduService.editComment(editCommentaire.getIdQuestion(),
        editCommentaire.getCommentaire());

    if(questionRepondu == null){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }else {
      return new ResponseEntity<>(questionRepondu,HttpStatus.OK);
    }
  }
}
