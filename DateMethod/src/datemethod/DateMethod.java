/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemethod;

/**
 *
 * @author lifebook
 */
public class DateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        MethodsDate obj=new MethodsDate(5,05,1998);
        obj.setDate(25);
        obj.setDate1(06);
        obj.setDate2(1998);
        
        obj.displayDate();
    
}
}
