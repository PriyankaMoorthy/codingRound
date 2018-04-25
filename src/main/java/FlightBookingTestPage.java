import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBookingTestPage {
  
  WebDriver driver;
  
  @FindBy (id = "OneWay")
  private WebElement selectOneWayRadioBtn;
  @FindBy (id = "FromTag")
  private WebElement fromTagTextBox;
  @FindBy (id = "toTag")
  private WebElement toTagTextBox;
  @FindBy (id = "SearchBtn")
  private WebElement searchBtn;
  @FindBy (xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
  private WebElement datePicker;
  
  public FlightBookingTestPage(WebDriver driver)
  {
     this.driver=driver;
     PageFactory.initElements(driver, this);
  }
  
  public void get_OneWayRadioBtnClick()
  {
	   selectOneWayRadioBtn.click();
  }
  
  public void get_FromTagTextBoxClick()
  {
	   fromTagTextBox.click();
  }
  
  public void get_FromTagTextBoxClick()
  {
	   fromTagTextBox.click();
  }
  
  public void get_FromTagTextBox(String fromText)
  {
	   fromTagTextBox.sendKeys(fromText);
  }
  
  public void get_ToTagTextBoxClick()
  {
	   toTagTextBox.click();
  }
  
  public void get_ToTagTextBox(String toText)
  {
	   toTagTextBox.sendKeys(toText);
  }
  
  public void get_DatePicker()
  {
	   datePicker.click();
  }
  
  public void get_ClickSearchBtn()
  {
	   searchBtn.click();
  }
  
