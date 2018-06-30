package com.internship.intern.User.domain.modal;


import com.internship.intern.student.domain.modal.Student;
import com.internship.intern.student.domain.modal.StudentImpl;

import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "user")
@Table(name = "dt_user")
public class UserImpl implements User,Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "dt_user_id")
    long userId;

    @Column(name = "dt_user_name", length = 100, nullable = false)
    String userName;

    @Column(name = "dt_user_contact", length = 15, nullable = false)
    String userContact;

    @Column(name = "dt_user_email", length = 30, nullable = false)
    String userEmail;

    @Column(name = "dt_user_password", length = 100, nullable = false)
    String userPassword;

    @Column(name = "dt_user_access_level", length = 2, nullable = false)
    long userAccessLevel;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
    StudentImpl student;


    public UserImpl(){

    }


    public UserImpl(String userName, String userContact, String userEmail, StudentImpl student,String userPassword, long accessLevel) {
        this.userName = userName;
        this.userContact = userContact;
        this.userEmail = userEmail;
        this.student = student;
        this.userAccessLevel = accessLevel;
        this.userPassword = userPassword;
    }


    @Override
    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public long getUserId() {
        return this.userId;
    }

    @Override
    public void setUsername(String username) {
        this.userName = username;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public void setUserPassword(String password) {
        this.userPassword = password;
    }

    @Override
    public String getPassword() {
        return this.userPassword;
    }

    @Override
    public void setAccessLevel(long accessLevel) {
        this.userAccessLevel = accessLevel;

    }

    @Override
    public long getAccessLevel() {
        return this.userAccessLevel;
    }

    @Override
    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    @Override
    public String getUserContact() {
        return this.userContact;
    }

    @Override
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String getUserEmail() {
        return this.userEmail;
    }

    @Override
    public void setStudent(StudentImpl student) {
        this.student = student;
    }

    @Override
    public StudentImpl getStudent() {
        return this.student;
    }


}
