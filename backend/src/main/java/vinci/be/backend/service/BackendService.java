package vinci.be.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vinci.be.backend.model.User;
import vinci.be.backend.repository.UserRepository;

import java.util.List;

@Service
public class BackendService {

    private final UserRepository userRepository;

    @Autowired
    public BackendService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Méthode pour créer un utilisateur
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Méthode pour obtenir tous les utilisateurs
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
