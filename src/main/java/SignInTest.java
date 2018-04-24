import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BrowserFactory{

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws InterruptedException {

        SyncWait.waitFor(2000);
        Generic_Class gc= new Generic_Class();
        
        SignInTestPage clearTrip = new SignInTestPage(driver);
        
        clearTrip.
        
        driver.findElement(By.linkText("Your trips")).click();
        driver.findElement(By.id("SignIn")).click();

        driver.findElement(By.id("signInButton")).click();

        String errors1 = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
    }

}
