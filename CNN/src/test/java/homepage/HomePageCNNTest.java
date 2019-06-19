package homepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageCNNTest extends CommonAPI {
    HomePageCNN homePageCNN;

    @BeforeMethod
    public void init() {
        homePageCNN = PageFactory.initElements(driver, HomePageCNN.class);
    }

   @Test(priority = 1)
    public void USpanelTest(){
        homePageCNN.USpanel();
        sleepFor(3);
        navigateBack();
        driver.getTitle();

   }

   @Test(priority = 2)
    public void searchTest(){
        homePageCNN.setSearchbar("algerian news");
        sleepFor(4);
   }

   @Test(priority = 3)
    public void selectMenu(){
        homePageCNN.setMenu();
   }


}

