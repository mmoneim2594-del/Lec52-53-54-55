package JS;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    public void testAlerts(){
        var JavaScriptAlertsPage=homePage.clickJavaScriptAlerts();
        JavaScriptAlertsPage.clickJSAlert();
        assertEquals (JavaScriptAlertsPage.getAlertText(),"I am a JS Alert","The alert is incorrect");
        JavaScriptAlertsPage.acceptAlert();
        assertEquals (JavaScriptAlertsPage.getResultMessage(),"You successfully clicked an alert","The result message is incorrect");


    }
    @Test
    public void testConfirm() {
        var JavaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        JavaScriptAlertsPage.clickJSConfirm();
        assertEquals(JavaScriptAlertsPage.getAlertText(), "I am a JS Confirm", "The alert is incorrect");
        JavaScriptAlertsPage.dismissConfirm();
        assertEquals(JavaScriptAlertsPage.getResultMessage(), "You clicked: Cancel", "The result message is incorrect");
    }
    @Test
    public void testPrompt() {
        var JavaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        JavaScriptAlertsPage.clickJSPrompt();
        assertEquals(JavaScriptAlertsPage.getAlertText(), "I am a JS prompt", "The alert is incorrect");
        JavaScriptAlertsPage.setPromptText("Route");
        JavaScriptAlertsPage.acceptAlert();
        assertEquals(JavaScriptAlertsPage.getResultMessage(), "You entered: Route", "The result message is incorrect");
    }
}
