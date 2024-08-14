package org.carlosramosdev.curso.springboot.webapp.webapp.models;

public class User {
    private String name;
    private String lastname;
    private String occupation;
    private String email;

    public User(){
    }
    public User(String name, String lastname, String occupation) {
        this.name = name;
        this.lastname = lastname;
        this.occupation = occupation;
    }

    public User(String name, String lastname, String occupation, String email) {
        this(name, lastname, occupation);
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
