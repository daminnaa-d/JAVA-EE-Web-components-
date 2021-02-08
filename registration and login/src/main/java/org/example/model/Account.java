package org.example.model;

public class Account {
    private static Account account;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Account(){};

    public static Account getAccount() {
        if (account == null) {
            account = new Account();
        }
            return account;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
