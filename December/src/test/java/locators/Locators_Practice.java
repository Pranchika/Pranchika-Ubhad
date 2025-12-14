package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Practice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		// id
		driver.findElement(By.id("mainContent"));
		driver.findElement(By.id("Iconly/Light-Outline/Camera"));
		// name
		driver.findElement(By.name("twitter:title"));
		driver.findElement(By.name("twitter:description"));
		// className
		driver.findElement(By.className("css-1oteowz"));
		driver.findElement(By.className("icon app-download css-3teuv3"));
		// linkText
		driver.findElement(By.linkText("Azai by Nykaa Fashion"));
		driver.findElement(By.linkText("Likha by Nykaa Fashion"));
		// partialLinkText
		driver.findElement(By.partialLinkText("Azai by Nykaa"));
		driver.findElement(By.partialLinkText("Likha by Nykaa"));
		// tagName
		driver.findElements(By.tagName("a"));
		driver.findElements(By.tagName("li"));
		// tagName and id
		driver.findElement(By.cssSelector("div#app"));
		driver.findElement(By.cssSelector("div#offline-resources"));
		// tagName and ClassName
		driver.findElement(By.cssSelector("div.css-x8ybv1"));
		driver.findElement(By.cssSelector("div.css-x8ybv1"));
		// tagName and attribute
		driver.findElement(By.cssSelector("meta[name=\"description\"]"));
		driver.findElement(By.cssSelector("meta[name=\"description\"]"));
		// tagName and multiple attribute
		driver.findElement(By.cssSelector(
				"meta[name=\"description\"][content=\"Nykaa Fashion – Online Shopping Site for Designer Clothes, Accessories & Lifestyle Products in India. Shop at Best Prices & Attractive Offers from India’s best Fashion Website.\"]"));
		driver.findElement(By.cssSelector("meta[property=\"og:title\"][data-react-helmet=\"true\"]"));
		// contains
		driver.findElement(By.cssSelector("meta[property*=\"og:ti\"]"));
		driver.findElement(By.cssSelector("meta[property*=\"og:ur\"]"));
		// startsWith
		driver.findElement(By.cssSelector("meta[property^=\"og:t\"]"));
		driver.findElement(By.cssSelector("meta[property^=\"og:u\"]"));
		// endsWith
		driver.findElement(By.cssSelector("meta[property$=\"g:title\"]"));
		driver.findElement(By.cssSelector("meta[property$=\"g:url\"]"));
		// pseudoClass- first-child
		driver.findElement(By.cssSelector("div[class=\"inline\"] :first-child"));
		//// pseudoClass- last-child
		driver.findElement(By.cssSelector("div[class=\"inline\"] :last-child"));
		// pseudoClass- nth-child
		driver.findElement(By.cssSelector("div[class=\"inline\"] :nth-child(2)"));
		// pseudoClass- nth-last-child Child
		driver.findElement(By.cssSelector("div[class=\"inline\"] :nth-last-child(5)"));

	}
}
