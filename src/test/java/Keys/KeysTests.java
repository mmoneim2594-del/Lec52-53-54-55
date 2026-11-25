package Keys;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {
    @Test
    public void testkeys(){
        var KeyPressesPage=homePage.clickKeyPresses();
        KeyPressesPage.setText(Keys.chord(Keys.SHIFT,"a"));
        assertEquals(KeyPressesPage.getResultMessage(),"You entered: A","Message is incorrect");
    }
}
