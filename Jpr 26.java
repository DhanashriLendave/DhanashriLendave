public class Java26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 myinterface objMy=new  Newinterface ();
		 objMy.add();
		 objMy.sub();
		 objMy.mul();
		 objMy.div();
	}

}
interface myinterface
{

	final int i=45;
	final int j=40;
	public void add();
	public void sub();
	public void mul();
	public void div();
}// end myinterface
// Newinterface class implements myinterface 

class Newinterface implements myinterface
{
	public void add()
	{
	 System.out.println("Addition is "+(i+j));
	}
	public void sub()
	{

		 System.out.println("Substraction is "+(i-j));
	}
	public void mul()
	{

		 System.out.println("Multiplication is "+(i*j));
	}
	public void div()
	{

		 System.out.println("Division is "+(i/j));
	}

}//end  Newinterface
	
