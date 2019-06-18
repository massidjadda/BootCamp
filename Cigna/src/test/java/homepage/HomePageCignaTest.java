package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageCignaTest extends CommonAPI {
    HomePageCigna home;

    @BeforeMethod
    public void init() {
        home = PageFactory.initElements(driver, HomePageCigna.class);
    }

    //public void searchbarTest(){
    //  home.setSearchbar("doctor nearby");
    //  sleepFor(3);
    //  driver.findElement(By.xpath("//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/div/button")).click();
    // sleepFor(3);


    //   }

    @Test(priority = 1)
    public void logbuttonTest() {
        home.clicklog();
        sleepFor(3);
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("massidjadda");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        sleepFor(4);
    }
}
