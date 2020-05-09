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
public class Delete extends ActionSupport{
	private int id;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String execute() throws Exception{
		Session hibernateSession;
		hibernateSession = HibernateUtil.getSessionFactory().openSession();
                Transaction t=hibernateSession.beginTransaction(); 
                Users user=(Users)hibernateSession.load(Users.class,id);
		hibernateSession.delete(user);
		t.commit();
		hibernateSession.close();
		return SUCCESS;
	}
}