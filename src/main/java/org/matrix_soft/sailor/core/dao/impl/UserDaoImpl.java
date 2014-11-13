package org.matrix_soft.sailor.core.dao.impl;

import org.matrix_soft.sailor.core.dao.UserDao;
import org.matrix_soft.sailor.core.entity.User;
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
    @Transactional
    public void save(User user) {
        em.persist(user);
    }
}
