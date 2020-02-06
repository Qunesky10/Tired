package junit;

import java.util.Random;
import java.util.Scanner;

public class workSpace {
    
    public int factor  = 1, number;
    Random random = new Random();
    int randomValue;
    public void factorialOfNumber(int factor){
        this.factor = factor;
        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        
        for(int i = 1; i <= number; i++){
            factor = factor * i;
        }
        System.out.println("Factorail of " + number + " is " + factor);
       
    }
    
    void generateRandomNumber(){
        
        for(int i = 1 ; i < 10000; i++){
            randomValue = random.nextInt((999 - 100) + 1) + 100;
            System.out.println("random value: " + randomValue);
        }
    }
    
    public static void main(String[] args) {
        workSpace obj = new workSpace();
        obj.generateRandomNumber();
//        obj.factorialOfNumber(5);
    }
}
