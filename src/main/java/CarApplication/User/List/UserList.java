package CarApplication.User.List;

import CarApplication.User.List.User;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class UserList {
    private Map<String, User> userMap; // Use a Map to store users by username

    public UserList() {
        userMap = new HashMap<>();
    }

    public void addUser(User user) {
        userMap.put(user.getUsername(), user);
    }

    public User findUserByUsername(String username) {
        return userMap.get(username);
    }

    @Override
    public String toString() {
        return "UserList{" +
                "userMap=" + userMap +
                '}';
    }
}