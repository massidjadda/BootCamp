package homepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageCNNTest extends CommonAPI {
    HomePageCNN homePageCNN;

    @BeforeMethod
    public void init (){
        homePageCNN = PageFactory.initElements(driver, HomePageCNN.class);
    }
    /*@Test
    public void setUsTest(){
        homePageCNN.setUs();

    }
    //@Test
    public void setWorldTest(){
        homePageCNN.setWorld();
    }
    // @Test
    public  void setPoliticsTest(){
        homePageCNN.setPolitics();
    }*/
    @Test
    public void setsearchNewsTest(){
        homePageCNN.setSearchnews();
    }


}

