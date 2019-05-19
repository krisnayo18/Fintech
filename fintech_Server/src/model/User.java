/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.mysql.jdbc.*;
import com.sun.accessibility.internal.resources.accessibility;
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
    private String badanUsaha;
    private double usd;
    private double euro;
    private double pounds;
    private double ihsg;
    
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
    
    public User( String pbadanUsaha, double pUsd, double pEuro, double pPounds, double pIhsg)
    {
        setBadanUsaha(pbadanUsaha);
        setUsd(pUsd);
        setEuro(pEuro);
        setPounds(pPounds);
        setIhsg(pIhsg);
        getConnection();
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
     /**
     * @return the badanUsaha
     */
    public String getBadanUsaha() {
        return badanUsaha;
    }

    /**
     * @param badanUsaha the badanUsaha to set
     */
    public void setBadanUsaha(String badanUsaha) {
        this.badanUsaha = badanUsaha;
    }

    
    
    /**
     * @return the usd
     */
    public double getUsd() {
        return usd;
    }

    /**
     * @param usd the usd to set
     */
    public void setUsd(double usd) {
        this.usd = usd;
    }

    /**
     * @return the euro
     */
    public double getEuro() {
        return euro;
    }

    /**
     * @param euro the euro to set
     */
    public void setEuro(double euro) {
        this.euro = euro;
    }

    /**
     * @return the pounds
     */
    public double getPounds() {
        return pounds;
    }

    /**
     * @param pounds the pounds to set
     */
    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    /**
     * @return the ihsg
     */
    public double getIhsg() {
        return ihsg;
    }

    /**
     * @param ihsg the ihsg to set
     */
    public void setIhsg(double ihsg) {
        this.ihsg = ihsg;
    }

    
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
    
   public ArrayList<String> displaySaham(){
        ArrayList<String> collection = new ArrayList<String>();
        try {
            
            stat = (Statement) connect.createStatement();
            result = stat.executeQuery("select * from saham");
            while (result.next())
            {
                User c = new User(
                        result.getString("badanusaha"),
                        result.getDouble("usd"),
                        result.getDouble("euro"),
                        result.getDouble("pounds"),
                        result.getDouble("ihsg")   
                );
                collection.add(c.badanUsaha+"-"+c.usd+"-"+c.euro+"-"+c.pounds+"-"+c.ihsg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return collection;
    }
    public String hitungSahamIndo(double pUsd, double pEuro, double pPounds, double pIhsg )
    {
         String hasil = "";
        double usd = 0;
        double euro = 0;
        double pounds = 0;
        double ihsg = 0;
        
        double rand = (double)(Math.random());
        double randUSD = rand * (0.025 - 0.010) + 0.010; 
        double randEuro = rand * (0.025);
        double randPounds = rand * (0.025 - 0.005) + 0.005;
        double randIhsg = rand * (0.035 - 0.010) + 0.010;
        
        usd = pUsd + randUSD;
        euro =  pEuro - randEuro;
        pounds = pPounds + randPounds;
        ihsg =  pIhsg - randIhsg; 
        
        hasil = String.format("%.3f",usd) + "-" + String.format("%.3f",euro) + "-" + String.format("%.3f",pounds) +
                "-" + String.format("%.3f",ihsg);
        UpdateSaham("IndoPremium",usd,euro,pounds,ihsg);
        return hasil;
    }
     public String hitungSahamBaca(double pUsd, double pEuro, double pPounds, double pIhsg )
    {
        String hasil = "";
        double usd = 0;
        double euro = 0;
        double pounds = 0;
        double ihsg = 0;
        
        double rand = (double)(Math.random());
        double randUSD = rand * (0.010 - 0.005) + 0.005; 
        double randEuro = rand * (0.015 - 0.005)- 0.005;
        double randPounds = rand * (0.055 - 0.025) + 0.025;
        double randIhsg = rand * (0.025 - 0.010) + 0.010;
        
        usd = pUsd - randUSD;
        euro =  pEuro + randEuro;
        pounds = pPounds + randPounds;
        ihsg =  pIhsg + randIhsg; 
        
       hasil = String.format("%.3f",usd) + "-" + String.format("%.3f",euro) + "-" + String.format("%.3f",pounds) +
                "-" + String.format("%.3f",ihsg);
        UpdateSaham("Baca",usd,euro,pounds,ihsg);
        return hasil;
    }
    public String hitungSahamInves(double pUsd, double pEuro, double pPounds, double pIhsg )
    {
        
        String hasil = "";
        double usd = 0;
        double euro = 0;
        double pounds = 0;
        double ihsg = 0;
        //gunakan rumu math.random untuk mendapatkan angka 0.000 sampai 0.05
        double randUSD = (double)(Math.random() * (0.050 - 0.025)) + 0.025; 
        double randEuro = (double)(Math.random() * (0.050));
        double randPounds = (double)(Math.random() * (0.075 - 0.040)) + 0.040;
        double randIhsg = (double)(Math.random() * (0.085 - 0.035)) + 0.035;
        
        usd = pUsd - randUSD;
        euro =  pEuro - randEuro;
        pounds = pPounds - randPounds;
        ihsg =  pIhsg - randIhsg; 
        
        hasil = String.format("%.3f",usd) + "-" + String.format("%.3f",euro) + "-" + String.format("%.3f",pounds) +
                "-" + String.format("%.3f",ihsg);
        UpdateSaham("Investhree",usd,euro,pounds,ihsg);
        return hasil;
    }
    public void insertSaham(String pBadanUsaha, double pUsd, double pEuro, double pPounds, double pIhsg) {
        try {
            stat = (Statement) connect.createStatement();
            if(!connect.isClosed())
            {  
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
                        "insert into saham (badanusaha, usd, euro, pounds, ihsg) values (?,?,?,?,?)");
                sql.setString(1, pBadanUsaha);
                sql.setDouble(2, pUsd);
                sql.setDouble(3, pEuro);
                sql.setDouble(4, pPounds);
                sql.setDouble(5, pIhsg);
                sql.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public void UpdateSaham(String pBadanUsaha, double pUsd, double pEuro, double pPounds, double pIhsg) {
        try {
            stat = (Statement) connect.createStatement();
            if(!connect.isClosed())
            {  
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
                        "Update  saham set usd = ?, euro = ?, pounds = ?, ihsg = ? where badanusaha = ?");
                sql.setDouble(1,pUsd);
                sql.setDouble(2,pEuro);
                sql.setDouble(3,pPounds);
                sql.setDouble(4,pIhsg);
                sql.setString(5, pBadanUsaha);
                sql.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertHistory(String pUser, String pActivy) {
        try {
            stat = (Statement) connect.createStatement();
            if(!connect.isClosed())
            {  
                PreparedStatement sql = (PreparedStatement) connect.prepareStatement(
                        "INSERT INTO history (username, activity) VALUES (?,?)");
                sql.setString(1, pUser);
                sql.setString(2, pActivy);
                sql.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//</editor-fold>
    
}
