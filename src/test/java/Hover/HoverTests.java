package Hover;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHover(){
        var HoverPage=homePage.clickHover();
        var figureCaption=HoverPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(),"The caption is not displayed");
        assertEquals(figureCaption.getName(),"name: user1","The name is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile","The Link Text is incorrect");
        assertTrue(figureCaption.getLink().contains("/users/1"),"Link is incorrect");

    }
}
