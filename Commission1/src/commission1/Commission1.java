/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commission1;

import java.util.Scanner;

/**
 *
 * @author lifebook
 */
public class Commission1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     //declaring variables
     String item;
     double total=0;
     double item_1;
     int item_no;
     double item_2;
     int item_3;
     double item_4;
     
     //table for the items and values
       double arr[]={0,259.34,349.75,100.95,300.89};
     System.out.println("The companies items sold and their values");
     System.out.println("item\t value");
     for(int i=1;i<=4;i++){  
     System.out.println(i +"\t"+ arr[i]);
}
    
    System.out.println("Type Yes if you have an item and No if you don't");
    item=scan.next();

     
     while("Yes".equals(item) || "yes".equals(item)){
         System.out.println("enter the item no: ");
         item_no=scan.nextInt();
         
         
         switch (item_no) {
             case 1:
                 System.out.println("enter the number of item 1 sold");
                 item_1=scan.nextDouble();
                 total=(item_1*259.34*0.07)+400;
                 break;
         //end of if else
             case 2:
                 System.out.println("enter the number of item 2 sold");
                 item_2=scan.nextDouble();
                 total=(item_2*349.75*0.07)+400;
                 break;
             case 3:
                 System.out.println("enter the number of item 3 sold");
                 item_3=scan.nextInt();
                 total=(item_3*100.95*0.07)+400;
                 break;
             case 4:
                 System.out.println("enter the number of item 4 sold");
                 item_4=scan.nextDouble();
                 total=(item_4*300.89*0.07)+400;
                 break;
             default:
                 System.out.println("error!!");
                 break;
         }
     
     
     System.out.println("if there are more items type Yes if there are no more items type No");
     item=scan.next();
     
//     total=total+total;
      total+=total;
  

     }
      // Displaying total salary 
     System.out.println("The total salary is Ksh: " +total);
    }
    
    
     
     
     
    }
    

