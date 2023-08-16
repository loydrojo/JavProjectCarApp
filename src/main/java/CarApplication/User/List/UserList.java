package CarApplication.User.List;

import CarApplication.User.List.User;
import javafx.fxml.FXML;

import java.util.HashMap;
import java.util.Map;
public class UserList {
    @FXML
    private Map<String, User> userMap; // Use a Map to store users by username
    public UserList() {
        userMap = new HashMap<>();
    }
@FXML
    public void addUser(User user) {
        userMap.put(user.getUsername(), user);
    }
@FXML
    public User findUserByUsername(String username) {
        return userMap.get(username);
    }
}