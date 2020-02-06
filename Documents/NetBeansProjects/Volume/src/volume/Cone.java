package volume;

public class Cone {
    
 public double volume(double radius, double height)
    {   
        double result;
        result= (3.14*radius*radius*height)/3;
        return result;
    }  
    public static void main(String[] args) {
        Cone obj = new Cone();
        double answer = obj.volume(23, 4);
        System.out.println(answer);
    }
 
}
