package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Linh");
        u1.setAccount("linh");
        u1.setEmail("linhdz@gmail.com");
        u1.setPassword("123456");
        users.add(u1);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())
            ) {
                return u;
            }
        }
        return null;
    }

}
