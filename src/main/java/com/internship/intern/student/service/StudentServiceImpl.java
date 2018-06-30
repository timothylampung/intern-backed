package com.internship.intern.student.service;

import com.internship.intern.User.domain.dao.UserDao;
import com.internship.intern.User.domain.modal.User;
import com.internship.intern.student.api.vo.StudentProfileVo;
import com.internship.intern.student.api.vo.StudentVo;
import com.internship.intern.student.api.vo.UserVo;
import com.internship.intern.student.domain.dao.StudentDao;
import com.internship.intern.student.domain.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    private final
    StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public void saveStudent(StudentProfileVo student) {
         studentDao.saveStudent(student);
    }

    @Override
    public Student findStudentById(long id) {
        return studentDao.findStudentById(id);
    }

    @Override
    public List<StudentProfileVo> findStudents() {

        List<StudentProfileVo> studentProfileVos = new ArrayList<>();

        List<Student> students = studentDao.findStudents();

        for(Student student : students){

            StudentProfileVo studentProfileVo = new StudentProfileVo();
            UserVo userVo = new UserVo();
            StudentVo studentVo = new StudentVo();

            studentVo.setStudentCgpa(student.getStudentCgpa());
            studentVo.setStudentCourse(student.getStudentCourse());
            studentVo.setStudentDepartment(student.getDepartment());
            studentVo.setStudentIc(student.getStudentIC());
            studentVo.setStudentMatric(student.getStudentMatric());
            studentVo.setStudentId(student.getStudentId());


            userVo.setUserContact(student.getUser().getUserContact());
            userVo.setUserEmail(student.getUser().getUserEmail());
            userVo.setUserName(student.getUser().getUsername());
            userVo.setUserId(student.getUser().getUserId());
            userVo.setUserAccessLevel(student.getUser().getAccessLevel());
//            userVo.setUserPassword(student.getUser().getPassword());

            studentProfileVo.setStudentVo(studentVo);
            studentProfileVo.setUserVo(userVo);

            studentProfileVos.add(studentProfileVo);
        }



        return studentProfileVos;
    }

    @Override
    public Student deleteStudentById(Student student) {
        return studentDao.deleteStudentById(student);
    }
}
