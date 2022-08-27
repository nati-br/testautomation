package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage();
    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaLogin();
    }

    @Dado("^acesso o cadastro do usuario$")
    public void acesso_o_cadastro_do_usuario() {
        loginPage.preencherCampoEmail();
        loginPage.clicarCriarConta();
    }
}
