package vinci.be.backend;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BackendService {
    private final UserRepository userRepository;

    public BackendService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createOne(UserModel user){
        if (userRepository.existsByEmail(user.getEmail())){
            return null;
        }

        return userRepository.save(user);
    }

    public List<UserModel> getAll(){
        return (List<UserModel>) userRepository.findAll();
    }
}