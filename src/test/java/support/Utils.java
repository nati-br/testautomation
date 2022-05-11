package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {
    public void waitElementBePresent(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public String getRandomEmail() {
        String email_init = "natalia";
        String email_final = "@gmail.com";

        //gera um e-mail aleatorio
        Random random = new Random();
        int minimo = 0;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;
        return email_init + resultado + email_final;

    }
}
