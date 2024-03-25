package org.data;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethod {
	public static WebDriver driver;
public static WebDriver browserlaunch(String bname) {
	
	if (bname.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	else if (bname.equalsIgnoreCase("Edge") ) {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
	}
	return driver;
	}
public static void geturl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}
public static void click(WebElement e ) {
e.click();
	
}
public static void sendkeys(WebElement e, String a) {
	e.sendKeys(a);

}


public static void Select(WebElement e , String h) {
	Select s=new Select(e);
	s.selectByVisibleText(h);		
			
		
}
public static String getattribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;
}
public static String currenturl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	
}

public void close(WebDriver a) {
	a.close();
}
public void quit() {
	driver.quit();
}
public static void implicitlyWait(int a) {
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}








}



