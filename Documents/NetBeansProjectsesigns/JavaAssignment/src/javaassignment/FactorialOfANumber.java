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
public class FactorialOfANumber {
    
    public static void main(String[] args) {
        
        long n, fact=1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a numbers");
        
        n = sc.nextLong();
        
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("fact= " + fact);
    }
    
}
