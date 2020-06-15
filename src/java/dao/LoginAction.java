/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import java.util.List;

/**
 *
 * @author rpfce
 */
public class LoginAction extends ActionSupport{
    public static final String ADMINISTRADOR = "administrador";
    public static final String ESTUDIANTE = "estudiante";
    public static final String PROFESOR = "profesor";
    private static final long serialVersionUID = 1L;
    UserDao dao = new UserDao();
    User user;
    int userType;
    
    @Override
    public void validate(){
        if(user.getEmail().length()==(0)){
            this.addFieldError("user.email", "El nombre es requerido");
        }
        if(user.getPassword().length()==(0)){
            this.addFieldError("user.password", "Contraseña requerida");
        }        
    }
    
    @Override
    public String execute(){
        if(dao.findUser(user.getEmail(),user.getPassword())){
            List<User> results = dao.getResultList();
            user = results.get(0);
            System.out.println("INFORMACIÓN LOGIN: "+user.getEmail());
            System.out.println("INFORMACIÓN LOGIN: "+user.getPassword());
            System.out.println("INFORMACIÓN LOGIN: "+user.getRole());
            switch(user.getRole()){
                case 1:
                    return ADMINISTRADOR;
                case 2:
                    return PROFESOR;
                case 3:
                    return ESTUDIANTE;
            }
        } else{
            this.addActionError("Invalid username or password");
        }
        return INPUT;
    }
    
    public User getUser(){
        return user;
    }
    
    public void setUser(User user){
        this.user = user;
    }
    
}
