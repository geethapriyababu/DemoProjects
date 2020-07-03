package demoprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class CssSelector {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement f = driver.findElement(By.cssSelector("input.inputtext[type=email]"));
		Thread.sleep(2000);
		f.sendKeys("someth");
		
		//driver.get("http://demo.guru99.com/test/newtours/");
		//driver.findElement(By.cssSelector("font:contains(Boston)"));
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		Select s=new Select(f);
		
		Actions act=new Actions(driver);
		act.click();
		act.click(f);
		act.clickAndHold();
		act.clickAndHold(f);
		act.contextClick();
		act.contextClick(f);
		act.doubleClick();
		act.doubleClick(f);
		act.dragAndDrop(source, target)
		act.dragAndDropBy(source, xOffset, yOffset)
		act.keyDown(key)
		act.keyDown(f, key);
		act.keyUp(key);
		act.keyUp(target, key);
		act.moveByOffset(xOffset, yOffset);
		act.moveToElement(f).pause(10000).;
		act.moveToElement(target, xOffset, yOffset);
		act.pause(duration);
		act.pause(pause);
		act.perform();
		act.release();
		act.release(target);
		act.sendKeys(target, keys);
		act.sendKeys(target, keys);
		act.tick(arg0);
		act.tick(arg0);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
