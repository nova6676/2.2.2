package service;

import model.User;


import javax.validation.Valid;
import java.util.List;

public interface UserService {

    void save(@Valid User user);
    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void update(User user);
}


