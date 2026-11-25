package Modal;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import static org.testng.Assert.*;


public class ModalTests extends BaseTests {
    @Test
    public void testModal(){
        var Modal=homePage.clickEntryAd();
        Modal.clickclose();
        assertEquals(Modal.getHeaderText(),"Entry Ad","incorrect message");
    }
}
