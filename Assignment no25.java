/**
 * 
 */
package com.java;

/**
 * @author Dhanashree Lendave
 *
 */
public class java25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic a=new result();
		a.add();
		a.sub();
		a.mul();
		a.div();
		
	}//end main

}//end class

abstract class arithmetic
{
	int a=54;
	int b=67;
	//abstract methods
	public abstract void add();
	public abstract void sub();
	public abstract void mul();
	public abstract void div();
}//end arithmetic

//class result extends arithmetic class
class result extends arithmetic
{
	public void add()
	{
		System.out.println("addition is "+(a+b));
	}
	public void sub()
	{
		System.out.println("substraction is "+(a-b));
	}
	public void mul()
	{
		System.out.println("multilpication is "+(a*b));
	}
	public void div()
	{
		System.out.println("division is "+(a/b));
	}
}
