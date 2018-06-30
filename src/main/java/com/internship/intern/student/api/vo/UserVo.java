package com.internship.intern.student.api.vo;

public class UserVo {

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public long getUserAccessLevel() {
        return userAccessLevel;
    }

    public void setUserAccessLevel(long userAccessLevel) {
        this.userAccessLevel = userAccessLevel;
    }


    public UserVo(long userId, String userName, String userContact, String userEmail, String userPassword, long userAccessLevel) {
        this.userId = userId;
        this.userName = userName;
        this.userContact = userContact;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAccessLevel = userAccessLevel;
    }

    public UserVo() {
    }

    private long userId;
    private String userName;
    private String userContact;
    private String userEmail;
    private String userPassword;
    private long userAccessLevel;

}
