/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthday;

import java.util.Scanner;

/**
 *
 * @author lifebook
 */
public class Birthday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            a+=b;
            b*=2;
            System.out.print(a+"");
            System.out.println();
        }
        in.close();
    }
        
    }
    

