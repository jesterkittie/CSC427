package edu.secourse.salonapp.models;


public class Stylist extends User {
    public Stylist(String user, String pass, String n, String mail) {
        super(user, pass, n, mail, "stylist");
    }
}