/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.util.Scanner;

/**
 *
 * @author Adeleke10
 */
public class ReversalOfANumber {
    
    public static void main(String[] args) {
        
        int num=0;
        int reversenum=0;
        System.out.println("Input Your Numbers And Press Enter");
        Scanner in = new Scanner(System.in);
        num =in.nextInt();
        while( num != 0){
            reversenum = reversenum * 10 ;
            reversenum = reversenum + num%10;
            num = num/10;
        }
        System.out.println("Reverse Of Input Numbers Are: "+reversenum);
    }
    
}
