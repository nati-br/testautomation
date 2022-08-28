package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = {"src/test/resources/features"},
        tags = {"@enviar-mensagem-sucesso"},
        glue = {"steps"}

)
public class RunCucumberTest extends RunBase{

    @AfterClass
    public static void stop(){
        driver.quit();
    }
}
