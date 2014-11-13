package org.matrix_soft.sailor.core.service.impl;

import org.matrix_soft.sailor.core.dao.CompanyDao;
import org.matrix_soft.sailor.core.entity.Company;
import org.matrix_soft.sailor.core.service.CompanyService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by SERGE on 13.11.2014.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Inject
    private CompanyDao companyDao;

    @Override
    public Company findById(int id) {
        return companyDao.findById(id);
    }
}
