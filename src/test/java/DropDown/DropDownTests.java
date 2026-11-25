package DropDown;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.HomePage;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDown(){
        String option="Option 1";
        var DropDownPage= homePage.clickDropDown();
        DropDownPage.selectFromDropDown(option);
        var selectedOptions=DropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"The size is incorrect");
        assertTrue(selectedOptions.contains(option),"The option is not selected");
    }
}
