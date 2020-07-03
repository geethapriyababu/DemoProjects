package demoprojects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesNodes {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ally.io/careers/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("why");

		List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//following-sibling::div//a[@data-mapped='true']"));
		//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text()='Engineering']//following-sibling::div[@class='opening']"));
		//List<WebElement> findElements = driver.findElements(By.xpath("//h3[text(),'Engineering']//following-sibling::div[@class='opening']//following-sibling::span[@class='location']"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
		driver.quit();
	}

}
