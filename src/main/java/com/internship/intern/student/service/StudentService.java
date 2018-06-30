package com.internship.intern.student.service;

import com.internship.intern.student.api.vo.StudentProfileVo;
import com.internship.intern.student.domain.modal.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentProfileVo student);
    Student findStudentById(long id);
    List<StudentProfileVo> findStudents();
    Student  deleteStudentById(Student student);
}
