package com.langon.service;

import com.langon.model.User;

import java.util.List;

/**
 * Created by smcgrath on 26/09/2017.
 */
public interface UserService {
    List <User> findAllUsers();
    User findByUsername(String userName);
    User save (User user);

}
