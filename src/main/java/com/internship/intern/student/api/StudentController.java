package com.internship.intern.student.api;
import com.internship.intern.student.api.vo.StudentProfileVo;
import com.internship.intern.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(path = "/register/student")
    public void saveStudent(@RequestBody StudentProfileVo studentProfileVo){
        studentService.saveStudent(studentProfileVo);

    }

    @GetMapping(path = "get/students")
    public List<StudentProfileVo> findStudents(){
        return studentService.findStudents();
    }
}
