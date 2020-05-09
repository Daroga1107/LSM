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
public class Login extends ActionSupport{
    public static final String ADMINISTRADOR = "administrador";
    public static final String ESTUDIANTE = "estudiante";
    public static final String PROFESOR = "profesor";
    
    private String usuario;
    private String contrasena;
    Session hibernateSession;
    Users user;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String execute() throws Exception{
        Session hibernateSession;
        hibernateSession=HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = hibernateSession.beginTransaction();
        user = (Users)hibernateSession.createQuery("from Users where username='"+usuario+"'AND password='"+contrasena+"'").uniqueResult();
        t1.commit();
        if(user!=null){
            String role = user.getRole();
            switch(role){
                case ADMINISTRADOR:
                    return ADMINISTRADOR;
                case PROFESOR:
                    return PROFESOR;
                case ESTUDIANTE:
                    return ESTUDIANTE;                    
            }
        }
        addActionError("Usuario o contraseña incorrectos");
        return INPUT;           
    }
}


