package org.matrix_soft.sailor.core.service;

import org.matrix_soft.sailor.core.entity.User;
import org.matrix_soft.sailor.core.entity.UserType;

/**
 * Created by SERGE on 13.11.2014.
 */
public interface UserService {
    public User findByUsername(String username);

    public User findByUsername(String username, UserType userType);

    public void save(User user);
}
