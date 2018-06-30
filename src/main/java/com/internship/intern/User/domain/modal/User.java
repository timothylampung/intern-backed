package com.internship.intern.User.domain.modal;

import com.internship.intern.student.domain.modal.StudentImpl;

public interface User {

    void setUserId(long userId);

    long getUserId();

    void setUsername(String username);

    String getUsername();

    void setUserPassword(String password);
    String getPassword();

    void setAccessLevel(long accessLevel);
    long getAccessLevel();

    void setUserContact(String userContact);

    String getUserContact();

    void setUserEmail(String userEmail);

    String getUserEmail();


    void setStudent(StudentImpl student);

    StudentImpl getStudent();



}
