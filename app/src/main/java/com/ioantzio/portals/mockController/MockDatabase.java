package com.ioantzio.portals.mockController;

public class MockDatabase implements IDao
{
    private String username = "admin", name = "admin", surname = "admin", password = "admin";

    public boolean attemptUserVerification(String username, String password)
    {
        if(password.equals(this.password) && username.equals(this.username))
        {
            return true;
        }
        return false;
    }

    public boolean attemptUserRegistration(String username, String name, String surname, String password)
    {
        if(username.equals(this.username))
        {
//            System.out.println("Error: username");
            return false;
        }
        else if(name.equals(this.name) && surname.equals(this.surname))
        {
//            System.out.println("Error: name & surname");
            return false;
        }
        else
        {
            return true;
        }
    }
}
