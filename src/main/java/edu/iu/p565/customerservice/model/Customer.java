package edu.iu.p565.customerservice.model;

import jakarta.validation.constraints.NotEmpty;

import java.util.*;

public class Customer {
    private int id;
    @NotEmpty(message = "name cant be empty")
    private String name;
    private String email;
   

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
