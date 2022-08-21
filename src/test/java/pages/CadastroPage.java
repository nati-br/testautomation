package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;
    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");
    private By select_day_field = By.id("days");
    private By select_months_field= By.id("months");
    private By select_years_field = By.id("years");
    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");
    private By submit_button = By.id("submitAccount");



    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(int type) {
        waitElementBePresent(titleF, 20);
        if (type == 1) {
            driver.findElement(titleM).click();
        } else if (type == 2) {
            driver.findElement(titleF).click();

        }

    }
    public void preencheNome(String nome){
        driver.findElement(first_name_field).sendKeys(nome);
    }

    public void preencheSobrenome(String sobrenome){
        driver.findElement(last_name_field).sendKeys(sobrenome);
    }

    public void preencherSenha(String senha){
        driver.findElement(password_field).sendKeys(senha);
    }

    public void selecionaAniversario(Integer day, Integer months, String year){
        Select select_day = new Select(driver.findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month= new Select(driver.findElement(select_months_field));
        select_month.selectByIndex(months);

        Select select_year = new Select(driver.findElement(select_years_field));
        select_year.selectByValue(year);


    }

    public void preencheAddress(String address){
        driver.findElement(address_field).sendKeys(address);
    }

    public void preencheCity(String city){
        driver.findElement(city_field).sendKeys(city);
    }

    public void SelecionarState (String state){
        Select select_state = new Select(driver.findElement(state_field));
        select_state.selectByVisibleText(state);
    }

    public void preenchePostalcode(String postalcode){
        driver.findElement(postcode_field).sendKeys(postalcode);
    }

    public void preenchePhoneMobile(String phone){
        driver.findElement(phone_mobile_field).sendKeys(phone);
    }

    public void clickRegister(){
        driver.findElement(submit_button).click();
    }
    public void validaCadastro(String nome, String sobrenome){
        waitElementBePresent(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"), 20);
        String resultado_atual = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
        Assert.assertEquals(nome + " "+ sobrenome,resultado_atual);
    }



}
