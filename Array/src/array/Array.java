/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author lifebook
 */
public class Array {

 
    public static void main(String[] args) {
        
        int count[][]=new int[2][5];
        
        for(int row=0;row<2;row++){
           for(int column=0;column<4;column++){
            count[row][column]=0;
            count[row][column]+=1;
            System.out.print(count[row][column] +"\t");
           
           
           }
    System.out.println();
        }
               
}
    
    
}
