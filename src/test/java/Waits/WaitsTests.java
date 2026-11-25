package Waits;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.Base64;

public class WaitsTests extends BaseTests {
    @Test
    public void testwaits() {
        var ex1Page = homePage.clickDynamicLoading().clickEx1Link();
        ex1Page.clickOnStart();
        assertEquals(ex1Page.getLoadedMessage(), "Hello World!", "The text is not loaded");
    }
    @Test
    public void testwaits2(){
       var ex2Page= homePage.clickDynamicLoading().clickEx2Link();
       ex2Page.clickOnStart();
       assertEquals(ex2Page.getLoadedMessage(),"Hello World!","The text is not loaded");
    }
}
