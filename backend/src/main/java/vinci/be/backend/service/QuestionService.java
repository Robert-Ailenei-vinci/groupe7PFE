package vinci.be.backend.service;

import org.springframework.stereotype.Service;
import vinci.be.backend.repository.QuestionRepository;
import vinci.be.backend.repository.ReponseRepository;

@Service
public class QuestionService {

  private final QuestionRepository questionRepository;
  private final ReponseRepository reponseRepository;

  public QuestionService(QuestionRepository questionRepository, ReponseRepository reponseRepository) {
    this.questionRepository = questionRepository;
    this.reponseRepository = reponseRepository;
  }
}
