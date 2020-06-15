/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rodrigo
 */
public class DB implements java.io.Serializable {
    private String url;
    private String driver;
    private transient Connection con;
    private Statement stmtquery;
    private Statement stmtupdate;
    private ResultSet rs;

    public void setConnection(String driver,String url) throws IOException,java.sql.SQLException{
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "root");
            this.url=	url;
            this.driver=driver;
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(java.sql.SQLException e){
            throw e;
        }
    }
    
    public void closeConnection() throws java.sql.SQLException {
        if(con!=null)
        con.close();
        url=driver=null;
        if(stmtupdate!=null)stmtupdate.close();
        if(stmtquery!=null)stmtquery.close();
        stmtupdate=stmtquery= null;
        rs=null;
    }
    //------------------------------------------
    public String roleToString(String role){
        String rol = null;
        switch(role){
            case "1":
                rol = "Administrador";
                break;
            case "2":
                rol = "Profesor";
                break;
            case "3":
                rol = "Estudiante";
                break;
            default:
                rol = "Revisar";
        }
        return rol;
    }
    
    public int executeUpdate(String sql) throws java.sql.SQLException {
        if(con==null)
            throw new SQLException("No ha configurado correctamente la conexion Source:Bean handledb");
        stmtupdate = null;
        int affecrows=0;
        try{
            stmtupdate=con.createStatement();
            affecrows=stmtupdate.executeUpdate(sql);
        } finally {
            if(stmtupdate != null) stmtupdate.close();
        }
        return affecrows;
    }
     //-----------------------------------------
    public ResultSet executeQuery(String sql) throws java.sql.SQLException{
        if(con==null)
            throw new SQLException("No ha configurado correctamente la conexion Source:Bean handledb");
        stmtquery = null;
        rs=null;
        try{
            stmtquery=con.createStatement();
            rs=stmtquery.executeQuery(sql);
        } finally {
        }
        return rs;
    }
     //---------------------------------------------
    public String getUrl() {
        return url;
    }

    public String getDriver(){
        return driver;
    }
}

