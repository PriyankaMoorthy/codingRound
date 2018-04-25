import org.testng.annotations.Test;
import GenericMethods.Browser_Factory;
import GenericMethods.Generic_Class;

public class HotelBookingTest extends BrowserFactory{

    @Test
    public void shouldBeAbleToSearchForHotels() throws InterruptedException {
        
        Generic_Class gc= new Generic_Class();
        HotelBookingTest clearTripHotelBooking = new HotelBookingTest(driver);
        
        clearTripHotelBooking.get_ClickHotelLink();
        clearTripHotelBooking.get_ClickLocalityTxtBox();
        clearTripHotelBooking.get_LocalityTxtBox(gc.getPropertyValue("LocalityText"));
        //new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        clearTripHotelBooking.get_ClickSearchButton();
    }
}
