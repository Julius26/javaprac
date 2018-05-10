
package dice;


public class Dice {


    public static void main(String[] args) {
        
      Diebehaviour d12=new Diebehaviour(12); //twelve sided dice
      
      Diebehaviour normal=new Diebehaviour(6); //six sided dice
      
      System.out.println(d12.getValue());
      System.out.println(d12.getValue());
      System.out.println(normal.roll());
      normal.setSides();
      System.out.println(normal.roll());

      
    }
    
}
