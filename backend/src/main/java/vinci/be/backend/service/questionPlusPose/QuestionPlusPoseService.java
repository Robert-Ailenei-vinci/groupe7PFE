package vinci.be.backend.service.questionPlusPose;

import java.util.List;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.questionPlusPose.QuestionPlusPose;
import vinci.be.backend.repository.QuestionPlusPoseRepository;

@Service
public class QuestionPlusPoseService {

  private final QuestionPlusPoseRepository questionPlusPoseRepository;

  public QuestionPlusPoseService(QuestionPlusPoseRepository questionPlusPoseRepository) {
    this.questionPlusPoseRepository = questionPlusPoseRepository;
  }

  public List<QuestionPlusPose> getAllQuestionsPose(){
    return questionPlusPoseRepository.findAll();
  }

  public QuestionPlusPose addQuestionPose(QuestionPlusPose questionPlusPose) {
    questionPlusPose.setIntitule(questionPlusPose.getIntitule().trim());
    return questionPlusPoseRepository.save(questionPlusPose);
  }
}
