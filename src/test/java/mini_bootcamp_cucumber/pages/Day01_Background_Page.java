package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day01_Background_Page {

    public Day01_Background_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class =\"MuiButton-startIcon MuiButton-iconSizeSmall css-906rka\"])[2]")
    public WebElement login;
    @FindBy(xpath = "//button[text()='Giriş Yap']")
    public WebElement giris;

    @FindBy(xpath = "//input[@name =\"email\"]")
    public WebElement email;
    @FindBy(xpath = "//input[@name =\"password\"]")
    public WebElement password;
    @FindBy(xpath = "//button [@type = \"submit\"]")
    public WebElement girisYap;
    @FindBy(xpath = "//*[text() =\"Üye Ol\"]")
    public WebElement uyeOl;
    @FindBy(xpath = "//input[@name =\"name\"]")
    public WebElement ad;
    @FindBy(xpath = "//input[@name =\"surname\"]")
    public WebElement soyad;
    @FindBy(xpath = "//input[@name =\"email\"]")
    public WebElement eposta;
    @FindBy(xpath = "//input[@placeholder=\"Telefon Numarası\"]")
    public WebElement ceptel;
    @FindBy(xpath = "//input[@name =\"password\"]")
    public WebElement sifre1;
    @FindBy(xpath = "//input[@name =\"rePassword\"]")
    public WebElement sifre2;
    @FindBy(xpath = "//input[@name =\"acceptKvk\"]")
    public WebElement kullanim;
    @FindBy(xpath = "//input[@name =\"allowMarketing\"]")
    public WebElement firsat;
    @FindBy(xpath = "(//span [@class =\"MuiButton-endIcon MuiButton-iconSizeSmall css-jkqy1l\"])[2]")
    public WebElement uyelikUyeOl;
}
