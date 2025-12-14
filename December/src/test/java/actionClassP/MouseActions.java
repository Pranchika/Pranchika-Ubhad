package actionClassP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Actions act=new Actions(driver);
		WebElement drop_menu = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		act.moveToElement(drop_menu).click().build().perform();
		WebElement IFrame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(IFrame);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		//act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		act.dragAndDrop(drag, drop).build().perform();
		act.moveToElement(drop_menu).contextClick();
		
		
		
	}

}
