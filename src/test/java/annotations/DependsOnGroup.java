package annotations;

import org.testng.annotations.Test;

public class DependsOnGroup {
	

	
	@Test(priority=-5,invocationCount=5)
	public void priority1() {
		System.out.println(1/0);
	}

	@Test(groups= {"group1"})
	public void group1() {
		System.out.println(1/0);
		System.out.println("I am belongs to group111111");
		System.out.println("group1");
	}
	
	@Test(groups= {"group2"})
	public void group2() {
		System.out.println("I am belongs to group2");
	}
	
	@Test(dependsOnGroups = {"group1", "group2"})
	public void group1and2() {
		System.out.println("I am belongs to group1and2");
	}
	
	@Test(dependsOnGroups = "group1")
	public void group2and3() {
		System.out.println("I am belongs to group2and3");
	}
	
    
}
