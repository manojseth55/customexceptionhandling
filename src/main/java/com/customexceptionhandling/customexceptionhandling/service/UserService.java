package com.customexceptionhandling.customexceptionhandling.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.customexceptionhandling.customexceptionhandling.model.User;

@Component
public class UserService {

    private static List<User> users = new ArrayList<>();
    private static int userCount = 2;
    static {
        users.add(new User(1, "Jhon", new Date()));
        users.add(new User(2, "James", new Date()));
    }

    public List<User> getAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User getById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }

        return null;
    }
}
