package homepage;

import HomePage.HomePageClass;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTestClass extends CommonAPI {
    HomePageClass homepage;

    @BeforeMethod
    public void init() {
        homepage = PageFactory.initElements(driver, HomePageClass.class);
    }

  /* @Test(priority = 1)
public void SearchBarTest(){
        homepageTest.setSearchBar();
    }*/

  /*  @Test(priority = 1)
    public void LoginTest(){
        homepageTest.LogIn("massidjadda@gmail.com","snannak1");
    }*/

   /* @Test(priority = 1)
    public void browse(){
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
        select.selectByIndex(13);
        homepageTest.setSearchBar();
        sleepFor(4);
    }*/

    @Test(priority = 1)
    public void selectproductTest() {
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
        select.selectByIndex(13);
        homepage.setSearchBar();
        sleepFor(4);
        homepage.selectProduct();
        sleepFor(2);
        homepage.AddToCart();
        sleepFor(2);
        homepage.Checkout();
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("massidjadda@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("snannak1");
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]")).click();


    }

   /* @Test
    public void setDealsTest(){
        homepage.setDeals();
        homepage.setDetails();
        homepage.setVerify();

    }*/
}


