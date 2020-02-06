
package volume;

public class Sphere {
    
    public double volume(double radius)
    {   
        double result;
        result= (4*3.14*radius*radius*radius)/3;
        return result;
    }
    public static void main(String[] args) {
        Sphere obj = new Sphere();
        double anwser = obj.volume(6);
        System.out.println(anwser);
        // TODO code application logic here
    }
    
}
