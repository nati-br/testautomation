package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

import java.util.Random;

import static support.Utils.getRandomEmail;

public class LoginPage  extends RunCucumberTest {

    private static By create_email_field = By.id("email_create");
    private By create_email_button = By.id("SubmitCreate");

    public void acessarTelaLogin(){
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.waitElementBePresent(create_email_field,20);

    }

    public static void preencherCampoEmail(){
        getDriver().findElement(create_email_field).sendKeys(getRandomEmail());

    }

    public void clicarCriarConta(){
        getDriver().findElement(create_email_button).click();
    }
}
