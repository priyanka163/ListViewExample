package com.example.next.application1;

/**
 * Created by next on 30/3/17.
 */
public class LoginModel {

    String UserName;
    String Password;

    public LoginModel(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    public LoginModel() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
