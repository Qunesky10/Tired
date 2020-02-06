/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author kelvi
 */
public class TDD {

    public int mean(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        int a = sum / num.length;
        return a;
    }

    public double variance(int[] var) {
        double v = 0.0;
        for (int i = 0; i < var.length; i++) {
            v += (var[i] - mean(var)) * (var[i] - mean(var));
        }

        v /= var.length;
        return v;
    }

    public static void main(String[] args) {
        TDD tdd = new TDD();
        int[] mean = {2653,2783,2187,2443,1782};
        double b = tdd.variance(mean);
        System.out.println("The mean is " + b);
    }
}
