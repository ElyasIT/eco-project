/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.HashMap;
import java.util.Map;
import model.entity.User;

/**
 *
 * @author zyin2
 */
public class UserDAO implements IUserDAO{

    private static final Map<String, String[]> USERS = new HashMap<>();

    static {
        USERS.put("User", new String[]{"12345678", "ADMIN"});
        USERS.put("EMPLOYEE", new String[]{"12345678", "EMPLOYEE"});

    }

    @Override
    public boolean validate(String username, String password) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (password == null || password.length() < 8) {
            return false;
        }
        return USERS.containsKey(username) && USERS.get(username)[0].equals(password);
    }

    @Override
    public boolean isAdmin(String username) {
        return USERS.containsKey(username) && USERS.get(username)[1].equals("ADMIN");
    }
}
