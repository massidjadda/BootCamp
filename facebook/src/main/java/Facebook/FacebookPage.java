package Facebook;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;



public class FacebookPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement enteremail;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement enterPass;

    @FindBy(xpath = "//*[@id=\"u_0_2\"]")
    WebElement clicklog;

    public void LogIn(String EMAIL, String PASS){
        enteremail.sendKeys("EMAIL");
        enterPass.sendKeys("PASS");
        clicklog.click();
        sleepFor(3);
    }


}
