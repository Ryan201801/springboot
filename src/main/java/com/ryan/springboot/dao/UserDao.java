package com.ryan.springboot.dao;

import com.ryan.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findById(long id);
    Long deleteById(Long id);
}