package FacebookTest;

import Facebook.FacebookPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FacebookTestClass extends CommonAPI {
    FacebookPage facebook;

    @BeforeMethod
    public void init() {
        facebook = PageFactory.initElements(driver, FacebookPage.class);

    }

    @Test(priority = 1)
    public void LoginTest() {
        facebook.LogIn("6463775311", "2405199406djadda");
        sleepFor(3);
    }


}
