package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {
    CadastroPage cadastropage = new CadastroPage(driver);

    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastropage.selectTitle(2);
        cadastropage.preencheNome("Natalia");
        cadastropage.preencheSobrenome("De Santana");
        cadastropage.preencherSenha("#11245ffD");
        cadastropage.selecionaAniversario(23, 12, "1997");
        cadastropage.preencheAddress("Rua Qualquer");
        cadastropage.SelecionarState("Colorado");
        cadastropage.preencheCity("Denver");
        cadastropage.preenchePostalcode("12345");
        cadastropage.preenchePhoneMobile("+5500123456789");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastropage.clickRegister();
    }

    @Então("^vejo cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
       cadastropage.validaCadastro();
    }

}
