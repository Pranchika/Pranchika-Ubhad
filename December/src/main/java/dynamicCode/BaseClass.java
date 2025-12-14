package dynamicCode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {
public static WebDriver driver;
public static TakesScreenshot ts;
public static void hit_url(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
}
	public static void launch_browser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Internet Explore")) {
			driver=new InternetExplorerDriver();
		}else {
			System.out.println("Browser not specified/Found");
		}
		
		
	}
	public static void ScreenShot(String SSFolderName,String SSName) throws IOException {
		ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./"+SSFolderName+"/"+SSName+".png");
		FileHandler.copy(source, target);
	}
	

}
