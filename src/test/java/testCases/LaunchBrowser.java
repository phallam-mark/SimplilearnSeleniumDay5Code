package testCases;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void EnterCalorieDetails() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("BMI")).click();
		WebElement bmiElement = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[5]/div[1]/font[1]/b[1]"));
		String bmiRange = bmiElement.getText();
		System.out.println("bmi value = " + bmiRange);
		Assert.assertEquals(bmiRange,"Normal");
		Thread.sleep(1000);
		driver.close();
	}
}