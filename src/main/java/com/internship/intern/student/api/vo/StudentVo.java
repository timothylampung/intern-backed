package com.internship.intern.student.api.vo;

public class StudentVo {

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentMatric() {
        return studentMatric;
    }

    public void setStudentMatric(String studentMatric) {
        this.studentMatric = studentMatric;
    }

    public String getStudentIc() {
        return studentIc;
    }

    public void setStudentIc(String studentIc) {
        this.studentIc = studentIc;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentCgpa() {
        return studentCgpa;
    }

    public void setStudentCgpa(String studentCgpa) {
        this.studentCgpa = studentCgpa;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public StudentVo() {
    }

    public StudentVo(long studentId, String studentMatric, String studentIc, String studentCourse,
                     String studentCgpa, String studentDepartment) {
        this.studentId = studentId;
        this.studentMatric = studentMatric;
        this.studentIc = studentIc;
        this.studentCourse = studentCourse;
        this.studentCgpa = studentCgpa;
        this.studentDepartment = studentDepartment;
    }

    private long studentId;

    private String studentMatric;

    private String studentIc;

    private String studentCourse;

    private String studentCgpa;

    private String studentDepartment;




}
