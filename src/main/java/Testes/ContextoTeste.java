package Testes;

import org.junit.Test;

import Core.BaseTest;
import Pages.ContextoPage;
import Pages.MenuPage;

public class ContextoTeste extends BaseTest {
	MenuPage menupage = new MenuPage();
	ContextoPage contextoPage = new ContextoPage();

	@Test
	public void t_01CriarContextoSucesso() {
		menupage.acessarTelaContexto();
		contextoPage.setPalavra("");
		contextoPage.setSom("");
		contextoPage.setVideo("");
		contextoPage.setCadastrar();
	}

	public void t_02CadastrarContextoFotoTamanhoMaiorQuePermitido() {
		menupage.acessarTelaContexto();
		contextoPage.setPalavra("");
		contextoPage.setSom("");
		contextoPage.setVideo("");
		contextoPage.setCadastrar();
	}

	public void t_03CadastrarContextoSemEnviarFoto() {
		menupage.acessarTelaContexto();
		contextoPage.setPalavra("");
		contextoPage.setSom("");
		contextoPage.setVideo("");
		contextoPage.setCadastrar();
	}

	public void t_04CadastrarContextoEnviandoUrlQueNãoSejaVideo() {
		menupage.acessarTelaContexto();
		contextoPage.setPalavra("");
		contextoPage.setSom("");
		contextoPage.setVideo("");
		contextoPage.setCadastrar();
	}

	public void t_05CadastrarConxtextoSemPreencherCampos() {
		menupage.acessarTelaContexto();
		contextoPage.setPalavra("");
		contextoPage.setSom("");
		contextoPage.setVideo("");
		contextoPage.setCadastrar();
	}

}
