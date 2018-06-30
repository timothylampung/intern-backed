package com.internship.intern.student.api.vo;

public class StudentProfileVo {

    public StudentProfileVo(StudentVo studentVo, UserVo userVo) {
        this.studentVo = studentVo;
        this.userVo = userVo;
    }

    public StudentProfileVo() {
    }

    public StudentVo getStudentVo() {
        return studentVo;
    }

    public void setStudentVo(StudentVo studentVo) {
        this.studentVo = studentVo;
    }


    public UserVo getUserVo() {
        return userVo;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    private StudentVo studentVo;

    private UserVo userVo;

}
