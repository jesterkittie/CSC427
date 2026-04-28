package edu.secourse.salonapp.models;

public class Customer extends User {
    public Customer(String user, String pass, String n, String mail) {
        super(user, pass, n, mail, "customer");
    }
}
