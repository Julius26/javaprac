
package randomgen;

import java.util.Random;

public class RandomGen {

    private static Random generator;//static variable
    public static void main(String[] args) {
        
        generator =new Random();
        int i=generator.nextInt();
        System.out.println(i);
    }
    
}
