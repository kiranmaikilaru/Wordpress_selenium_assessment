package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static common.Constants.*;


public class Test3_Display_name extends BaseTest {

    @Test
    public void updateDisplayName() throws Exception {

    
        String displayName = "first123";

        ProfilePage page = new ProfilePage(driver);
        page.getdriver().get(URL);
        page.login(username, password);
        page.open_myprofile();

        page.displayNameTextbox.sendKeys(displayName);
        page.waitForElementToBeClickable(page.saveProfileButton);
        page.saveProfileButton.click();
        String updatedLabel = page.displayNameLabel.getText();

        Assert.assertEquals(displayName, updatedLabel);
    }
}
