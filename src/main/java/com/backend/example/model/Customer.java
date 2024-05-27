package com.backend.example.model;


public class Customer {

    private String id;

    private String email;

    private String ipAddress;

    public Customer(String id, String email, String ipAddress) {
        this.id = id;
        this.email = email;
        this.ipAddress = ipAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
}
