
package scanner;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Scannerr {
 
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        /*String name;
        int age;
        int grade;
        
        System.out.print("Please input your name, age and grade");
        name=scan.next();
        age=scan.nextInt();
        grade=scan.nextInt();
        //output using scanner
            System.out.println("Your name is "+name+"Your age is "+age+"Your garde is "+grade);
            System.out.println("Your age is "+age );
            System.out.println("Your garde is "+grade);*/
//output usingJoptionpane    

      String name,age,grade;
      
      
      String namee;
      int agee,gradee;
    name=JOptionPane.showInputDialog("Please enter your name ");
    age=JOptionPane.showInputDialog("Please enter your age ");
    grade=JOptionPane.showInputDialog("Please enter your grade ");
    
    agee=Integer.parseInt(age);
    gradee=Integer.parseInt(grade);
    
    
    JOptionPane.showMessageDialog(null, "Your name is " +name +"Your age is " +age +"Your age is" +age +JOptionPane.ERROR_MESSAGE);
   System.exit(0);            
    }
    
}
