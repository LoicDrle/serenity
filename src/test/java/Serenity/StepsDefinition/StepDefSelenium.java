package Serenity.StepsDefinition;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class StepDefSelenium extends PageObject {

    @FindBy(xpath = "//a[contains(@class, \"selenium-webdriver\")]")
    WebElementFacade ClickWebDriver;
    @FindBy(xpath = "//div//h1[contains(., \"WebDriver\")]")
    WebElementFacade VerifPageWebDriver;
    @FindBy(xpath = "//a[@id=\"m-documentationwebdrivergetting_started\"]")
    WebElementFacade ClickGetting;
    @FindBy(xpath = "//div//h1[contains(., \"Getting started\")]")
    WebElementFacade VerifPageGetting;
    @FindBy(xpath = "//a//span[contains(., \"Downloads\")]")
    WebElementFacade ClickDownloads;
    @FindBy(xpath = "//h1")
    WebElementFacade VerifPageDownloads;
    @FindBy(xpath = "//div//h1[contains(., \"Downloads\")]")
    WebElementFacade VerifTitle;



    @Soit("Un utilisateur se rend sur le site selnium {string}")
    public void unUtilisateurSeRendSurLeSiteSelnium(String url) {
        openAt(url);
    }

    @Quand("il clique sur le webdriver")
    public void ilCliqueSurLeWebdriver() {
        ClickWebDriver.click();
    }

    @Alors("il arrive sur la page du webdriver")
    public void ilArriveSurLaPageDuWebdriver() {
        VerifPageWebDriver.isPresent();
    }

    @Quand("il clique sut le lien getting strated")
    public void ilCliqueSutLeLienGettingStrated() {
        ClickGetting.click();
    }

    @Alors("il arrive sur la page getting started")
    public void ilArriveSurLaPageGettingStarted() {
        VerifPageGetting.isPresent();
    }

    @Quand("il clique sur le lien de telechargement du nav")
    public void ilCliqueSurLeLienDeTelechargementDuNav() {
        ClickDownloads.click();
    }

    @Alors("il arrive sur la page du telechargement")
    public void ilArriveSurLaPageDuTelechargement() {
        VerifPageDownloads.isPresent();
    }

    @Et("il verifie que le contenue du titre est egal au {string}")
    public void ilVerifieQueLeContenueDuTitreEstEgalAu(String titre) {
        Assert.assertEquals(VerifTitle.getText(), titre);
    }
}