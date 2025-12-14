package reportGenerate;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamicCode.BaseClass;

public class ReportGenerate extends BaseClass{

	public static void main(String[] args) throws IOException {
	String projectpath = System.getProperty("user.dir");
	ExtentSparkReporter esr=new ExtentSparkReporter(projectpath+"\\Reports\\ReportGenerated\\");
	esr.config().setDocumentTitle("Automation Report");
	esr.config().setReportName("Gaming Website");
	esr.config().setTheme(Theme.STANDARD);
	
	ExtentReports er=new ExtentReports();
	er.attachReporter(esr);
	
	er.setSystemInfo("OS", "Window");
	er.setSystemInfo("Browser", "Chrome");
	er.setSystemInfo("Domain", "Gaming");
	er.setSystemInfo("Application", "CrazyGames");
	er.setSystemInfo("Tester", "Pranchika");
	er.setSystemInfo("Client", "Unity");
	er.setSystemInfo("BrowserVersion", "4.9");
	
	ExtentTest et=er.createTest("Launch Browser");
	et.log(Status.INFO, "Launch Browser");
	
	ExtentTest et1=er.createTest("Hit Url");
	et1.log(Status.INFO, "Hit Url");
	
	ExtentTest et2=er.createTest("Clickon searchbox");
	et2.log(Status.PASS, "Clickon searchbox");
	
	ExtentTest et3=er.createTest("Enter data");
	et3.log(Status.INFO, "Enter data");
	
	ExtentTest et4=er.createTest("Click on search icon");
	et4.log(Status.INFO, "Click on search icon");
	
	ExtentTest et5=er.createTest("Select Wishlist");
	et5.log(Status.INFO, "Select Wishlist");
	
	ExtentTest et6=er.createTest("Click on close tab");
	et6.log(Status.INFO, "Click on close tab");
	
	launch_browser("Chrome");
	ScreenShot("Screenshot", "LaunchSS1");
	et.addScreenCaptureFromPath(projectpath+"\\Screenshot\\LaunchSS1"+".png");
	
	
	hit_url("https://www.crazygames.com/");
	ScreenShot("Screenshot", "HitUrlCG");
	er.flush();
		
		
		
		

	}

}
