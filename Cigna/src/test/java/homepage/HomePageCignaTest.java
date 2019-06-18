package homepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageCignaTest extends CommonAPI {
    HomePageCigna home;

    @BeforeMethod
    public void init() {
        home = PageFactory.initElements(driver, HomePageCigna.class);
    }
}
