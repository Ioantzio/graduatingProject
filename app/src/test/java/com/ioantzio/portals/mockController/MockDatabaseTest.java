package com.ioantzio.portals.mockController;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class MockDatabaseTest
{
    private MockDatabase mockDatabase;

    @Before
    public void initializeVariables()
    {
        mockDatabase = new MockDatabase();
    }

    @Test
    public void attemptUserVerificationSuccess() throws Exception
    {
        assertTrue(mockDatabase.attemptUserVerification("admin", "admin"));
    }

    @Test
    public void attemptUserVerificationFail() throws Exception
    {
        assertFalse(mockDatabase.attemptUserVerification("root", "root"));
    }

    @Test
    public void attemptUserRegistrationSuccess() throws Exception
    {
        assertTrue(mockDatabase.attemptUserRegistration("root", "root", "root", "root"));
    }

    @Test
    public void attemptUserRegistrationFail() throws Exception
    {
        assertFalse(mockDatabase.attemptUserRegistration("admin", "admin", "admin", "admin"));
    }

    @After
    public void nullifyVariablesForUserRegistrationFail()
    {
        mockDatabase = null;
    }
}