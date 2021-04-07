package com.sudharsan.integra.Models;

public class UserPojo {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public UserPojo(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public UserPojo(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public UserPojo() {
    }

    int id;
    String name, emailId;

}
