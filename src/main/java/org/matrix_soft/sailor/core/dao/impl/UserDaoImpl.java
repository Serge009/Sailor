package org.matrix_soft.sailor.core.dao.impl;

import org.matrix_soft.sailor.core.dao.UserDao;
import org.matrix_soft.sailor.core.entity.User;
import org.matrix_soft.sailor.core.entity.UserType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by SERGE on 13.11.2014.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public User findByUsername(String username) {
        return em.createQuery("from User u where u.username = " + username, User.class).getSingleResult();
    }

    @Override
    public User findByUsername(String username, UserType userType) {
        return em.createQuery("from User u where u.username = '" + username + "' AND u.userType = '" + userType.name() + "'", User.class).getSingleResult();
    }

    @Override
    @Transactional
    public void save(User user) {
        em.persist(user);
    }
}
