package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyJenkin1 {
	@Test
	public void show() {
		System.setProperty("webdriver.chromedriver.driver", "D:\\Driver\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title= driver.getTitle();
		System.out.println(title);
		
		
	}

}
