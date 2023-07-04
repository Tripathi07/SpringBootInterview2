package interview.spring.restservice.service;

import interview.spring.restservice.entity.User;

import java.util.List;

public interface UserService {

    List<User> createUsers(List<User> users);

    User createUser(User user);

    List<User> getAllUsers();

    void updateUser(User user);

}
