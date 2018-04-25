import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingTest() {
  
WebDriver driver;
	
@FindBy(linkText = "Hotels")
private WebElement hotelLink;
@FindBy(id = "Tags")
private WebElement localityTextBox;	
@FindBy(id = "SearchHotelsButton")
private WebElement searchButton;
@FindBy(id = "travellersOnhome")
private WebElement travellerSelection;
	
public HotelBookingTest(WebDriver driver)
  {
     this.driver=driver;
     PageFactory.initElements(driver, this);
  }

public void get_ClickHotelLink()
{
	hotelLink.click();
}
public void get_ClickLocalityTxtBox()
{
	localityTextBox.click();
}
public void get_LocalityTxtBox(String localityText)
{
	localityTextBox.sendKeys(localityText);
}
public void get_ClickTravellerSelection()
{
	travellerSelection.click(); 
}
public void get_ClickSearchButton()
{
	searchButton.click();
}

