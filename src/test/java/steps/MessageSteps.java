package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.MessagePage;
import runner.RunCucumberTest;
import support.Utils;

public class MessageSteps extends RunCucumberTest {
    MessagePage messagePage = new MessagePage();
    @Dado("^que estou na tela de mensagens$")
    public void que_estou_na_tela_de_mensagens()  {
        messagePage.acessarTelaDeMensagem();
    }

    @E("^preencho todos os campos$")
    public void preencho_todos_os_campos()  {
        messagePage.acessarTelaDeMensagem();
        messagePage.selecionarAssunto("Webmaster");
        messagePage.preencherMenssagem("Minha mensagem");
        messagePage.uploadFile("C:\\Users\\natal\\IdeaProjects\\testautomation\\arquivo.jpg");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() {
        messagePage.enviar();
    }

    @Então("^vejo mensagem enviada com sucesso$")
    public void vejo_mensagem_enviada_com_sucesso() {

    }




}
