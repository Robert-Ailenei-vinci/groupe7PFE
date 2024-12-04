package vinci.be.backend;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

public class BackendController {

  private final BackendService backendService;

  public BackendController(BackendService backendService) {
    this.backendService = backendService;
  }

  @PostMapping("/users")
  public UserModel createOne(@RequestBody UserModel user){

    UserModel toRet=backendService.createOne(user);

    if (toRet==null) throw new ResponseStatusException(HttpStatus.CONFLICT); //check si il y a deja un compte avec le mail en param
    else return toRet;
  }

  @GetMapping("/users")
  public List<UserModel> getAll(){

    return backendService.getAll();
  }
}
