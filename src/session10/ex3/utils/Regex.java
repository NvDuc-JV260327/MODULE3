package session10.ex3.utils;

public class Regex {
    // regex email
    public static boolean regexEmail(String email) {
        String regex = "^[a-zA-Z0-9.-_]+@[a-zA-Z.-_]+\\.[a-zA-Z]{2,6}$";
        return email.matches(regex);
    }

    // regex số điện thoại
    public static boolean regexPhoneNumber(String phoneNumber) {
        String regex = "^0[135789][0-9]{8}$";
        return phoneNumber.matches(regex);
    }
}
