/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.mysql.jdbc.*;
import java.awt.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Krisna
 */
public class User {
    
    //<editor-fold defaultstate="collapsed" desc="Data Member">
    private String username;
    private String password;
    
    
    Connection connect;
    Statement stat;
    ResultSet result;
//</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public User()
    {
        getConnection();
    }
    
    public User(String pUser, String pPasswd)
    {
        setUsername(pUser);
        setPassword(pPasswd);
        getConnection();
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Method">
    public Connection getConnection()   {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection("jdbc:mysql://localhost/fintech","root","");
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
    public void insert() {
        try {
            stat = (Statement) connect.createStatement();
            if(!connect.isClosed())
            {  
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
                        "insert into user (username,password) values (?,?)");
                sql.setString(1, getUsername());
                sql.setString(2, getPassword());
                sql.executeUpdate();
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<User> display(){
        ArrayList<User> collection = new ArrayList<User>();
        try {
            
            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("select * from user");
            while (result.next())
            {
                User c = new User(
                        result.getString("username"),
                        result.getString("password")
                );
                collection.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return collection;
    }
    
    public String checkLogin(){
        String hasil="";
        try
        {
            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("Select * from user where username = '" + this.username + "'");
            
            String pw="";
            while(result.next())
            {
                pw = result.getString("password");
            }
            if(pw.equals(this.password))
            {
                System.out.println("Login anda berhasil " +  this.username + " Gimana rasanya");
                hasil = "1";
            }
            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    
//</editor-fold>
    
}
