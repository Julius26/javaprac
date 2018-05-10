/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;

/**
 *
 * @author lifebook
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        String forward="This is s test";
        StringBuilder sb=new StringBuilder();
        sb.append(forward);
       // String reverse=sb.reverse().toString();
       
       StringBuilder reversesb=sb.reverse();
       String reverse=reversesb.toString();
        
        System.out.println(forward);
        System.out.println(reverse);
    }
    
}
