package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.cssSelector("input#email"));
	email.click();
	email.sendKeys("prachi@123");
	email.clear();
	WebElement pass = driver.findElement(By.cssSelector("input#pass"));
	pass.click();
	pass.sendKeys("prachik@123");
	WebElement eye_Button = driver.findElement(By.cssSelector("div._9lsa"));
	eye_Button.click();
	WebElement login_Button = driver.findElement(By.xpath("//button[@name=\"login\"]"));
	System.out.println(email.getAttribute("value"));
	System.out.println(login_Button.getText());
	System.out.println(login_Button.getLocation().x);
	System.out.println(login_Button.getLocation().y);
	System.out.println(login_Button.getSize());
	System.out.println(login_Button.getTagName());
	System.out.println(login_Button.isEnabled());
	System.out.println(login_Button.isDisplayed());
	System.out.println(login_Button.isSelected());
	email.clear();
	driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
	driver.navigate().back();
	WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	System.out.println(logo.isDisplayed());
	
	
}
}
