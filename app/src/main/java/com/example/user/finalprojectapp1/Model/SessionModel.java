package com.example.user.finalprojectapp1.Model;

public class SessionModel {
    private String message;
    private String access_token;

    public SessionModel(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
