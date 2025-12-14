package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import dynamicCode.BaseClass;

public class AlertsTypes extends BaseClass{

	public static void main(String[] args) {
		launch_browser("Chrome");
		hit_url("https://demo.automationtesting.in/Alerts.html");
		//SimpleAlert
		
 driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
 Alert SA = driver.switchTo().alert();
 SA.accept();
 
 System.out.println("--------------------");
 //Confirmation Alert
  driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
  
    driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
    Alert CA = driver.switchTo().alert();
    CA.dismiss();
    WebElement text = driver.findElement(By.cssSelector("p#demo"));
 System.out.println("text present:"+text.getText());
 
 System.out.println("--------------------");
//Prompt alert
 
 driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[3]")).click();
driver.findElement(By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]")).click();
 
 Alert PA = driver.switchTo().alert();
 PA.sendKeys("STP");
 PA.accept();
 WebElement txt = driver.findElement(By.cssSelector("p#demo1"));
 System.out.println("text present:"+txt.getText());
	}
	
	
	
	
	

}
