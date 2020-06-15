/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.opensymphony.xwork2.Action.SUCCESS;
import entity.User;
import java.util.List;

/**
 *
 * @author rpfce
 */
public class AdminAction {
    
    private List<User> currentUsers;

    public List<User> getCurrentUsers() {
        return currentUsers;
    }

    public void setCurrentUsers(List<User> currentUsers) {
        this.currentUsers = currentUsers;
    }

    
    
    public AdminAction() {
    }
    
    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getRegisteredUsers(){
        UserDao dao = new UserDao();
        this.currentUsers = dao.getAllUsers();
        return SUCCESS;
    }
    
}
