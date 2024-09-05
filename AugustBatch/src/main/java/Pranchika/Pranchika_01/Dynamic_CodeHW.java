package Pranchika.Pranchika_01;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Dynamic_CodeHW {
	public static WebDriver driver;
	
	
	
	//to launch browser
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
	// to hit url
	public static void hit_url(String url) {
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	//To Click  using Action Class
		public static void Click(WebElement element_name) {
			Actions act=new Actions(driver);
			act.moveToElement(element_name).click().build().perform();
		}

	//To Enter text using Action Class
	public static void Action_Text(WebElement element_name,String text) {
		Actions act=new Actions(driver);
		act.moveToElement(element_name).click().sendKeys(text).build().perform();
	}
	
	//To Copy text
	public static void Copy_text() {
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.CONTROL)
		.sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	}
	
	//To Paste text
	public static void Paste_text() {
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
	}
	
	//To Rightclick 
	public static void Rightclick(WebElement elementName) {
		Actions act=new Actions(driver);
		act.moveToElement(elementName).contextClick().build().perform();
	}
	
	//To DoubleClick
	public static void DoubleClick(WebElement Element) {
		Actions act=new Actions(driver);
		act.moveToElement(Element).doubleClick().build().perform();
	}
	
	//To Drag and Drop 
	public static void DragAndDrop(WebElement Source,WebElement Target) {
		Actions act=new Actions(driver);
		 act.dragAndDrop(Source, Target).build().perform();
	}
	
	//To move Slider by certain Offset
	public static void MoveSlider(WebElement ElementName1,int x,int y) {
		Actions act=new Actions(driver);
		act.moveToElement(ElementName1).dragAndDropBy(ElementName1, x, y);
	}
	
	//Switch to Frame
	public static void SwitcToFrame(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	
	//Back to Window
	public static void BackToWindow() {
		driver.switchTo().defaultContent();
	}
	
	//To Navigate BackWard
	public static void ToNavigateBackward() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.history.back()");
	}
	
	//To Navigate Forward
	public static void ToNavigateForward() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.history.forward()");
	}
	
	//To Refresh Page
	public static void RefreshPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.history.go(0)");
	}
	
	//To Scroll by certain Offset
	public static void ScrollByOffset(int a,int b) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy"+"("+ a + ","+ b + ")");
	}
	
	//To Scroll at Bottom
	public static void ScrollBottom() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	//To Scroll using PageDown Key
	public static void PageDownToScroll() {
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
	}
	
	//To Scroll using PageUp Key
	public static void PageUptoScroll() {
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_UP).build().perform();
	}
	
}

