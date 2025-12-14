package actionClassP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Actions act = new Actions(driver);
		WebElement Slider = driver.findElement(By.xpath("//a[text()=\"Slider\"]"));
		Slider.click();
		WebElement IFrame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(IFrame);
		WebElement slide_bar = driver
				.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		act.moveToElement(slide_bar).clickAndHold().moveByOffset(500, 0).release().build().perform();
		driver.switchTo().defaultContent();
		WebElement drop_menu = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		act.moveToElement(drop_menu).contextClick().build().perform();
		act.moveToElement(drop_menu).doubleClick().build().perform();

	}

}
