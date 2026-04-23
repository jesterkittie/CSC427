package edu.secourse.salonapp.models;

public class User {
    //account number assignment
    private static int nextAccountNumber = 1;

    private int accountNumber;
    private String username;
    private String password;
    private String name;
    private String email;
    private String role; // customer, admin, stylist

    // constructor
    public User(String user, String pass, String n, String mail, String r) {
        accountNumber = nextAccountNumber++;
        username = username;
        password = password;
        name = name;
        email = email;
        role = role;
    }

    // getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    // setters
    public void setUsername(String user) {
        username = user;
    }

    public void setPassword(String pass) {
        password = pass;
    }

    public void setName(String n) {
        name = n;
    }

    public void setEmail(String mail) {
        email = mail;
    }

    public void setRole(String r) {
        role = r;
    }
}
