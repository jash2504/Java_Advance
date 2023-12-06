package com.data;

public class MySimplePojo {
    private String name;
    private String email;
    private String comment;

    public MySimplePojo() {
    }

    public MySimplePojo(String name, String email, String comment) {
        this.name = name;
        this.email = email;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return String.format("User %s with email %s says %s", getName(), getEmail(), getComment());
    }
}
