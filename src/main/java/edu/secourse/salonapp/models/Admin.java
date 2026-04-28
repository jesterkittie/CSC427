package edu.secourse.salonapp.models;

public class Admin extends User {
    public Admin(String user, String pass, String n, String mail) {
        super(user, pass, n, mail, "admin");
    }
}
