/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

/**
 *
 * @author lifebook
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    DateMethod date1=new DateMethod();
    DateMethod date2=new DateMethod(5);
    DateMethod date3=new DateMethod(7,13);
    DateMethod date4=new DateMethod(8,13,18);
    
    System.out.printf("%s\n",date1.string());
    System.out.printf("%s\n",date2.string());
    System.out.printf("%s\n",date3.string());
    System.out.printf("%s\n",date4.string());
    
    }
    
}
