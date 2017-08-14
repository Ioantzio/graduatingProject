package com.ioantzio.portals.mockController;

public interface IDao
{
    boolean attemptUserVerification(String username, String password);
    boolean attemptUserRegistration(String username, String name, String surname, String password);
}
