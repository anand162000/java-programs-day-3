package day3;
import java.util.*;
public class insertAndPrintArray{
	public static void main(String args[])
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the values");
			a[i]=sc.nextInt();
			}
		System.out.println("The values are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	
		
	}

}


