/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import java.util.Scanner;

/**
 *
 * @author lifebook
 */
public class Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your age: ");
        int myage=scan.nextInt();
        
        AgeMethods obj=new AgeMethods();
        obj.setAge(myage);
        obj.displayAge();
    }
    
}
