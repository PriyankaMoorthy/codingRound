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
        
        clearTrip.get_yourtripslinktext();
        clearTrip.get_Signin();
        clearTrip.get_Signinbuttn();
        
        String message = clearTrip.get_errortext();
        Assert.assertTrue(message.contains("There were errors in your submission"));
    }

}
