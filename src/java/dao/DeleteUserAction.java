/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rpfce
 */
public class DeleteUserAction extends ActionSupport {
    
    public String execute() throws Exception {
        String paramValue = ServletActionContext.getRequest().getParameter("idUser");
        System.out.println(""+paramValue);
        System.out.println("Ejecutando el método execute!");
        Session hibernateSession;
        hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Transaction t = hibernateSession.beginTransaction();
        System.out.println("Transaccion iniciada!");
        System.out.println("ID a eliminar: "+ paramValue);
        User user = (User)hibernateSession.load(User.class, Integer.parseInt(paramValue));
        hibernateSession.delete(user);
        t.commit();
        return SUCCESS;
    }    
}
