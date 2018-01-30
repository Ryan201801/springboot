package com.ryan.springboot.service.impl;

import com.ryan.springboot.dao.UserDao;
import com.ryan.springboot.domain.User;
import com.ryan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/31.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userDao.findById(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void edit(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}