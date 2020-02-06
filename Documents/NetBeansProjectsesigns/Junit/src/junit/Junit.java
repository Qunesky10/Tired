/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author Adeleke10
 */
public class Junit {

    /**
     * @param args the command line arguments
     */
    
    public int add (int a, int b){
        a+=b;
        //a=2;
        return a;
    }
    
    public static void main(String[] args) {
        Junit ju = new Junit();
        System.out.println(ju.add(10, 40));
        
    }
    
}
