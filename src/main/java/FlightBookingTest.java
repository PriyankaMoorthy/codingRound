import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FlightBookingTest extends BrowserFactory {

    @Test
    public void testThatResultsAppearForAOneWayJourney() {

        Generic_Class gc= new Generic_Class();
	FlightBookingTest clearTripFlightBooking = new FlightBookingTest(driver);
	    
	SyncWait.waitFor(2000);
	clearTripFlightBooking.get_OneWayRadioBtnClick();
	clearTripFlightBooking.get_FromTagTextBoxClear();
	clearTripFlightBooking.get_FromTagTextBox(gc.getPropertyValue("FromText"));
        
        //wait for the auto complete options to appear for the origin
        SyncWait.waitFor(2000);
        clearTripFlightBooking.sel_orginOptions();
        clearTripFlightBooking.get_ToTagTextBoxClear();
        clearTripFlightBooking.get_ToTagTextBox(gc.getPropertyValue("ToText"));
        
        //wait for the auto complete options to appear for the destination
        SyncWait.waitFor(2000);
        //select the first item from the destination auto complete list
        clearTripFlightBooking.sel_destinationOptions();
        clearTripFlightBooking.get_DatePicker();

        //all fields filled in. Now click on search
        clearTripFlightBooking.get_ClickSearchBtn();

        SyncWait.waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent("searchSummaryelt"));

    }
    
    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
