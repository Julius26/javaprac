
package methodsown;

import java.util.Scanner;


public class Methodsown {

   
    public static void main(String[] args) {
        
//        System.out.println(areaRectangle(2,8));
//        System.out.println(perimeterRectangle(2,8));
        int length,width;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length");
        length=scan.nextInt();
        System.out.println("Enter width");
        width=scan.nextInt();
        
        int area=areaRectangle(length,width);
        int per=perimeterRectangle(length,width);
        System.out.printf("The area is: %d The perimeter is: %d",area ,per);
        
//        System.out.printf(" %d%d",args);
    }
    //method one
    public static int areaRectangle(int someLength, int someWidth){
    return someLength*someWidth;
}
    
    //method two
    public static int perimeterRectangle(int x,int y){
    return 2*(x+y);
    }
    
}
