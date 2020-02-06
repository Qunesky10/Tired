/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class db {

    /**
     * Creates a new instance of db
     */
    public db() {
//        connect();
    }
     public Connection con=null;
    public Statement s;
    public String TableName="login";
    public String DatabaseName="junit";
    public String DatabaseUrl = "jdbc:mysql://localhost:3306/";
    public String username="root";
    public String password="";
       
    String DriverName="com.mysql.jdbc.Driver";
    
    void connect(){
        try{
            Class.forName(DriverName);
            con=DriverManager.getConnection(DatabaseUrl + DatabaseName,username,password);
            System.out.println("CONNECTED!!!!!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            createDatabase();
        }
    }

    private void createDatabase() {
           try{
                Class.forName(DriverName);
                con=DriverManager.getConnection(DatabaseUrl, username,password);
                s=con.createStatement();
                int count=s.executeUpdate("CREATE DATABASE IF NOT EXISTS " +DatabaseName );
                System.out.println("count :" + count);
                if(count>0){
                    System.out.println("Connected");
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void createTable()
    {
        String table="CREATE TABLE IF NOT EXISTS "+TableName + " "
                        + "( username VARCHAR(30) UNIQUE, password VARCHAR(30)),";
        try{
            Class.forName(DriverName);
                con=DriverManager.getConnection(DatabaseUrl + DatabaseName,username,password);
                s=con.createStatement();
                int count=s.executeUpdate(table);
                if (count>0){
                    System.out.println("Table created successfully");
                }
        } catch (ClassNotFoundException ex) {
            System.out.println("Table not Found");
        } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void insert(String username1, String password1){
        
           String insertSQL=" INSERT INTO " + TableName + " (username,password) values"
                   + "(?,?)";
           try{
              
                Class.forName(DriverName);
                con=DriverManager.getConnection(DatabaseUrl+DatabaseName,"root","");
               PreparedStatement preparedStatement=con.prepareStatement(insertSQL);
               preparedStatement.setString(1,username1);
               preparedStatement.setString(2,password1);
               int count=preparedStatement.executeUpdate();
            if(count>0){
                 System.out.println("Record entered Successfully");
            }
           } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
               System.out.println("cant insert");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public boolean search(String username){
        
         String Create = "select username from " + TableName + ""
                    + " where username = ?";
            
        
        try{
           PreparedStatement ps = con.prepareStatement(Create);
           ps.setString(1, username);
           
           ResultSet rs = ps.executeQuery();
           
           if(rs.next()){
               System.out.println("Valid Input");
               return false;
           }
           
            
        }catch(SQLException ex){
            System.out.println("Login error" + ex.getMessage());
            return false;
            
        }      
        return true;
    }
    
}
