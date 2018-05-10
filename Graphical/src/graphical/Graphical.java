/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphical;

import javax.swing.JOptionPane;

/**
 *
 * @author lifebook
 */
public class Graphical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        
        String age1=JOptionPane.showInputDialog("Please enter your age");
        
        int age =Integer.parseInt(age1);
        
        JOptionPane.showMessageDialog(null, "The age is: " +age +JOptionPane.PLAIN_MESSAGE );
        
        
    }
    
}
