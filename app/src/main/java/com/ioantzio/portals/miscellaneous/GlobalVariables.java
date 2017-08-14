package com.ioantzio.portals.miscellaneous;

import com.ioantzio.portals.models.User;

public class GlobalVariables
{
    public static User user;

    public void setUser(User user)
    {
        this.user = user;
    }

    public User getUser()
    {
        return user;
    }
}
