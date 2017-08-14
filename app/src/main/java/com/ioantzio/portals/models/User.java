package com.ioantzio.portals.models;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class User
{
    private Long id;
    private String username;
    private String name;
    private String surname;
    private String password;
    private Long score;

    public User(){}

    public User(String username, String name, String surname, String password, Long score)
    {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.score = score;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Long getScore()
    {
        return score;
    }

    public void setScore(Long score)
    {
        this.score = score;
    }
}
