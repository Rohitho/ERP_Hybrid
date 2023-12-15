package drivenFactory;

import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void kickStart() throws Throwable {
		driverscript ds = new driverscript();
		ds.startTest();
	}
}