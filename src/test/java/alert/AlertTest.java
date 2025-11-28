package alert;

import baseTests.BaseTests;
import org.testng.annotations.Test;
import pages.UploadFile;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {

    @Test
    public void AlertTest(){
        var getUploadFile = homePage.moveToContactUsPage();
        var getAlert = getUploadFile.clickSubmitButton();
        getAlert.setNameField("Aliane");
        getAlert.setEmailField("aliane.isimbi2023@kepler.org");
        getAlert.setSubjectField("Complaint");
        getAlert.setMessageField("Here's my complaint");
        getAlert.getAlert();
        getAlert.acceptAlert();
        assertEquals(getAlert.getResult(), "Success! Your details have been submitted successfully.", "Wrong result message");
    }

}
