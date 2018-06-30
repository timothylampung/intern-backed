package com.internship.intern.User.domain.dao;

import com.internship.intern.User.domain.modal.User;

import java.util.List;

public interface UserDao {
    User saveUser(User user);
    User findUserById(long id);
    List<User> findUsers();
    User deleteUserById(User user);
}
