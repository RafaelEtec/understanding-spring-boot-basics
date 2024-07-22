package goulart.proj.first_proj;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String plainPass = "something2024";
        String encodedPass = passwordEncoder.encode(plainPass);

        System.out.println(encodedPass);
    }
}