package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FrameTests extends BaseTests {
    @Test
    public void testframes(){
        var nestedFramesPage=homePage.clickFrames().clickNestedFrames();
        assertTrue(nestedFramesPage.getLeftframe().contains("LEFT"),"The left text id incorrect");
        assertTrue(nestedFramesPage.getBottomframe().contains("BOTTOM"),"The Bottom text id incorrect");
    }
}
