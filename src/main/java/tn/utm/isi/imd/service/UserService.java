package tn.utm.isi.imd.service;

import java.util.List;

import tn.utm.isi.imd.model.User;
import tn.utm.isi.imd.model.UserDto;;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);
    User findById(Long id);
}
