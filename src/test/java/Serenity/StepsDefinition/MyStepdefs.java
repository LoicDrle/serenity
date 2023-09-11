package Serenity.StepsDefinition;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class MyStepdefs extends PageObject {

    @FindBy(xpath = "//input[@id=\"userName\"]")
    WebElementFacade InputName;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElementFacade InputPassword;

    @FindBy(xpath = "//button[@id=\"login\"]")
    WebElementFacade ClickLogin;

    @FindBy(xpath = "//p[@id=\"name\"]")
    WebElementFacade MessErreur;



    @Soit("Un étudiant sur le site {string}")
    public void unÉtudiantSurLeSite(String url) {
        openAt(url);
    }

    @Quand("il saisit son userName {string}")
    public void ilSaisitSonUserName(String nom) {
        InputName.sendKeys(nom);
    }

    @Et("il saisit son password {string}")
    public void ilSaisitSonPassword(String mdp) {
        InputPassword.sendKeys(mdp);
    }

    @Et("il clique sur le bouton login")
    public void ilCliqueSurLeBoutonLogin() {
        ClickLogin.click();
    }

    @Alors("le message d'erreur {string} apparait en rouge")
    public void leMessageDErreurApparaitEnRouge(String message) {
        MessErreur.isPresent();
        Assert.assertEquals(MessErreur.getText(), message);
    }
}
