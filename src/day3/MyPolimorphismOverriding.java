package day3;

//it should have same method name in parent and child class
//it can take any form at runtime time 

//Need to implement abstraction class or interface
//Concept of inheritance (implement the interface or extends)
//you need to override the method in the child child
//it will always run the child class method

//late binding
//Method Overriding 
class shape
{
	public void drawshape()
	{
		System.out.println("Draw shape");
	}
}
class line extends shape
{
	public void drawshape()
	{
		System.out.println("Draw line");
	}
}
class square extends shape
{
	public void drawshape()
	{
		System.out.println("Draw square");
	}
}

public class MyPolimorphismOverriding {
	public static void main(String args[])
	{
		shape s=new line();
		s.drawshape();
	}

}