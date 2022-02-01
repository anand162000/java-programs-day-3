package day3;
import java.util.Scanner;
public class maximam {
	public static void main(String args[])
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		 a=sc.nextInt();
		System.out.println("Enter the second number");
		 b=sc.nextInt();
		System.out.println("Enter the third number");
		 c=sc.nextInt();
		 if(a>b && a>c)
		 {
			 System.out.println("A is greater");
		 }
		 else if(b>c)
		 {
			 System.out.println("B is greater");
		 }
		 else
		 {
			 System.out.println("C is greater");
		 }
		
		
	}

}


