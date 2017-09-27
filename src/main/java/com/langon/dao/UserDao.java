package com.langon.dao;

import com.langon.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by smcgrath on 26/09/2017.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
    List<User> findAll();

    User findByUserName(String userName);

    User findByUserId(Long userId);

    User save (User user);
}
