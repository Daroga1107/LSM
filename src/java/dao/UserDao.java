/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rpfce
 */
public class UserDao {
    
    public List<User> list;
    
    public boolean findUser(String username, String password){
        Session session = HibernateUtil.getSessionFactory().openSession();
        //session.beginTransaction();
        String sql = "from User u where u.email=:mail and u.password=:pass";
        Query query = session.createQuery(sql);
        query.setParameter("mail", username);
        query.setParameter("pass", password);
        //System.out.println("Parametro #1: "+username);
        //System.out.println("Parametro #2: "+password);
        list = query.list();
        //User resultado = list.get(0);
        //System.out.println("Email resultado: "+resultado.getEmail());
        //System.out.println("Contra resultado: "+resultado.getPassword());
        //System.out.println("Rol resultado: "+resultado.getRole());
        if(list.size()>0){
            session.close();
            return true;
        }
        session.close();
        return false;
    }
    
    public List<User> getResultList(){
        return list;
    }
    
    public List<User> getAllUsers(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String sql = "from User";
        Query query = session.createQuery(sql);
        List<User> result = query.list();
        session.close();
        return result;
    }
}
