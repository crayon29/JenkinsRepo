package MyPkg;

import java.util.Scanner;

public class MyCalculator {
	
	public int sum(int a,int b)
	{
	    return(a+b);	
	}
	
	public int diff(int a,int b)
	{
		return(a-b);
	}
	
	public int div(int a,int b)
	{
		return(a-b);
	}
	public int bbc(int a,int b)
	{
		return(a*b);
	}

	public static void main(String[] args) {
		int a,b;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter num1");
		a=scn.nextInt();
		System.out.println("Enter num2");
		b=scn.nextInt();
		
		MyCalculator calc=new MyCalculator();
		System.out.println("Sum is:"+ calc.sum(a,b));
		System.out.println("Diff is:"+ calc.diff(a,b));
		
		
	

	}

}
