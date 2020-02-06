/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kelvi
 */
public class PasswordGenerator {
    Random random=new Random();
 int randomValue;
 String randomChar="%$#&0123456789abcdefghijklmnopqrstuvwxyz";
 int n=randomChar.length();
 String Name;
// char[] a={'%','@','&'};
 String q;
    
 public void name(){
     System.out.println("Input Your Name: ");
     Scanner sc=new Scanner(System.in);
     Name=sc.nextLine();
     q=Name.substring(0, 3);
     
 }
    
    void random(){
//        for(int j =1; j<4;j++){
        randomValue= random.nextInt((999 - 100) + 1) +1000;
        
//        System.out.println(randomValue);
                }
//    void randomCh(){
//        for(int i=0;i<3;i++){
//            System.out.print(randomChar.charAt(random.nextInt(n)));
//        }
//    }
    
    public void randomPasword(){
        for(int i=0;i<=100;i++){
        System.out.println(q+randomChar.charAt(random.nextInt(n))+randomChar.charAt(random.nextInt(n))+randomChar.charAt(random.nextInt(n))+randomChar.charAt(random.nextInt(n)));
        }
    }
    
    public static void main(String[] args) {
        PasswordGenerator pg=new PasswordGenerator();
        pg.name();
        pg.random();
//        pg.randomCh();
        pg.randomPasword();
    }
}
