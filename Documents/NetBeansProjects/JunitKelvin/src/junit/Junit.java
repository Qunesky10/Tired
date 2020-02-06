package junit;

public class Junit {
    public int add(int a, int b){
        a+=b;
        return a;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Junit ju = new Junit();
        System.out.println(ju.add(10, 40));
    }
    
}
