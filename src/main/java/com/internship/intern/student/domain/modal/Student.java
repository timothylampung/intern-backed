package com.internship.intern.student.domain.modal;

import com.internship.intern.User.domain.modal.UserImpl;

public interface Student {

    void setStudentId(long id);

    long getStudentId();

    void setStudentMatric(String studentMatric);

    String getStudentMatric();

    void setStudentIC(String studentIC);

    String getStudentIC();

    void setStudentCourse(String studentCourse);

    String getStudentCourse();

    void setStudentCgpa(String studentCgpa);

    String getStudentCgpa();

    void setUser(UserImpl user);

    UserImpl getUser();


    void setDepartment(String department);

    String getDepartment();

}
