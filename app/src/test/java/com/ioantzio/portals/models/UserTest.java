package com.ioantzio.portals.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dimitriadis983 on 14-Jan-17.
 */
public class UserTest
{
    User user;

    private String username;
    private String name;
    private String surname;
    private String password;
    private Long score;

    private Long newId;
    private String newUsername;
    private String newName;
    private String newSurname;
    private String newPassword;
    private Long newScore;

    @Before
    public void initializeVariables()
    {
        username = "JohnyWalker94";
        name = "Johny";
        surname = "Walker";
        password = "12345";
        score = 9001L;

        user = new User(username, name, surname, password, score);

        newId = 2L;
        newUsername = "dimitriadis1";
        newName = "dimitris";
        newSurname = "dimitriadis";
        newPassword = "abcde";
        newScore = 10L;
    }

    @Test
    public void setId() throws Exception
    {
        user.setId(newId);
        assertEquals(newId, user.getId());
    }

    @Test
    public void getUsername() throws Exception
    {
        assertEquals(username, user.getUsername());
    }

    @Test
    public void setUsername() throws Exception
    {
        user.setUsername(newUsername);
        assertEquals(newUsername, user.getUsername());
    }

    @Test
    public void getName() throws Exception
    {
        assertEquals(name, user.getName());
    }

    @Test
    public void setName() throws Exception
    {
        user.setName(newName);
        assertEquals(newName, user.getName());
    }

    @Test
    public void getSurname() throws Exception
    {
        assertEquals(surname, user.getSurname());
    }

    @Test
    public void setSurname() throws Exception
    {
        user.setSurname(newSurname);
        assertEquals(newSurname, user.getSurname());
    }

    @Test
    public void getPassword() throws Exception
    {
        assertEquals(password, user.getPassword());
    }

    @Test
    public void setPassword() throws Exception
    {
        user.setPassword(newPassword);
        assertEquals(newPassword, user.getPassword());
    }

    @Test
    public void getScore() throws Exception
    {
        assertEquals(score, user.getScore());
    }

    @Test
    public void setScore() throws Exception
    {
        user.setScore(newScore);
        assertEquals(newScore, user.getScore());
    }

    @After
    public void nullifyVariables()
    {
        username = null;
        name = null;
        surname = null;
        password = null;
        score = null;

        user = null;

        newId = null;
        newUsername = null;
        newPassword = null;
        newScore = null;
    }

}