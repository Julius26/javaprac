/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdate;

/**
 *
 * @author lifebook
 */
public class TestDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        date ate= new date(5,5,5);//constructor
        //set and get methods for each instance variable
        ate.set(4);
        ate.set1(2);
        ate.set2(1998);
        ate.get();
        ate.get1();
        ate.get2();
        //display method
        ate.displayDate();
    }
    
}
