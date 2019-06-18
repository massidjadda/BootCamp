package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageClass extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchBar;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    WebElement clicksearch;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement loginClick;

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement enterEmail;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement enterPassword;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
    WebElement product;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
    WebElement addtocart;

    @FindBy(xpath = "//*[@id=\"hlb-ptc-btn-native\"]")
    WebElement proceed;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div[3]/h1/span/span/span/span")
    WebElement returntocart;


    public void setSearchBar() {
        searchBar.sendKeys("pearl jam");
        sleepFor(3);
        clicksearch.click();
        sleepFor(3);

    }

    public void LogIn(String email, String pass) {
        loginClick.click();
        sleepFor(5);
        enterEmail.sendKeys("email");
        enterPassword.sendKeys("pass");
        login.click();
        sleepFor(3);
    }

    public void selectProduct() {
        product.click();

    }

    public void AddToCart() {
        addtocart.click();
    }

    public void Checkout() {
        proceed.click();
    }

    public void returntocart() {
        returntocart.click();

    }


}
