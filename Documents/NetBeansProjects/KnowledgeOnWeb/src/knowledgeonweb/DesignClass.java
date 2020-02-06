/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knowledgeonweb;

/**
 *
 * @author lakekudz
 */
public class DesignClass {
    public static void main(String[] args) {
    
    TestDemo td = new TestDemo();
    td.setVisible(true);
    DetailsDemo dm = new DetailsDemo();
    try{
       for(int i=1; i<=100; i++){
           Thread.sleep(150);
           td.nbar.setText(Integer.toString(i)+"%");
           td.pbar.setValue(i);
           if(i==100){
           td.setVisible(false);
           dm.setVisible(true);
           
           }
       }
    
    
    }catch(Exception e){
    
    }
    
}
}
