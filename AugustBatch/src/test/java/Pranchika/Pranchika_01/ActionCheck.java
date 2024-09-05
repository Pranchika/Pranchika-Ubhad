package Pranchika.Pranchika_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionCheck extends Dynamic_CodeHW {

	public static void main(String[] args) {
		launch_browser("Chrome");
		hit_url("https://jqueryui.com/");
		WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
		Click(Draggable);
		 WebElement Droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		 Click(Droppable);
		 WebElement Droppableframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
		 SwitcToFrame(Droppableframe);
		WebElement drag1 = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		DragAndDrop(drag1, drop);
		BackToWindow();
		 WebElement theme = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
		 Click(theme);
		 WebElement gallery = driver.findElement(By.xpath("//a[text()=\"Gallery\"]"));
		 DoubleClick(gallery);

	}

}
