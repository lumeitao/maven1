package com.ahead;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
	public static WebDriver driver;
	public static String url="https://www.baidu.com/";
	@BeforeClass
	public void openfirefox() {
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		 driver=new ChromeDriver();
		//DesiredCapabilities c=DesiredCapabilities.chrome();
		 //driver=new RemoteWebDriver(new URL("http://192.168.43.79:5551/wd/hub"),c);

	}
	@Test
public void login() throws InterruptedException {
		driver.get(url);//打开考试系统
}

	
	
}