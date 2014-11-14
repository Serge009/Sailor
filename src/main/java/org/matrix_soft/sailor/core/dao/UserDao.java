package org.matrix_soft.sailor.core.dao;

import org.matrix_soft.sailor.core.entity.User;
import org.matrix_soft.sailor.core.entity.UserType;

/**
 * Created by SERGE on 13.11.2014.
 */
public interface UserDao {
    public User findByUsername(String username);

    public void save(User user);

    public User findByUsername(String username, UserType userType);
}
