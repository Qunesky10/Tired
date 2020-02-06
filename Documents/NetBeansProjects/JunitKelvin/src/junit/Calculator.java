package junit;

public class Calculator {
    
    public boolean checkString(String a, String b){
        return a.equals(b);
    }
    
    public double add(double a, double b){
        return a + b;
    }
    
    public int add(int a, int b){
        return a + b;
    }
    
    public String add(String a, String b){
        return a.concat(b);
    }
    
}
