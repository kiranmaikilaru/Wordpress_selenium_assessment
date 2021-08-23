package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static common.Constants.*;


public class Test1_Update_Profile extends BaseTest {

    @Test
    public void updateProfile() throws Exception {

        String firstName = "first";
        String lastName = "last";
        String displayName = "first123";
        String description = "Interested in providing content";

        ProfilePage page = new ProfilePage(driver);
        page.getdriver().get(URL);
        page.login(username, password);
        page.open_myprofile();

        page.updateProfileDetails(firstName,lastName,displayName,description);

        page.waitForElementToBeClickable(page.statusNotification);
        page.getdriver().navigate().refresh();

        page.waitForElementToBeClickable(page.firstNameTextbox);

        String updatedFirstName = page.firstNameTextbox.getAttribute("value");
        String updatedLastName = page.lastNameTextbox.getAttribute("value");
        String updatedDisplayName = page.displayNameTextbox.getAttribute("value");
        String updatedDescription = page.descriptionTextbox.getAttribute("value");

        Assert.assertEquals(firstName, updatedFirstName);
        Assert.assertEquals(lastName, updatedLastName);
        Assert.assertEquals(displayName, updatedDisplayName);
        Assert.assertEquals(description, updatedDescription);
    }
}
