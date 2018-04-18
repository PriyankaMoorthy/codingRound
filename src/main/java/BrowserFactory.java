import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Browser_Factory {

public WebDriver driver;

@BeforeClass
private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
        
        Generic_Class gc= new Generic_Class();
        driver.get(gc.getPropertyValue("App_URL"));
	        
			  driver.manage().window().maximize();
				
			  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}
		
		@AfterClass
		public void closeBrowser()
		{
			driver.quit();
		}
}
