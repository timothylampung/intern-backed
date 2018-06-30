package com.internship.intern.User.domain.dao;

import com.internship.intern.User.domain.modal.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public User saveUser(User user) {
        try {
            em.persist(user);

            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User findUserById(long id) {
        try {
            Query q = em.createQuery("select e from user e where e.id = "+id);
            return (User) q.getResultList().get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findUsers() {
        try {
            Query q = em.createQuery("select e from user e");
            return q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User deleteUserById(User user) {
        try {
            em.remove(user);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
