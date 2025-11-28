package upload;

import baseTests.BaseTests;
import org.testng.annotations.Test;
import pages.AlertPage;

import static org.testng.Assert.assertEquals;

public class UploadTest extends BaseTests {
    @Test
    public void uploadTest() {
        var uploadSection = homePage.moveToContactUsPage();
        uploadSection.setNameField("Aliane");
        uploadSection.setEmailField("aliane.isimbi2023@kepler.org");
        uploadSection.setSubjectField("Complaint");
        uploadSection.setMessageField("Here's your complaint");
        assertEquals(uploadSection.clickSubmitButton(), new AlertPage(driver), "Failed to upload");

    }
}
