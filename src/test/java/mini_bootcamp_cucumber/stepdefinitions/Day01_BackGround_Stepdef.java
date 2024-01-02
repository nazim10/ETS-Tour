package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day01_Background_Page;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class Day01_BackGround_Stepdef {
    Day01_Background_Page page = new Day01_Background_Page();
    String expectedUrl = "";

    @Given("{string} sitesine gidilir")
    public void sitesineGidilir(String arg0) {

        Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
        expectedUrl = Driver.getDriver().getCurrentUrl();

    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {

         ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > efilli-layout-dynamic\").shadowRoot.querySelector(\"#ba05d7b4-d023-4c31-a95c-767dd32a3123\")");
    }

    @When("giris butonuna basilir")
    public void girisButonunaBasilir() {
        page.giris.click();

    }

    @And("eposta girilir")
    public void epostaGirilir() {
        page.email.sendKeys("hakan@gmail.com");
        ReusableMethods.wait(2);
    }

    @And("password girilir")
    public void passwordGirilri() {
        page.password.sendKeys("524353443");
        ReusableMethods.wait(2);
    }

    @When("giris yap butonuna basilir")
    public void girisYapButonunaBasilir() {
        page.girisYap.click();
        ReusableMethods.wait(2);
    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals("hakan", actualUrl);
        Driver.closeDriver();

    }

    @And("soyad girilir")
    public void soyadGirilir() {

       //page.soyad.sendKeys("gsfdgdfg");
       //ReusableMethods.wait(2);
    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#__next > div.MuiBox-root.css-gsbezb > div.navbar-right-container.css-j7qwjs > div.css-15kgpcb > div > button:nth-child(2)\")");
        //page.uyeOl.click();
        ReusableMethods.wait(2);
    }

    @And("ad girilir")
    public void adGirilir() {

        page.ad.sendKeys("abidin");
        page.soyad.sendKeys("dino");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {
       page.eposta.sendKeys("haklf@gmail.com");
    }

    @And("ceptelefonu girilir")
    public void ceptelefonuGirilir() {
        page.ceptel.sendKeys("436453647");

    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {
        page.sifre1.sendKeys("4545677788");
    }

    @And("password yeniden girlir")
    public void passwordYenidenGirlir() {
        page.sifre2.sendKeys("4545677788");
    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {
        page.kullanim.click();
    }

    @And("kampanyalara checkbox secilir")
    public void kampanyalaraCheckboxSecilir() {
        page.firsat.click();
    }

    @When("uyelik sayfasinda uye ol butonuna basilir")
    public void uyelikSayfasindaUyeOlButonunaBasilir() {
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > div.MuiModal-root.css-1oarejg > div.modal-container.no-scrollbar.MuiBox-root.css-16o7ey1 > div.css-l5c1s3 > div:nth-child(3) > form > div.css-dvxtzn > button\")");
      //  page.uyelikUyeOl.click();

    }


}
