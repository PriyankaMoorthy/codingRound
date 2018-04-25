import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingTest extends BrowserFactory{

    @Test
    public void shouldBeAbleToSearchForHotels() throws InterruptedException {
        
        Generic_Class gc= new Generic_Class();
        HotelBookingTest clearTripHotelBooking = new HotelBookingTest(driver);
        
        clearTripHotelBooking.get_ClickHotelLink();
        clearTripHotelBooking.get_ClickLocalityTxtBox();
        clearTripHotelBooking.get_LocalityTxtBox(gc.getPropertyValue(""));
        
        //localityTextBox.sendKeys("Indiranagar, Bangalore");
        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();

        driver.quit();

    }

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
    }

}
