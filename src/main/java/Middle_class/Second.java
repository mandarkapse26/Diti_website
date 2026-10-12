package Middle_class;

import org.openqa.selenium.By;

import Base_Module.Frist_class;

public class Second extends Frist_class {
	
	By log = By.xpath("//*[@id=\"navbar\"]/a");
	By user = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[1]/input");
	By pass = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[2]/input");
	By logbtn = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[3]/button/span");

	public void run() {
	    driver.findElement(log).click();	
	    driver.findElement(user).sendKeys("diti2019");	
	    driver.findElement(pass).sendKeys("diti@123456");	
	    driver.findElement(logbtn).click();	

	    	
	    
	    }
	}
