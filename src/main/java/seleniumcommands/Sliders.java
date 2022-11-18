package seleniumcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {
	
	public static void main(String[] args) {
//added few comment to check the git
		
		//https://deluxe-menu.com/popup-mode-sample.html
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			((HasAuthentication)driver).register(UsernameAndPassword.of("admin", "admin"));
			String url = "https://jqueryui.com/slider/";
			driver.get(url);
			driver.manage().window().maximize();// maximaze your window
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			driver.switchTo().frame(0);
			
			WebElement slidertip = driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));
			
			WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
			int width = slider.getSize().width;
			
			Actions actions = new Actions(driver);
			
			actions.dragAndDropBy(slidertip, width/5, 0).dragAndDropBy(slidertip, width/2, 0).perform();
		
			
				
			
			
			
			
			
		
	}

}
