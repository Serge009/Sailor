package org.matrix_soft.sailor.core.service.impl;

import org.matrix_soft.sailor.core.dao.UserDao;
import org.matrix_soft.sailor.core.entity.User;
import org.matrix_soft.sailor.core.entity.UserType;
import org.matrix_soft.sailor.core.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by SERGE on 13.11.2014.
 */
@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findByUsername(String username, UserType userType) {
        return userDao.findByUsername(username, userType);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }
}
