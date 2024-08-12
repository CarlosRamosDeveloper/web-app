package org.carlosramosdev.curso.springboot.webapp.webapp.models;

public class User {
    private String name;
    private String lastname;
    private String ocupation;

    public User(String name, String lastname, String ocupation) {
        this.name = name;
        this.lastname = lastname;
        this.ocupation = ocupation;
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

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }
}
