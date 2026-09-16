package session10.ex3.business;

import session10.ex3.entity.User;

import java.util.LinkedList;

public class UserManager {
    LinkedList<User> users;

    public UserManager() {
        users = new LinkedList<>();
    }

    // thêm người dùng
    public void addUser(User user) {
        users.add(user);
    }

    // xóa người dùng bằng email
    public boolean deleteUser(String email) {
        return users.removeIf(user -> user.getEmail().equals(email));
    }

    // hiển thị danh sách người dùng
    public void displayUsers() {
        if(users.isEmpty()) {
            System.out.println("Danh sách người dùng trống!");
        } else {
            for(User user : users) {
                System.out.println(user);
            }
        }
    }
}
