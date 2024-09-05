package Pranchika.Pranchika_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_Dropdown extends Dynamic_Code {

	public static void main(String[] args) {
		launch_browser("chrome");
		hit_url("https://www.redbus.in/");
		WebElement from_opt = driver.findElement(By.cssSelector("input#src"));
		from_opt.click();
		
		from_opt.sendKeys("Nag");
		//from_opt.sendKeys("Nagpur");
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));
		for (int a = 0; a <= options.size(); a++) {
			try {
				if (options.get(a).getText().startsWith("Chatrapathi")) {
					options.get(a).click();
				}
			} catch (Exception IndexOutOfBoundsException) {

			}

		}
		WebElement to = driver.findElement(By.cssSelector("input#dest"));
		to.click();
		to.sendKeys("Mumbai");
		
		List<WebElement> to_opt = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));
		for(int b=0;b<=to_opt.size();b++) {
			try {
			if(to_opt.get(b).getText().startsWith("Kur")) {
				to_opt.get(b).click();
			}
			}catch(Exception StaleElementReferenceException) {
				
			}
		}
	}

}
