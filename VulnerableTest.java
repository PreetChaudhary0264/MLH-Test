// VulnerableTest.java
import java.sql.*;
import java.util.*;
import java.io.*;

public class VulnerableTest {

    // 🔴 Secret Scanner trigger karega
    String password = "supersecret123";
    String api_key = "myapikey_abcdef";

    // 🔴 OWASP - SQL Injection
    public void getUserData(String userId) throws Exception {
        Connection conn = null;
        String query = "SELECT * FROM users WHERE id = " + userId;
        conn.createStatement().execute(query);
    }

    // 🔴 OWASP - Command Injection
    public void runCommand(String userInput) throws Exception {
        Runtime.getRuntime().exec("ls " + userInput);
    }

    // 🟡 Rules - print statements
    public void calculate(int x) {
        System.out.println("debug value: " + x);
        System.out.println("entering calculate");

        // TODO: fix this later
        int result = x * 2;
        System.out.println(result);
    }
    

    // 🔴 OWASP - Weak hashing
    public String hashPassword(String pass) throws Exception {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        return md.digest(pass.getBytes()).toString();
    }
}
