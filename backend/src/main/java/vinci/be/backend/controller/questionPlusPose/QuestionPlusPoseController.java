package vinci.be.backend.controller.questionPlusPose;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vinci.be.backend.model.questionPlusPose.QuestionPlusPose;
import vinci.be.backend.service.questionPlusPose.QuestionPlusPoseService;

@Controller
@CrossOrigin(origins = "*")
public class QuestionPlusPoseController {

  private final QuestionPlusPoseService questionPlusPoseService;

  public QuestionPlusPoseController(QuestionPlusPoseService questionPlusPoseService) {
    this.questionPlusPoseService = questionPlusPoseService;
  }

  @GetMapping("/questionsPlusPose/getAll")
  public ResponseEntity<List<QuestionPlusPose>> getAllQuestionsPose(){
    List<QuestionPlusPose> questions = questionPlusPoseService.getAllQuestionsPose();
    return new ResponseEntity<>(questions,HttpStatus.OK);
  }

  @PostMapping("/questionsPlusPose/add")
  public ResponseEntity<QuestionPlusPose> addQuestionPose(@RequestBody QuestionPlusPose questionPlusPose){

    if(questionPlusPose.invalid()){
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    QuestionPlusPose question = questionPlusPoseService.addQuestionPose(questionPlusPose);

    return new ResponseEntity<>(question,HttpStatus.CREATED);
  }
}
