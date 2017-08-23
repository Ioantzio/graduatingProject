package com.ioantzio.portals.mockController;

public class MockDatabase implements IDao
{
    private String username = "admin", name = "admin", surname = "admin", password = "admin";

    /**

     * @param username Username
     * @param password Password
     * @return Attempts to login in the application using the username & password given.
     * Both username and password must be "admin" to login successfully
     */
    public boolean attemptUserVerification(String username, String password)
    {
        if(password.equals(this.password) && username.equals(this.username))
        {
            return true;
        }
        return false;
    }

    /**
     * @param username Username
     * @param name Name
     * @param surname Surname
     * @param password Password
     * @return Attempts to register using the parameters given.
     * If the parameters equal to "admin", the registration will fail.
     */
    public boolean attemptUserRegistration(String username, String name, String surname, String password)
    {
        if(username.equals(this.username))
        {
            return false;
        }
        else if(name.equals(this.name) && surname.equals(this.surname))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
