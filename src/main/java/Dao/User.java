package Dao;

import java.util.Date;

/**
 * Created by sunjm on 2016/3/29.
 */
public class User {
    private int user_id;
    private String user_name;
    private String password;
    private Date registration_time;
    private int[] projects;

    public User(int user_id, String user_name, String password, Date registration_time, int[] projects) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.registration_time = registration_time;
        this.projects = projects;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistration_time() {
        return registration_time;
    }

    public void setRegistration_time(Date registration_time) {
        this.registration_time = registration_time;
    }

    public int[] getProjects() {
        return projects;
    }

    public void setProjects(int[] projects) {
        this.projects = projects;
    }
}
