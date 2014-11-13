package org.matrix_soft.sailor.core.dao.impl;

import org.matrix_soft.sailor.core.dao.CompanyDao;
import org.matrix_soft.sailor.core.entity.Company;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by SERGE on 13.11.2014.
 */
@Repository
public class CompanyDaoImpl implements CompanyDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Company findById(int id) {
        return em.find(Company.class, id);
    }
}
