package interview.spring.restservice.controller;

import interview.spring.restservice.entity.User;
import interview.spring.restservice.model.UserDto;
import interview.spring.restservice.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;
    private ModelMapper modelMapper;

    @Autowired
    public UserController(final UserService userService) {
        this.userService = userService;
        modelMapper = new ModelMapper();
    }

    @GetMapping()
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping()
    public User createUser(@RequestBody UserDto user) {
        return userService.createUser(modelMapper.map(user, User.class));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateExistingUser(@RequestBody UserDto user) {
        userService.updateUser(modelMapper.map(user, User.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateUser(@RequestBody UserDto user) {

        userService.updateUser(modelMapper.map(user, User.class));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
