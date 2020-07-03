package demoprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

	public static void main(String[] args) {
			DesiredCapabilities d=DesiredCapabilities.chrome();
			d.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			//d.setCapability(, value);
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver(d);
			  
			 driver.manage().window().maximize();

			 driver.get("http://gmail.com");
			  
			 driver.quit();

	}

}
