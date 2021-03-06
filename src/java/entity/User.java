package entity;
// Generated 18/03/2020 02:58:50 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer idUser;
     private String email;
     private String password;
     private int role;
     private Set groups = new HashSet(0);

    public User() {
    }

	
    public User(String email, String password, int role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
    public User(String email, String password, int role, Set groups) {
       this.email = email;
       this.password = password;
       this.role = role;
       this.groups = groups;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRole() {
        return this.role;
    }
    
    public void setRole(int role) {
        this.role = role;
    }
    public Set getGroups() {
        return this.groups;
    }
    
    public void setGroups(Set groups) {
        this.groups = groups;
    }




}


