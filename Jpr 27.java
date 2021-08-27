Write a robot class inheritance and interface in java?

abstract class Robot
{}

interface Motion
{
	void forward();
	void reverse();
	void stop();
}

interface Sound
{
	void Beep();
}

class RobotA extends Robot
{}

class RobotB extends Robot
{}

class RobotC extends Robot
{}

class RobotA1 extends RobotA implements Sound
{
	public void stop()
	{
		System.out.println("Stop in RobotA1");
	}
	public void Beep()
	{
		System.out.println("Beep in RobotA1");
	}
}

class RobotB1 extends RobotB implements Sound, Motion
{
	public void forward()
	{}
	public void reverse()
	{}
	public void stop()
	{
		System.out.println("Stop in RobotB1");
	}
	public void Beep()
	{
		System.out.println("Beep in RobotB1");
	}
}

class RobotC1 extends RobotC implements Sound, Motion
{
	public void forward()
	{}
	public void reverse()
	{}
	public void stop()
	{
		System.out.println("Stop in RobotC1");
	}
	public void Beep()
	{
		System.out.println("Beep in RobotC1");
	}
}

public class Practical18
{
	public static void main(String[] args)
	{
		RobotA1 ra = new RobotA1();
		RobotB1 rb = new RobotB1();
		RobotC1 rc = new RobotC1();
		ra.Beep();
		ra.stop();
		rb.Beep();
		rb.stop();
		rc.Beep();
		rc.stop();
	
		}
}
