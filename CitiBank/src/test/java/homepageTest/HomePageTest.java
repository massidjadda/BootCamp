package homepageTest;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends CommonAPI {
    HomePage cigna;

    @BeforeMethod
    public void init (){
        cigna= PageFactory.initElements(driver,HomePage.class);
    }
}
