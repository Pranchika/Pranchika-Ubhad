package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nykaa.com/");
	driver.manage().window().maximize();
	//tagName and Attribute
	driver.findElement(By.xpath("//meta[@name=\"viewport\"]"));
	driver.findElement(By.xpath("//script[@id=\"mfilterit-visit-tag\"]"));
	//tagName and Multiple Attribute
	driver.findElement(By.xpath("//link[@rel=\"icon\"][@type=\"image/x-icon\"]"));
	driver.findElement(By.xpath("//script[@type=\"text/javascript\"][@data-ueto=\"ueto_8e60c48ef3\"]"));
//Multiple attribute using and operator
	driver.findElement(By.xpath("//div[@class=\"disable-scrollbars css-8e4mb9\" and@class=\"disable-scrollbars css-8e4mb9\"]"));
	driver.findElement(By.xpath("(//div[@width=\"35\" and@class=\"68dfafe25b0645d23f939186 css-1x5vu8t\"])[1]"));
	//Multiple attribute using or operator
	driver.findElement(By.xpath("(//div[@width=\"35\" or@class=\"68 css-1x5vu8t\"])[1]"));
	driver.findElement(By.xpath("(//div[@id=\"6931988c1ee442f73b6d78b1\" or@class=\"banner-container css-1r8kto8\"])[1]"));
	//contains
	driver.findElement(By.xpath("//meta[contains(@name,\"viewpo\")]"));
	driver.findElement(By.xpath("(//script[contains (@type,\"text/java\")])[5]"));
	//starts-with
	driver.findElement(By.xpath("(//script[starts-with (@type,\"text/java\")])[5]"));
	driver.findElement(By.xpath("//link[starts-with(@rel,\"ic\")]"));
	//text
	driver.findElement(By.xpath("//title[text()=\"Buy Cosmetics Products & Beauty Products Online in India at Best Price | Nykaa\"]"));
	driver.findElement(By.xpath("//span[text()=\"Store & Events\"]"));
	//parent and child relationship
	driver.findElement(By.xpath("(//div[@class=\"MegaDropdowntopWrapper\"]//a[@target=\"_blank\"])[3]"));
	driver.findElement(By.xpath("(//div[@class=\"MegaDropdowntopWrapper\"]//a[@target=\"_blank\"])[5]"));
	//current node or self node
	driver.findElement(By.xpath("(//a[@rel=\"noopener noreferrer\"]//self::a)[98]"));
	driver.findElement(By.xpath("(//a[@rel=\"noopener noreferrer\"]//self::a)[105]"));
	
}
}
