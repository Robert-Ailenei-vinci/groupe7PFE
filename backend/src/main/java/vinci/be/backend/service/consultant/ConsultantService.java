package vinci.be.backend.service.consultant;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.client.UserCredential;
import vinci.be.backend.model.consultant.Consultant;
import vinci.be.backend.repository.ConsultantRepository;

@Service
public class ConsultantService {

  private final ConsultantRepository consultantRepository;
  private final PasswordEncoder passwordEncoder;


  public ConsultantService(ConsultantRepository consultantRepository,
      PasswordEncoder passwordEncoder) {
    this.consultantRepository = consultantRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public Consultant loginConsultant(UserCredential consultantCredential) {

    Consultant actualConsultant = consultantRepository.findByEmail(consultantCredential.getEmail());

    if (actualConsultant == null ) {
      return null;
    }

    if (!passwordEncoder.matches(consultantCredential.getPassword(), actualConsultant.getPassword())) {
      return null;
    }
    return actualConsultant;
  }
}
