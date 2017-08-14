package com.ioantzio.portals.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginTest
{
    private UserVerification login;

    private String username;
    private String password;

    @Before
    public void initializeVariablesForLoginSuccessful()
    {
        username = "admin";
        password = "admin";
    }

    @Test
    public void loginSuccessful() throws Exception
    {
//        assertFalse(login.attemptUserVerification(username, password));
    }

    @Before
    public void initializeVariableForLoginFieldRequired()
    {
        username = "";
        password = "";
    }

    @Test
    public void loginFieldRequired()
    {
//        assertFalse(login.attemptUserVerification(username, password));
    }

    @Before
    public void initializeVariablesForLoginTooShortName()
    {
        username = "ad";
        password = "ad";
    }

    @Test
    public void loginTooShortName()
    {
//        assertFalse(login.attemptUserVerification(username, password));
    }

    @Before
    public void initializeVariablesForLoginTooLongName()
    {
        username = "12345678910111213141516";
        password = "12345678910111213141516";

    }

    @Test
    public void loginTooLongName()
    {
//        assertFalse(login.attemptUserVerification(username, password));
    }

    @Before
    public void initializeVariablesForLoginSpecialCharacters()
    {
        username = "@dm!n";
        password = "@dm!n";
    }

    @Test
    public void loginSpecialCharacters()
    {
//        assertFalse(login.attemptUserVerification(username, password));
    }

    @Before
    public void initializeVariablesForLoginSpaceCharacters()
    {
        username = "ad min";
        password = "ad min";
    }

    @Test
    public void loginSpaceCharacters()
    {
//        assertFalse(login.attemptUserVerification(username, password));
    }

    @After
    public void nullifyVariables()
    {
        login = null;

        username = null;
        password = null;
    }
}