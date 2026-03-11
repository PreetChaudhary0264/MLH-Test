// VulnerableTest.java
import java.sql.*;
import java.util.*;
import java.io.*;

public class VulnerableTest {

    // 🔴 Secret Scanner trigger karega
    String password = "supersecret123";
    String api_key = "myapikey_abcdef";

    // 🔴 OWASP - SQL Injection
    

    // 🔴 OWASP - Weak hashing
    public String hashPassword(String pass) throws Exception {
        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
        return md.digest(pass.getBytes()).toString();
    }
}