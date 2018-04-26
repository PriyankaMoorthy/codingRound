import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.support.ui.Select;

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
  @FindBy (xpath = "//*[@id='ui-id-1']/li")
  private List<WebElement> orginOptions;
  @FindBy (xpath = "//*[@id='ui-id-2']/li")
  private List<WebElement> destinationOptions;
  @FindBy (className = "searchSummary")
  private WebElement searchSummaryelt;
	
  public FlightBookingTestPage(WebDriver driver)
  {
     this.driver=driver;
     PageFactory.initElements(driver, this);
  }
  
  public void get_OneWayRadioBtnClick()
  {
	   selectOneWayRadioBtn.click();
  }
  
  public void get_FromTagTextBoxClear()
  {
	   fromTagTextBox.clear();
  }
  
  public void get_FromTagTextBox(String fromText)
  {
	   fromTagTextBox.sendKeys(fromText);
  }
  
  public void get_ToTagTextBoxClear()
  {
	   toTagTextBox.clear();
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
	
  public void sel_orginOptions()
  {	
	List<WebElement> lst= orginOptions;
	orginOptions.get(0).click();
  }
	
  public void sel_destinationOptions()
  {	
	List<WebElement> lst1= destinationOptions;
	destinationOptions.get(0).click();
  }
 
  public boolean get_SearchSummary()
  {
	return searchSummaryelt.isDisplayed();
  }
