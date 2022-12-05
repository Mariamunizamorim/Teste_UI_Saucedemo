package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utils.DicionariosDeMensagens;
import utils.MassaDeDados;


public class LoginTest {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDeDados massa = new MassaDeDados();
	DicionariosDeMensagens msg = new DicionariosDeMensagens();

	@Given("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() {
		Executa.abrirNavegador();

	}
	@After
	public void finalizarTeste() {
		Executa.fecharBavegador();
		
	}

	@Given("preencher o usuario")
	public void preencherOUsuario() {
		metodos.escrever(el.name, massa.standard_user);

	}

	@Given("preencher a senha")
	public void preencherASenha() {
		metodos.escrever(el.password, massa.secret_sauce);

	}

	@When("realizar o login")
	public void realizarOLogin() {
		metodos.clicar(el.btnLogin);

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		metodos.currentUrl("https://www.saucedemo.com/inventory.html");

	}

	@Given("preencher com usuario bloqueado")
	public void preencherComUsuarioBloqueado() {
		metodos.escrever(el.name, massa.locked_out_user);

	}

	@Then("sistema apresenta mensagem dados bloqueado")
	public void sistemaApresentaMensagemDadosBloqueado() {
		metodos.validarTexto(el.msgBloq, msg.msgBloq);
		

	}

	

}
