package com.allstate.quickclaimsserver;

import com.allstate.quickclaimsserver.domain.User;
import com.allstate.quickclaimsserver.domain.UserRole;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserDomainTesting {

    @Test
    public void test2UsersHaveDifferentUsernames() {
        User user1 = new User();
        User user2 = new User();
        user1.setUsername("olivia");
        user2.setUsername("oliver");
        assertNotEquals(user1, user2);
    }

    @Test
    public void test2UsersHaveTheSameName() {
        User user1 = new User();
        User user2 = new User();
        user1.setName("Tom");
        user2.setName("Tom");
        assertEquals(user1, user2);
    }

    @Test
    public void test2UsersHaveADifferentRole() {
        User user1 = new User();
        User user2 = new User();
        user1.setRole(UserRole.AGENT);
        user2.setRole(UserRole.USER);
        assertNotEquals(user1, user2);
    }

}
