package windowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.BaseClass;

public class WindowHandles extends BaseClass {

	public static void main(String[] args) {
		launch_browser("Chrome");
		hit_url("https://www.myntra.com/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		WebElement search_box = driver
				.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
		act.moveToElement(search_box).click().sendKeys("Sneakers").build().perform();
		driver.findElement(By.xpath("//a[@class=\"desktop-submit\"]")).click();
		driver.findElement(By.xpath("(//img[@class=\"img-responsive\"])[1]")).click();
		Set<String> window_id = driver.getWindowHandles();
		Iterator<String> id = window_id.iterator();
		String parentID = id.next();
		String ChildID = id.next();
		System.out.println("PID : " + parentID);
driver.switchTo().window(ChildID);
driver.findElement(By.xpath("(//img[@class=\"colors-image\"])[3]")).click();
driver.switchTo().window(parentID);
driver.navigate().back();
driver.findElement(By.xpath("//div[@data-reactid=\"985\"]")).click();
driver.quit();
		
		
		
		
	}

}
