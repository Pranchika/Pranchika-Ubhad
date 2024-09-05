package Pranchika.Pranchika_01;

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
import org.openqa.selenium.safari.SafariDriver;

public class Dynamic_Code {
	public static WebDriver driver;

	public static void launch_browser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("Safari")) {
			driver = new SafariDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("Launch Browser is : " + browser);
	}

	public static void hit_url(String url) {
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	public static void takessreenshot(String screenshotname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./MyntraSS_Javascriptexecutor/"+ screenshotname + ".png");
		FileHandler.copy(source, target);

	}
	
	public static void screenshot_alternateway(String screenshotname) throws IOException {
	String Projectpath = System.getProperty("user.dir");
	System.out.println(Projectpath);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(Projectpath + "\\Evidences\\" + screenshotname +".png");
		FileHandler.copy(source, target);

	}
}
