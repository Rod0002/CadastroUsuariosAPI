package com.rodrigo.cadastrousuarios.service;

import java.util.List;
import com.rodrigo.cadastrousuarios.User;


public interface UserService {
    User saveUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
