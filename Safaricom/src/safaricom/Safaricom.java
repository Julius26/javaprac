
package safaricom;

import java.util.Scanner;
public class Safaricom {

    
    public static void main(String[] args) {
        
        //scanner class to get the users input
        Scanner scan =new Scanner(System.in);
        //Get usres input
        String empName;
        double basicSalary;
        double grossPay;
        double netPay;
        double overTimeHours;
        double wageOne=0;
        double wageTwo=0;
        double paye=0;
        double nssf=80.00;
        double nhif=200.00;
        double serviceCharge=100.00;

        //welcome message
        System.out.println("Welcome to Safaricom,Twaweza");
        
        System.out.println("Please enter employee name");
        empName=scan.next();
        
        System.out.println("Please enter employee salary");
        basicSalary=scan.nextDouble();
        
        System.out.println("Please enter employee overTimeHours");
        overTimeHours=scan.nextDouble();
        
        
        //claculate wages for overtime hours
        if(overTimeHours>0 && overTimeHours<=50){
            wageOne=overTimeHours*300;
        }
        else if(overTimeHours>50){
            wageTwo=overTimeHours-50;
            wageTwo=wageTwo*350;
        }
        else{
        System.out.println("ERROR!!!");
        }
        
        //gross pay
        grossPay=basicSalary+wageOne+wageTwo;
        
        //determine the paye
        
        if(grossPay>=50000){
                paye=grossPay*0.14;
        }
        else if(grossPay>=40000 && grossPay<=49000){
                paye=grossPay*0.12;
        }
        else if(grossPay>=35000 && grossPay<40000){
                paye=grossPay*0.11;
        }
        else if(grossPay>=25000 && grossPay<35000){
                paye=grossPay*0.08;
        }
        else if(grossPay>=16000 && grossPay<25000){
                paye=grossPay*0.05;
        }
        else if(grossPay>=9500 && grossPay<16000){
                paye=grossPay*0.03;
        }
        else if(grossPay<9500){
                paye=grossPay;
        }
        
        //find netpay
        netPay=grossPay-(paye+nssf+nhif+serviceCharge);
        
        System.out.println("The Name of the Employee is "+empName);
        System.out.println("The Grosspay is "+grossPay);
        System.out.println("The PAYE amount is "+paye);
        System.out.println("The Netpay is "+netPay); 
    }
    
}
