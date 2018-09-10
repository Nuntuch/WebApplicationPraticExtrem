/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.obj;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class ProUser {
    private long id ;
    private String username ;
    private String fristname ;
    private String lastname ;
    private String password;

    public ProUser() {
    }

    public ProUser(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public ProUser(long id, String username, String fristname, String lastname, String password) {
        this.id = id;
        this.username = username;
        this.fristname = fristname;
        this.lastname = lastname;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ProUser{" + "id=" + id + ", username=" + username + ", fristname=" + fristname + ", lastname=" + lastname + ", password=" + password + '}';
    }
    
}
