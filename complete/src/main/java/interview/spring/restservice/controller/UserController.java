package interview.spring.restservice.controller;

import interview.spring.restservice.dao.UserDaoService;
import interview.spring.restservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserDaoService userDaoService;
    UserController(UserDaoService service){
        userDaoService = service;
    }
    @GetMapping()
    public List<User> getUsers(){
        return userDaoService.getAllUsers();
    }
    @PostMapping()
    public User createUser(@RequestBody User user){
        userDaoService.createUser(user);
        return user;
    }
    @PutMapping("/{id}")
    public ResponseEntity updateExistingUser(@PathVariable UUID id, @RequestBody User user){
        return userDaoService.updateFullUser(id, user);
    }
    @PatchMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable UUID id, @RequestBody Map<Object, Object> patchFields){
        return userDaoService.updatePartialUser(id, patchFields);
    }

}
