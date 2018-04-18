import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInTestPage {
  
  @FindBy (linkText = "Your trips")
  private static WebElement Yourtripslink;
  @FindBy (id = "SignIn")
  private static WebElement signIn;
  @FindBy (id = "signInButton")
  private static WebElement signInButton;
  @FindBy (id = "errors1")
  private static WebElement ErrorText;
  
        String errors1 = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));

}
