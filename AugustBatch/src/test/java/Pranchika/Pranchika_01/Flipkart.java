package Pranchika.Pranchika_01;

import java.io.IOException;

import org.openqa.selenium.By;

public class Flipkart extends Dynamic_Code {

	public static void main(String[] args) throws IOException {
		launch_browser("chrome");
		takessreenshot("Browser_launch_SS");
		hit_url("https://www.flipkart.com/");
		screenshot_alternateway("FlipkaerUrl_SS");
		driver.findElement(By.xpath("(//a[@class=\"_1ch8e_\"])[2]")).click();
		screenshot_alternateway("MobileClickSS");
		driver.findElement(By.xpath("(//a[text()=\"iPhone 15 Pro Max\"])[1]")).click();
		System.out.println(driver.getTitle());
	}

}
