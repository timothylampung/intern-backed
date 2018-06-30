package com.internship.intern.student.domain.dao;

import com.internship.intern.User.domain.modal.User;
import com.internship.intern.User.domain.modal.UserImpl;
import com.internship.intern.student.api.vo.StudentProfileVo;
import com.internship.intern.student.api.vo.StudentVo;
import com.internship.intern.student.api.vo.UserVo;
import com.internship.intern.student.domain.modal.Student;
import com.internship.intern.student.domain.modal.StudentImpl;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class StudentDaoImpl  implements StudentDao{

    @PersistenceContext
    private
    EntityManager em;

    public StudentDaoImpl(){}


    @Override
    public void saveStudent(StudentProfileVo studentProfileVo) {
        try {

            StudentVo studentVo = studentProfileVo.getStudentVo();
            UserVo userVo = studentProfileVo.getUserVo();

            Student student = new StudentImpl();
            User user = new UserImpl();

            student.setStudentMatric(studentVo.getStudentMatric());
            student.setStudentIC(studentVo.getStudentIc());
            student.setStudentCourse(studentVo.getStudentCourse());
            student.setStudentCgpa(studentVo.getStudentCgpa());
            student.setDepartment(studentVo.getStudentDepartment());

            user.setUsername(userVo.getUserName());
            user.setUserEmail(userVo.getUserEmail());
            user.setUserContact(userVo.getUserContact());
            user.setAccessLevel(userVo.getUserAccessLevel());
            user.setUserPassword(userVo.getUserPassword());


            em.persist(user);

            student.setUser((UserImpl) user);


            em.persist(student);

            em.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findStudentById(long id) {
        try {
            Query q = em.createQuery("select e from StudentImpl e where e.id ="+id);
            return (Student) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> findStudents() {
        try {
            Query q = em.createQuery("select e from StudentImpl e");

            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student deleteStudentById(Student student) {
        em.remove(student);
        return student;
    }
}
