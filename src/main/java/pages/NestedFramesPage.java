package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topframe="frame-top";
    private String bottomframe="frame-bottom";
    private String leftframe="frame-left";
    private String rightframe="frame-right";
    private String middleframe="frame-middle";
    private By body=By.tagName("body");
    public NestedFramesPage(WebDriver driver){
        this.driver=driver;
    }
    public String getLeftframe(){
        driver.switchTo().frame(topframe);
        driver.switchTo().frame(leftframe);
        String leftText= driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return leftText;

    }
    public String getBottomframe(){
        driver.switchTo().frame(bottomframe);
        String bottomText=driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return bottomText;
    }

}
