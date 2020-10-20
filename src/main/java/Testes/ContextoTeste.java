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
		
	}
}
