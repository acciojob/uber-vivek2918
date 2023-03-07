package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admnId;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(int admnId, String username, String password) {
        this.admnId = admnId;
        this.username = username;
        this.password = password;
    }

    public int getAdmnId() {
        return admnId;
    }

    public void setAdmnId(int admnId) {
        this.admnId = admnId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}