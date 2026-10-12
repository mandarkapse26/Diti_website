package Base_Module;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frist_class {
	public static WebDriver driver;
	public static Properties prop;
	private static final Logger log = LogManager.getLogger( Frist_class.class);

	public void set() {
		try {
			prop = new Properties();
			FileInputStream mn = new FileInputStream(
				    "C:\\Users\\manda\\eclipse-workspace\\Diti_Website\\config.properties"
				);

				prop.load(mn);
				mn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		log.info("code start");
		
	
	}
	
	public void Screen_shot(String test_code) {
		try {
		String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"/Screenshotmk/"+ test_code +"_"+ time +".jpg");
		FileUtils.copyFile(source, destination);
		
		log.info("Screenshot taken successfully");
		
	 } catch (Exception e) {
         e.printStackTrace();
     }
 }
}