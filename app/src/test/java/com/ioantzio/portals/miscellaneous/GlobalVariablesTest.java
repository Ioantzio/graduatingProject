package com.ioantzio.portals.miscellaneous;

import com.ioantzio.portals.models.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GlobalVariablesTest
{
    private User user;
    private User newUser;
    private User initialUser;

    private GlobalVariables globalVariables;

    @Before
    public void initializeVariables()
    {
        globalVariables = new GlobalVariables();
        initialUser = globalVariables.getUser();

        user = new User("testingName", "testing", "name", "12345", 100L);
        newUser = new User("testingNewName", "testingNew", "newName", "54321", 200L);

        globalVariables.setUser(user);
    }

    @Test
    public void validateGetUserMethod() throws Exception
    {
        assertEquals(user, globalVariables.getUser());
    }

    @Test
    public void validateSetUserMethod() throws Exception
    {
        globalVariables.setUser(newUser);
        assertEquals(newUser, globalVariables.getUser());
    }

    @After
    public void nullifyVariables()
    {
        globalVariables.setUser(initialUser);

        user = null;
        newUser = null;
        initialUser = null;
        globalVariables = null;
    }
}