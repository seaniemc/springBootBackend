package com.langon.controller;

import com.langon.model.User;
import com.langon.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Date;
import java.util.Map;

/**
 * Created by smcgrath on 26/09/2017.
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="login", method=RequestMethod.POST)
    public String login(@RequestBody Map<String, String> jsonLoginDetails)throws ServletException{
        if(jsonLoginDetails.get("username") ==null || jsonLoginDetails.get("password") == null){
            throw new ServletException("Please fill in username and password");
        }

        String username = jsonLoginDetails.get("username");
        String password = jsonLoginDetails.get("password");

        User user = userService.findByUsername((username));

        if(user == null ){
            throw new ServletException("Username not found.");
        }

        String pwd = user.getPassword();

        if (!password.equals(pwd)){
            throw new ServletException("Invalid login. Please check your username and password");
        }

        return Jwts.builder().setSubject(username).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact();
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public User registerUser(@RequestBody User user) {
        return userService.save(user);
    }

}
