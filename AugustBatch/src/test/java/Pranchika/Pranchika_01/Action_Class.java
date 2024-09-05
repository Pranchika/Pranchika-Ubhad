package Pranchika.Pranchika_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_Class extends Dynamic_Code {

	public static void main(String[] args) {
		launch_browser("Chrome");
		hit_url("https://jqueryui.com/");
		WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(Draggable).click().build().perform();
		System.out.println("After clicking on Draggable tile:" + driver.getTitle());
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
         driver.switchTo().frame(frame);
         WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
         act.moveToElement(drag).doubleClick(drag).clickAndHold().moveByOffset(60, 60).release().build().perform();
         driver.switchTo().defaultContent();
         WebElement Droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
        act.moveToElement(Droppable).click().build().perform();
        WebElement Droppableframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(Droppableframe);
        WebElement drag1 = driver.findElement(By.cssSelector("div#draggable"));
        WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
        act.dragAndDrop(drag1, drop).build().perform();
        driver.switchTo().defaultContent();
     WebElement theme = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
     act.moveToElement(theme).click().build().perform();
     WebElement gallery = driver.findElement(By.xpath("//a[text()=\"Gallery\"]"));
      act.moveToElement(gallery).doubleClick().build().perform();
      //WebElement image = driver.findElement(By.xpath("//img[@title=\"Base\"]"));
   //   act.moveToElement(image).contextClick().build().perform();
     WebElement demos = driver.findElement(By.xpath("//a[text()=\"Demos\"]"));
     act.moveToElement(demos).click().build().perform();
     WebElement slider = driver.findElement(By.xpath("//a[text()=\"Slider\"]"));
    act.keyDown(slider, Keys.PAGE_DOWN).click().build().perform();
   WebElement SliderFrame = driver.findElement(By.cssSelector("iframe.demo-frame"));
    driver.switchTo().frame(SliderFrame);
    WebElement toslide = driver.findElement(By.xpath("//span[@style=\"left: 0%;\"]"));
    act.moveToElement(toslide).dragAndDropBy(toslide, 40, 0).build().perform();
    act.moveToElement(toslide).dragAndDropBy(toslide, -10, 0).build().perform();
    driver.switchTo().defaultContent();
	}
}
