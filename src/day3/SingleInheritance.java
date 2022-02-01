package day3;

class A
{

public int a=10;	

public void printA()
{
	System.out.println("I am class A");
}

}

//class keyword  extends keyword  class name

//child class
//sub class
class B extends A
{
public int b=20;	
public void printB()
{
System.out.println("i m class B");	
}

}


public class SingleInheritance {


	public static void main(String args[])
	{	
		//using the class B
		B b=new B();
		b.printB();
		b.printA();
		System.out.println("B Blongs to A class "+b.a);
		System.out.println("B blongs to B class "+b.b);

	}

}