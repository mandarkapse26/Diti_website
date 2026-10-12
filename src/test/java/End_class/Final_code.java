package End_class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Middle_class.Second;

public class Final_code extends Second {
	
	@BeforeMethod
	public void page() {
	set();
	}
	
	@Test
public void pagelogin() {
		run();
		Screen_shot(null);
		 
	}
	
	@AfterMethod
public void pageEnd() {
		driver.close();
	}
	

}
