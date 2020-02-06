package junit;

public class JunitAssignment {
    
    void areaOfCircle(){
        double pi = 3.141;
        int radius = 23;
        
        double answer = (2*pi)*(radius*2);
        System.out.println(answer);
    }
    
    void evenNumber(){
       int b = 10;
       
       for(int a = 1; a<b ; a++){
           int c = a%2;
           if(c==0){
               if(a == 1){
                   break;
               }
                   System.out.println(a);
           }
       }
    }
    
    void addition(){
        int a = 12;
        int b = 84;
        int answer = a + b;
        System.out.println(answer);
    }
    
    void subtraction(){
        int a = 112;
        int b = 54;
        int answer = a - b;
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
        JunitAssignment obj = new JunitAssignment();
        obj.areaOfCircle();
        obj.evenNumber();
        obj.addition();
        obj.subtraction();
    }
}
