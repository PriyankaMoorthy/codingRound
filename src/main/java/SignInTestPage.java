import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInTestPage {
  
  WebDriver driver;
	
  @FindBy (linkText = "Your trips")
  private WebElement yourTripsLink;
  @FindBy (id = "SignIn")
  private WebElement signIn;
  @FindBy (id = "signInButton")
  private WebElement signInButton;
  @FindBy (id = "errors1")
  private WebElement errorText;
	
  public SignInTestPage(WebDriver driver)
  {
     this.driver=driver;
     PageFactory.initElements(driver, this);
  }
  
  public void get_ClickYourtripslinktext()
  {
    yourTripsLink.click();
  }
  
  public void get_ClickSignin()
  {
    signIn.click();
  }
  
  public void get_ClickSigninbuttn()
  {
    signInButton.click();
  }
  
  public String get_errortext()
  {
	return errorText.getText();
  }
  
}
