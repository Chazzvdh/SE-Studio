package main.java.classes;

import main.java.interfaces.User;

// Administrator class implementing User interface
public class Administrator implements User {
    private String name;
    private String email;
    private String address;

    // Constructor
    public Administrator(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Getter and Setter methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // toString method
    @Override
    public String toString() {
        return "Administrator{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
