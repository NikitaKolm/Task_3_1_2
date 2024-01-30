package ru.javamentor.springmvc1.dao;

import ru.javamentor.springmvc1.model.User;
import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}
