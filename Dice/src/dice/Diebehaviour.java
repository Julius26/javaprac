
package dice;

import java.util.Random;

/*roll()
getValue()
getSides()
setSides()
*/

public class Diebehaviour {
    
    // private variables not to show the user what we are doing
  private int sides;
  private int value;
  private Random generator;
  
//constructor
  
  public  Diebehaviour(int sides){
      //this references class you are in
      this.sides=sides;
      generator=new Random();
      this.value=this.roll();

}
//  method overloading
  public  Diebehaviour(int sides,int seed){
      this.sides=sides;
      this.generator=new Random(seed);
      this.value=this.roll();
  }
  public int roll(){
  this.value=this.generator.nextInt(this.sides)+1;
  return this.value;
  }
  public int getValue(){
  return this.value;
  }
  
  //get method
  public int getSides(){
      return this.sides;
  }
//set method
  public void setSides(){
  this.sides=sides;
  }
}
