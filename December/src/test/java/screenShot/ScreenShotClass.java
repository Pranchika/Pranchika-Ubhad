package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamicCode.BaseClass;

public class ScreenShotClass extends BaseClass {

	public static void main(String[] args) throws IOException {
		launch_browser("Chrome");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/ChromeSS1.png");
		FileHandler.copy(source, target);
		hit_url("https://www.crazygames.com/");
		//TakesScreenshot ts2=(TakesScreenshot) driver;
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./Screenshot/URLCG.png");
		FileHandler.copy(source, target);
		driver.findElement(By.cssSelector("input#search-input")).click();
		ScreenShot("Screenshot", "SearchBoxClick");
		

	}

}
