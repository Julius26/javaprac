import java.util.Scanner;
class SumOfTwoNumbersInMethod
{
	int res=0;
	SumOfTwoNumbersInMethod(int x,int y)
	{
	 res=x+y;
	}
}
class Add
{
public static void main(String[] arg)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	SumOfTwoNumbersInMethod c=new SumOfTwoNumbersInMethod(a,b);
	System.out.println("Addition of two numbers is : "+c.res);
}
}