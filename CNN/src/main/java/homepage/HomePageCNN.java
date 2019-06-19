package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePageCNN extends CommonAPI {
   @FindBy(xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[1]")
    WebElement US;
   @FindBy(xpath = "//*[@id=\"jp_container_player1\"]/div[1]/div[2]/div[1]/div[1]/div")
   WebElement playbutton;

   @FindBy(xpath = "//*[@id=\"search-button\"]")
   WebElement searchbutton;

   @FindBy(xpath = "//*[@id=\"search-input-field\"]")
   WebElement searchbar;

   @FindBy(xpath = "//*[@id=\"menu\"]")
   WebElement menu;


   public void USpanel(){
       US.click();
       sleepFor(3);
       playbutton.click();
       sleepFor(3);
   }

   public void setSearchbar(String search){
       searchbutton.click();
       searchbar.sendKeys(search);
   }

   public void setMenu(){
       Select menu = new Select(driver.findElement(By.xpath("//*[@id=\"menu\"]")));
       menu.selectByVisibleText("Africa");
   }

}




