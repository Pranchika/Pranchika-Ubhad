package Pranchika.Pranchika_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Goibibo extends Dynamic_Code{

	public static void main(String[] args) throws InterruptedException {
		launch_browser("chrome");
		hit_url("https://www.goibibo.com/");
        driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
        driver.findElement(By.xpath("(//p[@class=\"sc-gEvEer gpfTmR\"])[2]")).click();
       WebElement from = driver.findElement(By.xpath("(//div[@class=\"sc-12foipm-2 eTBlJr fswFld \"])[1]"));
       //Thread.sleep(3000);
       from.click();
       try {
       from.sendKeys("Nag");
       }catch(Exception ElementNotInteractableException) {
    	   
       }
        
	}

}
