package actionClassP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	Actions act=new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	act.keyDown(Keys.PAGE_UP).build().perform();
	act.sendKeys(Keys.PAGE_UP).build().perform();
	WebElement LF = driver.findElement(By.xpath("//input[@placeholder=\"Leaving From\"]"));
	LF.click();
	LF.sendKeys("Nagpur");
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	act.keyDown(Keys.TAB).build().perform();
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
}
}
