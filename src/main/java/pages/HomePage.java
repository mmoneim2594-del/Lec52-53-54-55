package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthentication(){
      clicklink("Form Authentication");
        return new LoginPage(driver);

    }
    public DropDownPage clickDropDown(){
        clicklink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoverPage clickHover(){
        clicklink("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clicklink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertsPage clickJavaScriptAlerts(){
        clicklink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clicklink("File Upload");
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickEntryAd(){
        clicklink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public FramesPage clickFrames(){
        clicklink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clicklink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }


    public void clicklink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
