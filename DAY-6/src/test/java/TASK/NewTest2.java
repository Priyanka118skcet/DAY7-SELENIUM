package TASK;

import org.testng.annotations.Test;

public class NewTest2 {

	public class GroupTestCases {
		@Test(groups={"Programming"})
	public void JavaProgramming() {
		System.out.println("Inside the Java Programming block");
	}
		@Test(groups={"Programming"})
	public void PythonProgramming() {
		System.out.println("Inside the Python Programming block");
	}
		@Test(groups={"Web"})
	public void BootStrap() {
		
		  System.out.println("Inside the BootStrap");
		 }
		@Test(groups={"Web"})
	public void JQuery() {
		System.out.println("Inside the JQuery");
	}
	}
}
