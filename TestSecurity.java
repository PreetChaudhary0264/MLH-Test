// VulnerableTest.java
import java.sql.*;

public class TestSecurity {

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
    

    // 🔴 OWASP - Weak hashing
    public String hashPassword(String pass) throws Exception {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        return md.digest(pass.getBytes()).toString();
    }
}
