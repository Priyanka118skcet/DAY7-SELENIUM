package TASK;

import org.testng.annotations.Test;

public class NewTest1 {

	public class PriorityDemo {
		@Test(priority=1)
	public void Samsung()
	{
		System.out.println("Samsung");
	}
		@Test(priority=2)
	public void Apple()
	{
		System.out.println("Apple");
	}
		@Test(priority=3)
	public void Nokia()
	{
		System.out.println("Nokia");
	}

}
}
