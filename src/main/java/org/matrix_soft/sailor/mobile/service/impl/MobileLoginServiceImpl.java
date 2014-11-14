package org.matrix_soft.sailor.mobile.service.impl;

import org.matrix_soft.sailor.core.entity.User;
import org.matrix_soft.sailor.core.entity.UserType;
import org.matrix_soft.sailor.core.service.UserService;
import org.matrix_soft.sailor.mobile.model.LoginModel;
import org.matrix_soft.sailor.mobile.service.MobileLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.AssertFalse;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by Matrix on 14.11.2014.
 */
@Service
public class MobileLoginServiceImpl implements MobileLoginService {

    private final static Logger logger = LoggerFactory.getLogger(MobileLoginServiceImpl.class);

    @Inject
    private UserService userService;

    @Override
    @AssertFalse
    public boolean login(@Valid LoginModel loginModel) {
        logger.info("login model = {}", loginModel);

        User user = userService.findByUsername(loginModel.getEmail(), UserType.MOBILE_USER);

        logger.info("login method with username = {}, user = {}", loginModel.getEmail(), user);

        if (user == null) return false;

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(loginModel.getPassword(), user.getPassword());
    }
}
