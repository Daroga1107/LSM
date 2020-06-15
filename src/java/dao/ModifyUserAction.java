/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.opensymphony.xwork2.ActionSupport;
import dao.HibernateUtil;
import entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rpfce
 */
public class ModifyUserAction extends ActionSupport{
    
    Session hibernateSession;
    private String email,password,role, passwordVal;    
    private Integer idUser;
    User user;

    public String getPasswordVal() {
        return passwordVal;
    }

    public void setPasswordVal(String passwordVal) {
        this.passwordVal = passwordVal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    
    public int changeRole(String role) {
        switch (role) {
            case "Administrador":
                return 1;
            case "Profesor":
                return 2;
            case "Estudiante":
                return 3;            
        }
        return 0;
    }
    
    public String execute() throws Exception {
        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        User user = (User)hibernateSession.load(User.class,idUser);
        Transaction tr = hibernateSession.beginTransaction();
//        System.out.println("INFORMACIÓN RECIBIDA:");
//        System.out.println("Id: "+ idUser);
//        System.out.println("Email: "+email);
//        System.out.println("Password 1: "+ password);
//        System.out.println("Password 2: "+ passwordVal);
//        System.out.println("Rol: "+role);
        if(password.equals(passwordVal)){
            user.setEmail(this.getEmail());
            user.setPassword(this.getPassword());
            user.setRole(changeRole(this.getRole()));
            hibernateSession.update(user);
            tr.commit();
            return SUCCESS;
        }
        return SUCCESS;        
    }
    
}
