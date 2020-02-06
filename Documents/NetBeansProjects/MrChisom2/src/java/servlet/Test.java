/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

/**
 *
 * @author kelvi
 */
public class Test {
    static db data;
    
    public static void main(String[] args) {
        
        data= new db();
        data.insert("chisom", "12345");
        
        System.out.println("");
    }
    
}
