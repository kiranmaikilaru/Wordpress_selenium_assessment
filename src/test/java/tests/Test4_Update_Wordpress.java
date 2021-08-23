package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static common.Constants.*;


public class Test4_Update_Wordpress extends BaseTest {

    @Test
    public void updateWordpressLink() throws Exception {



        ProfilePage page = new ProfilePage(driver);
        page.getdriver().get(URL);
        page.login(username, password);
        page.open_myprofile();
        page.addButton.click();
        page.waitForElementToBeClickable(page.addURLButton);
        page.addURLButton.click();
        page.waitForElementToBeClickable(page.enterURLTextbox);
        Assert.assertTrue(page.createSiteButton.isDisplayed());
       
    }
}
