package com.internship.intern.student.domain.dao;


import com.internship.intern.student.api.vo.StudentProfileVo;
import com.internship.intern.student.domain.modal.Student;

import java.util.List;

public interface StudentDao {

    void saveStudent(StudentProfileVo student);
    Student findStudentById(long id);
    List<Student> findStudents();
    Student  deleteStudentById(Student student);
}
