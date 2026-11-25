package FileUpload;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String absolutePath="C:\\Users\\Mariam Mohamed\\IdeaProjects\\Selenium1\\resources\\" ;
        String filename="aaaa.txt";
        var FileUploadPage =homePage.clickFileUpload();
        FileUploadPage.fileUpload(absolutePath+filename);
        assertEquals(FileUploadPage.getUploadedFiles(),filename,"The file name is incorrect");
    }
}
