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
public class myInfoAction extends ActionSupport{
    Session hibernateSession;
    private String email,password;  
    private Integer idUser;    
    User user;
    
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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
    
    public String execute() throws Exception {
        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        User user = (User)hibernateSession.load(User.class, idUser);
        Transaction tr = hibernateSession.beginTransaction();
        System.out.println("INFORMACIÓN RECIBIDA: ");
        System.out.println("USUARIO:"+user.toString());
        System.out.println("ID: "+idUser);
        System.out.println("Email: "+email);
        System.out.println("Password 1: "+ password);
        user.setEmail(this.getEmail());
        user.setPassword(this.getPassword());
        hibernateSession.update(user);
        tr.commit();
        if(tr.wasCommitted())
            return SUCCESS;
        else
            return INPUT;
        
    }
    
}
