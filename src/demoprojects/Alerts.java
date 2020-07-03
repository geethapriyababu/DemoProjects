package demoprojects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	/*// Chrome
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-popup-blocking");
	driver = new ChromeDriver(options);

	// Firefox
	FirefoxOptions options = new FirefoxOptions();
	options.addPreference("dom.disable_beforeunload", true)
	WebDriver driver = new FirefoxDriver(options);
*/
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        WebDriverWait wait=new WebDriverWait(driver,50);
        //wait.until(ExpectedConditions.)
        
        
        
        System.out.println(alertMessage);
        driver.quit();
	}

}
