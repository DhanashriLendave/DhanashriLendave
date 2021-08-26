/**
 * @author Dhanashree
 *
 */
public class Java25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmetic obj= new output();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}//end main

}//end class

 abstract class arithmetic
{
	 int a=40;
	 int b=50;
	 //abstract methods
	public abstract void add();
	public abstract void sub();
	public abstract void mul();
	public abstract  void div();
}// end arithmetic 
//class result extends arithmetic class
class output extends arithmetic
{
	public void add()
	{
	 System.out.println("Addition is "+(a+b));
	}
	public void sub()
	{

		 System.out.println("Substraction is "+(a-b));
	}
	public void mul()
	{

		 System.out.println("Multiplication is "+(a*b));
	}
	public void div()
	{

		 System.out.println("Division is "+(a/b));

	}

}
