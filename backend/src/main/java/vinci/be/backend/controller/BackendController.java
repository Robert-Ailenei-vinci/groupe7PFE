package vinci.be.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vinci.be.backend.model.User;
import vinci.be.backend.service.BackendService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*") // Autorise toutes les origines
public class BackendController {

  private final BackendService backendService;

  @Autowired
  public BackendController(BackendService backendService) {
    this.backendService = backendService;
  }

  // Endpoint pour créer un utilisateur (POST)
  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody User user) {
    System.out.println(user);
    User createdUser = backendService.createUser(user);
    return ResponseEntity.ok(createdUser);
  }

  // Endpoint pour obtenir tous les utilisateurs (GET)
  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
    List<User> users = backendService.getAllUsers();
    return ResponseEntity.ok(users);
  }
}
