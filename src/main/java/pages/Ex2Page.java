package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By loadedMessage = By.cssSelector("#finish > h4");

    public Ex2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnStart(){
        driver.findElement(startButton).click();
    }
    public String getLoadedMessage(){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
      //  wait.until(ExpectedConditions.presenceOfElementLocated(loadedMessage));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedMessage)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loadedMessage));

        return driver.findElement(loadedMessage).getText();
    }
}
