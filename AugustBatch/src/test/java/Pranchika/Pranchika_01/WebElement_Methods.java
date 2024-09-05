package Pranchika.Pranchika_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		Thread.sleep(2000);
		searchbox.click();
		searchbox.sendKeys("Mobiles");
		searchbox.clear();
		searchbox.sendKeys("Books");
		System.out.println(searchbox.getText());
		System.out.println(searchbox.getAttribute("value"));
		System.out.println(searchbox.getLocation().x);
		System.out.println(searchbox.getLocation().y);
		System.out.println(searchbox.getSize());
		driver.close();
	
	}

}
