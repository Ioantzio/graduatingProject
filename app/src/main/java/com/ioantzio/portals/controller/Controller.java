package com.ioantzio.portals.controller;

import com.ioantzio.portals.mockController.IDao;
import com.ioantzio.portals.models.User;

public class Controller implements IDao
{
    private UserVerification login;
    private UserRegistration register;
    private UserUpdate userUpdate;

    @Override
    public boolean attemptUserVerification(String username, String password)
    {
//        login = new UserVerification();
//        return login.attemptUserVerification(username, password);
        return true;
    }

    @Override
    public boolean attemptUserRegistration(String username, String name, String surname, String password)
    {
//        register = new UserRegistration();
//        return register.attemptUserRegistration(username, name, surname, password);
        return true;
    }

    public boolean userUpdate(User user)
    {
//        userUpdate = new UserUpdate();
//        return userUpdate.update(user);
        return true;
    }
}
