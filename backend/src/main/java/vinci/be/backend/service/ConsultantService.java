package vinci.be.backend.service;

import org.springframework.stereotype.Service;
import vinci.be.backend.repository.ConsultantRepository;

@Service
public class ConsultantService {

  private final ConsultantRepository consultantRepository;

  public ConsultantService(ConsultantRepository consultantRepository) {
    this.consultantRepository = consultantRepository;
  }
}
