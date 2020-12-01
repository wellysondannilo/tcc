package Testes;

import org.junit.Test;

import Core.BaseTest;
import Pages.DesafiosPage;
import Pages.MenuPage;

public class DesafiosTeste  extends BaseTest{
	
	
	MenuPage menupage = new MenuPage();
	DesafiosPage desafiosPage = new DesafiosPage();

	@Test
	public void t_01CadastrarDesafioSucesso() {
		menupage.acessarTelaContexto();
		desafiosPage.setPalavra("");
		desafiosPage.setSom("");
		desafiosPage.setVideo("");
		desafiosPage.setCadastrar();
	}

	public void t_02CadastrarDesafioSemContexto() {
		menupage.acessarTelaContexto();
		desafiosPage.setPalavra("");
		desafiosPage.setSom("");
		desafiosPage.setVideo("");
		desafiosPage.setCadastrar();
	}

	public void t_03CadastrarContextoSemEnviarSom() {
		menupage.acessarTelaContexto();
		desafiosPage.setPalavra("");
		desafiosPage.setSom("");
		desafiosPage.setVideo("");
		desafiosPage.setCadastrar();
	}

	public void t_04EditarDesafioParaCamposEmBranco() {
		menupage.acessarTelaContexto();
		desafiosPage.setPalavra("");
		desafiosPage.setSom("");
		desafiosPage.setVideo("");
		desafiosPage.setCadastrar();
	}

	public void t_05CadastrarDesafiosSemPreencherCampos() {
		menupage.acessarTelaContexto();
		desafiosPage.setPalavra("");
		desafiosPage.setSom("");
		desafiosPage.setVideo("");
		desafiosPage.setCadastrar();
	}

}
