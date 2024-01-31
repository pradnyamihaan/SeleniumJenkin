package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyJenkin1 {
	@Parameters("Browser")
	@Test
	public void show(String browserName) {
		System.out.println("Use chrome browser");
		if(browserName.contains("Chrome")) {
		System.setProperty("webdriver.chromedriver.driver", "D:\\Driver\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title= driver.getTitle();
		System.out.println(title);
		}
		
	}

}
