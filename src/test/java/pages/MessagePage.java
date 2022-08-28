package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

import static support.Utils.getRandomEmail;

public class MessagePage extends RunCucumberTest {
    private By subject_field = By.id("id_contact");
    private By message_field = By.id("message");
    private By upload_field = By.id("fileUpload");

    private static By email_field = By.id("email");
    private By Submit_button = By.id("submitMessage");

    public  void acessarTelaDeMensagem(){
        getDriver().get("http://automationpractice.com/index.php?controller=contact");
        Utils.waitElementBePresent(message_field,20);

    }
    public void selecionarAssunto (String assunto){
        Select select_assunto = new Select(getDriver().findElement(subject_field));
        select_assunto.selectByVisibleText(assunto);
    }

    public void preencherMenssagem (String message){
        getDriver().findElement(message_field).sendKeys(message);
    }

    public void uploadFile (String pathfile){
        getDriver().findElement(upload_field).sendKeys(pathfile);
    }

    public static void preencherCampoEmail(){
        getDriver().findElement(email_field).sendKeys(getRandomEmail());

    }

    public void enviar(){
        getDriver().findElement(Submit_button).click();
    }



}
