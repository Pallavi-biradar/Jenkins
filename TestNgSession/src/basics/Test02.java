package basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test02 {
	@Test
	public void demo1() {
		
		Reporter.log("from demo1 method",true);
	}
	@Test(priority=1)
	public void demo2() {
		
		Reporter.log("from demo2 method",true);
	}
	@Test(invocationCount=3)
	public void Demo() {
		
		Reporter.log("from Demo method",true);
	}
	@Test(invocationCount=3,threadPoolSize=4)
	public void demo3() {
		
		Reporter.log("from demo3 method",true);
	}
	@Test(dependsOnMethods= {"demo1","demo2"})
	public void Demo2() {
		
		Reporter.log("from Demo2 method",true);
	}
	@Test(enabled=false)
    public void Demo3() {
		
		Reporter.log("from Demo3 method",true);
	
	}
	@Test(timeOut=5000)
    public void demo4() {
		
		Reporter.log("from demo4 method",true);
	
	

	}
}
