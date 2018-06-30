package com.internship.intern.student.domain.modal;


import com.internship.intern.User.domain.modal.User;
import com.internship.intern.User.domain.modal.UserImpl;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "dt_student")
public class StudentImpl implements Student, Serializable {



    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "dt_student_id")
    private long studentId;

    @Column(name = "dt_student_matric")
    private String studentMatric;

    @Column(name = "dt_student_ic")
    private String studentIc;

    @Column(name = "dt_student_course")
    private String studentCourse;

    @Column(name = "dt_student_cgpa")
    private String studentCgpa;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dt_student_user_id", nullable = false)
    private UserImpl user;

    @Column(name = "dt_student_department")
    private String studentDepartment;

    public StudentImpl(){

    }

    public StudentImpl(String studentMatric, String studentIc, String studentCourse,
                       String studentCgpa, UserImpl user, String studentDepartment) {
        this.studentMatric = studentMatric;
        this.studentIc = studentIc;
        this.studentCourse = studentCourse;
        this.studentCgpa = studentCgpa;
        this.user = user;
        this.studentDepartment = studentDepartment;
    }

    @Override
    public void setStudentId(long id) {
        this.studentId = id;
    }

    @Override
    public long getStudentId() {
        return this.studentId;
    }

    @Override
    public void setStudentMatric(String studentMatric) {
        this.studentMatric = studentMatric;
    }

    @Override
    public String getStudentMatric() {
        return this.studentMatric;
    }

    @Override
    public void setStudentIC(String studentIC) {
        this.studentIc = studentIC;
    }

    @Override
    public String getStudentIC() {
        return this.studentIc;
    }

    @Override
    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String getStudentCourse() {
        return this.studentCourse;
    }

    @Override
    public void setStudentCgpa(String studentCgpa) {
        this.studentCgpa = studentCgpa;
    }

    @Override
    public String getStudentCgpa() {
        return this.studentCgpa;
    }

    @Override
    public void setUser(UserImpl user) {
        this.user = user;
    }

    @Override
    public UserImpl getUser() {
        return this.user;
    }

    @Override
    public void setDepartment(String department) {
        this.studentDepartment = department;
    }

    @Override
    public String getDepartment() {
        return this.studentDepartment;
    }
}
