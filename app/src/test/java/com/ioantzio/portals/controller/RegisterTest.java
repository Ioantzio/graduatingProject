package com.ioantzio.portals.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest
{
    private UserRegistration register;

    private String username;
    private String name;
    private String surname;
    private String password;

    @Before
    public void initializeVariablesForRegisterSuccessful()
    {
        username = "admin";
        name = "admin";
        surname = "admin";
        password = "admin";
    }

    @Test
    public void registerSuccessful() throws Exception
    {
//        assertFalse(register.attemptUserRegistration(username, name, surname, password));
    }

    @Before
    public void initializeVariableForRegisterFieldRequired()
    {
        username = "";
        name = "";
        surname = "";
        password = "";
    }

    @Test
    public void registerFieldRequired()
    {
//        assertFalse(register.attemptUserRegistration(username, name, surname, password));
    }

    @Before
    public void initializeVariablesForRegisterTooShortName()
    {
        username = "ad";
        name = "ad";
        surname = "ad";
        password = "ad";
    }

    @Test
    public void registerTooShortName()
    {
//        assertFalse(register.attemptUserRegistration(username, name, surname, password));
    }

    @Before
    public void initializeVariablesForRegisterTooLongName()
    {
        username = "12345678910111213141516";
        name = "12345678910111213141516";
        surname = "12345678910111213141516";
        password = "12345678910111213141516";

    }

    @Test
    public void registerTooLongName()
    {
//        assertFalse(register.attemptUserRegistration(username, name, surname, password));
    }

    @Before
    public void initializeVariablesForRegisterSpecialCharacters()
    {
        username = "@dm!n";
        name = "@dm!n";
        surname = "@dm!n";
        password = "@dm!n";
    }

    @Test
    public void registerSpecialCharacters()
    {
//        assertFalse(register.attemptUserRegistration(username, name, surname, password));
    }

    @Before
    public void initializeVariablesForRegisterSpaceCharacters()
    {
        username = "ad min";
        name = "ad min";
        surname = "ad min";
        password = "ad min";
    }

    @Test
    public void registerSpaceCharacters()
    {
//        assertFalse(register.attemptUserRegistration(username, name, surname, password));
    }

    @After
    public void nullifyVariables()
    {
        register = null;

        username = null;
        name = null;
        surname = null;
        password = null;
    }
}