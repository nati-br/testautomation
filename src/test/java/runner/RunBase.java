package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class RunBase {
     static WebDriver driver;
     private enum Browser{
         CHROME, FIREFOX
     }
     public static WebDriver getDriver(){
        return null;
     }

    public static WebDriver getDriver(Browser browser){
         if (driver != null){
             driver.quit();
         }
         switch (browser){
             case CHROME:
                 driver = new ChromeDriver();
                 break;
             case FIREFOX:
                 driver = new FirefoxDriver();
                 break;

             default:
                 throw new IllegalArgumentException("passe um navegador válido");
         }
        return driver;
    }

}
