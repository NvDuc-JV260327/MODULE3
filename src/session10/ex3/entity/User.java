package session10.ex3.entity;

public class User {
    private String userName;
    private String email;
    private String phoneNumber;

    public User(String userName, String email, String phoneNumber) {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Tên: " + userName + ", Email: " + email + ", Số điện thoại: " + phoneNumber;
    }
}
