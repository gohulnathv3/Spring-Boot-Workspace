package com.gohul.restfulwebservices.user;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;
    static {
        users.add(
                new User(1,"Gohul", new Date())
        );
        users.add(
                new User(2, "Arun", new Date())
        );
        users.add(
                new User(3, "Priya", new Date())
        );

    }
    // find all users
    public List<User> findAll(){
        return users;
    }
    // save user
    public User save (User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    // find one user
    public User findOne(int id){
        for(User user:users){
            if (user.getId()==id){
                return user;
            }
        }
        return null;
    }

    // delete the user


    public User deleteByUsedId(int id){
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if (user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
