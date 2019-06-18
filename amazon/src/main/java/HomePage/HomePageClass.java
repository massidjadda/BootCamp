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

    @FindBy(xpath = "//a[@class='nav-imageHref']//img")
    WebElement deals;

    @FindBy(xpath = "//a[contains(text(),'daily deals email')]")
    WebElement details;

    @FindBy(xpath = "//input[@name='verify']")
    WebElement verify;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement pass;

    @FindBy(id = "signInSubmit")
    WebElement submit;

    public void setDeals(){
        deals.click();
    }
    public void setDetails(){
        details.click();
    }
    public void setVerify(){
        verify.click();
    }
    public void setEmail(String name){
        email.sendKeys(name);
    }
    public void setPass(String password){
        pass.sendKeys(password);
    }
    public void setSubmit(){
        submit.click();
    }



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

