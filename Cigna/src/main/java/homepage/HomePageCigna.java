package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageCigna extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")
    WebElement searchbar;

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[1]/div/ul/li[2]/a")
    WebElement contact;

    @FindBy(css = "#includes-content > div.d-none.d-lg-block > nav:nth-child(2) > div > ul > li:nth-child(2) > a")
    WebElement logbutton;


    public void setSearchbar(String searchHere) {
        searchbar.click();
        searchbar.sendKeys(searchHere);
    }

    public void setContact() {
        contact.click();
        sleepFor(3);
    }

    public void clicklog() {
        logbutton.click();
        sleepFor(3);
    }


}
