package com.ioantzio.portals.controller;

import com.ioantzio.portals.models.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dimitriadis983 on 14-Jan-17.
 */
public class UserUpdateTest
{
    UserUpdate userUpdate;

    @Before
    public void initializeVariables() throws Exception
    {
        userUpdate = new UserUpdate();
    }

    @Test
    public void update() throws Exception
    {
        assertTrue(userUpdate.update(new User("admin", "admin", "admin", "admin", 30L)));
    }

    @After
    public void nullifyVariables() throws Exception
    {
        userUpdate = null;
    }
}