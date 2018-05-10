
package methodparameters;
import java.util.Scanner;
public class MethodParameters {

    public static void main(String[] args) {
        
    Scanner scan=new Scanner(System.in);
    //instantiate the other class
    Parameter obj=new Parameter();
    
    //display a text on the screen
    System.out.println("enter your name here: ");
    
    //get the string from the user
    //String name=scan.nextLine();
    //call the object
    int name=scan.nextInt();
    obj.simpleMessage(name);
    
    }
    
}
