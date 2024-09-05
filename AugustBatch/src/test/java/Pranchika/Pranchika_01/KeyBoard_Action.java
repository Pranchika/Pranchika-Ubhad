package Pranchika.Pranchika_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Action extends Dynamic_Code {

	public static void main(String[] args) throws InterruptedException {
		launch_browser("chrome");
		hit_url("https://www.jeevansathi.com/");
		Actions act = new Actions(driver);
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		act.moveToElement(email).click().sendKeys("prachi123@gmail.com").build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
       act.keyDown(Keys.TAB).build().perform();
       act.keyDown(Keys.TAB).build().perform();
       act.keyDown(Keys.TAB).build().perform();
       act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
       WebElement eye_butn = driver.findElement(By.cssSelector("div#eye"));
       act.moveToElement(eye_butn).click().build().perform();
       act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
       
       Thread.sleep(3000);
       act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
       Thread.sleep(3000);
       act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
       

	}

}
