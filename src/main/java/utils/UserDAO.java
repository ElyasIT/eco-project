/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zyin2
 */
public class UserDAO {
    private static final Map<String, String> USERS = new HashMap<>();

    static {
        USERS.put("User", "12345678");
    }

    public static boolean validate(String username, String password) {
        return USERS.containsKey(username) && USERS.get(username).equals(password);
    }
}
