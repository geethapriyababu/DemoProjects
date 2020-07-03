package demoprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://demo.guru99.com/test/social-icon.html");
        String expectedTooltip = "Github";	

      //  WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
        WebElement github = driver.findElement(By.className("github"));
        String actualTooltip = github.getAttribute("title");	
        System.out.println("Actual Title of Tool Tip"+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();			
*/

		driver.get("http://demo.guru99.com/test/tooltip.html");
        String expectedTooltip = "What's new in 3.2";					

		
		WebElement f = driver.findElement(By.id("download_now"));
		Actions act=new Actions(driver);
		act.moveToElement(f).build().perform();
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
        String actualTooltip = toolTipElement.getText();			
        
        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case Passed");					
        }		
        driver.close();			

		
	}

}
