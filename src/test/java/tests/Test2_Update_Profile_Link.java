package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static common.Constants.*;


public class Test2_Update_Profile_Link extends BaseTest {

    @Test
    public void updateProfileLink() throws Exception {

        String link = "https://google.com";
        String description = "google webiste";

        ProfilePage page = new ProfilePage(driver);
        page.getdriver().get(URL);
        page.login(username, password);
        page.open_myprofile();
        page.updateProfileLink(link, description);

        page.waitForElementToBeClickable(page.profileLinkResult);

        String obtainedString = page.profileLinkResult.getText();

        try{
        Assert.assertTrue(obtainedString.contains("google.com"));
        Assert.assertTrue(obtainedString.contains("google website"));
        }finally
        {
            page.profileLinkRemove.click();
        }
    }
}
