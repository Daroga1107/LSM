/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import com.opensymphony.xwork2.ActionSupport;
import entity.HibernateUtil;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rodrigo
 */

public class Register extends ActionSupport{
    private String username,password,password2,role,groupkey;
    private Users user = new Users();
    Session hibernateSession;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getGroupkey() {
        return groupkey;
    }

    public void setGroupkey(String groupkey) {
        this.groupkey = groupkey;
    }
    
    public String changeRole(String role){
        switch(role){
            case "Estudiante":
                return "estudiante";
            case "Profesor":
                return "profesor";
        }
        return INPUT;
    }
    
    @Override
    public String execute() throws Exception{
        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction insert = hibernateSession.beginTransaction();
        System.out.println("INFORMACIÓN RECIBIDA: ");
        System.out.println("Username "+username);
        System.out.println("Password "+password);
        System.out.println("Rol "+role);
        if(password.equals(password2)){
            user.setUsername(username);
            user.setPassword(password);
            user.setRole(changeRole(role));
            //System.out.println(""+user.toString());
            hibernateSession.save(user);
            insert.commit();
            hibernateSession.close();
            return SUCCESS;
        }
        return INPUT;
    }
    
    
}