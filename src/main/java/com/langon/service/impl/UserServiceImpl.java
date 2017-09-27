package com.langon.service.impl;

import com.langon.dao.UserDao;
import com.langon.model.User;
import com.langon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by smcgrath on 26/09/2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User findByUsername(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }
}
