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
public class SumCubeOfIndividualDigits {
    
    public static void main(String[] args) {
        
        System.out.println("Enter A Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum =0;
        while(number!=0){
            int digit = number%10;
            sum=sum+digit*digit*digit;
            number=number/10;
        }
        System.out.println("The sum of cubes of digits of the given number is " + sum);
    }
    
}
