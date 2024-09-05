package Pranchika.Pranchika_01;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor extends Dynamic_Code {

	public static void main(String[] args) throws IOException {
		launch_browser("Chrome");
		hit_url("https://www.myntra.com/");
		takessreenshot("url_Hit_of Myntra");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1250)");
		takessreenshot("After scrolling 1250");
		js.executeScript("window.scrollBy(0,-750)");
		takessreenshot("After scrolling -750");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takessreenshot("After scrolling at bottom");
		js.executeScript("window.scrollBy(0,-2800)");
		driver.findElement(By.xpath("(//a[text()=\"Makeup\"])[3]")).click();
		takessreenshot("After clicking on makeup");
		js.executeScript("window.history.back()");
		takessreenshot("After clicking on backward");
		js.executeScript("window.history.forward()");
		takessreenshot("After clicking on forward");
		js.executeScript("window.history.go(0)");
		takessreenshot("After clicking on refresh");
	}

	
}
