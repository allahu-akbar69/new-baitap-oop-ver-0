package gui;



import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Account {
    // Private fields: Chỉ được truy cập từ bên trong class
    private String username;
    private String password;

    // Constructor public: Dùng để khởi tạo tài khoản
    public Account(String username) {
        this.username = username;

    }

    // Public getter và setter cho username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Setter cho password: bảo vệ tính riêng tư
    public void setPassword(String password) {
        this.password = password;
    }

    // Không cung cấp getter cho password để bảo vệ dữ liệu nhạy cảm
    // Thay vào đó, tạo phương thức kiểm tra mật khẩu
//    public void checkPassword() {
//        danh_sach a = new danh_sach();
//        System.out.println(this.username + " " + this.password);
//        if (a.userCredentials.containsKey(this.username)) {
//            String storedPassword = a.userCredentials.get(this.username);
//            // Check if the input password matches the stored password
//            if (storedPassword.equals(this.password)) {
//                System.out.println("Login successful!");
//            } else {
//                System.out.println("Incorrect password!");
//            }
//        }
//        else{
//            System.out.println("Username not found!");
//        }
//    }
    // Public method: Hiển thị thông tin cơ bản
    public void displayAccountInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: [PROTECTED]");
    }
}


