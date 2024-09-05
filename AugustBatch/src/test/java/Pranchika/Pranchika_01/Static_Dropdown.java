package Pranchika.Pranchika_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown extends Dynamic_Code {

	public static void main(String[] args) {
		launch_browser("Chrome");
		hit_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Jeevansathi_Login&utm_term=login%20jeevansathi&gad_source=1&gclid=CjwKCAjw59q2BhBOEiwAKc0ijfu27EYPA-SPw-86BqBZvZHTZJytdp1MJKwIIN1WGGS9DUfF0-E5mBoCf68QAvD_BwE");
		WebElement create_profile_for = driver.findElement(By.cssSelector("select#reg_relationship"));
		Select sd = new Select(create_profile_for);
		sd.selectByVisibleText("Daughter");
		WebElement day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
		Select sd1 = new Select(day);
		sd1.selectByValue("5");
		WebElement month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
		Select sd2 = new Select(month);
        sd2.selectByIndex(11);
	}

}
