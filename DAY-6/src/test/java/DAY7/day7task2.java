package DAY7;
import org.testng.Assert;
import org.testng.annotations.Test;
public class day7task2 {
	int a=10,b=2,c;
    @Test(priority=3)
	public void add()
	{
		c=a+b;
		System.out.println("Addition");
		Assert.assertEquals(12, c);
	}
    @Test(priority=4)
    public void sub()
    {
    	c=a-b;
		System.out.println("Substration");
		Assert.assertEquals(8, c);  	
    }    
    @Test(priority=2)
    public void mul()
    {
    	c=a*b;
		System.out.println("multiplication");
		Assert.assertEquals(20, c);	
    }
    @Test(priority=1)
    public void div()
    {
    	c=a/b;
		System.out.println("division");
		Assert.assertEquals(5, c);
    } 
}
