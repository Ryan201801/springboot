package com.ryan.springboot.service;

import com.ryan.springboot.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/31.
 */
public interface UserService {

    public List<User> getUserList();

    public User findUserById(long id);

    public void save(User user);

    public void edit(User user);

    public void delete(long id);


}