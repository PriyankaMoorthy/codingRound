import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInTestPage {
  
  @FindBy (linkText = "Your trips")
  private WebElement yourTripsLink;
  @FindBy (id = "SignIn")
  private WebElement signIn;
  @FindBy (id = "signInButton")
  private WebElement signInButton;
  @FindBy (id = "errors1")
  private WebElement errorText;
  
  public void get_yourtripslinktext()
  {
    yourTripsLink.click();
  }
  
  public void get_Signin()
  {
    signIn.click();
  }
  
  public void get_Signinbuttn()
  {
    signInButton.click();
  }
  
  public String get_errortext()
  {
	return errorText.getText();
  }
  
        //String errors1 = driver.findElement(By.id("errors1")).getText();
        //Assert.assertTrue(errors1.contains("There were errors in your submission"));

}
