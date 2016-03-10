package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Wait;


public class SeleniumTempTest {
	
	public static void main(String[] args) {
		System.out.println("START MAIN");

		FirefoxProfile profile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(profile);
		String url="http://java-web-service.au-syd.mybluemix.net/api/ctof/100";
		driver.get("http://java-web-service.au-syd.mybluemix.net/api/ctof/100");
		driver.manage().window().maximize();
		System.out.println("11111111");
		WebElement result=driver.findElement(By.xpath("/html/body/pre"));
		
		String val=result.getText();
		System.out.println("Done"+val+"url:"+url.substring(54, 57)+":val==="+val.substring(10, 13));
		
		if((url.substring(54, 57)).equals("100") ){
			System.out.println("1111111111");
			if((val.substring(10, 13)).equals("212")){
				System.out.println("222222222");
				System.out.println("Value Pass");
			}
		}
		
		

}
}
