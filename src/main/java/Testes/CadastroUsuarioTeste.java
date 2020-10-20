package Testes;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import Core.BaseTest;
import Pages.CadastroPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroUsuarioTeste extends BaseTest  {
	

	private CadastroPage CadastroPage = new CadastroPage();

	
	@Test
	public void t_01CadastroSucesso() {
		CadastroPage.acessarTelaCadastro();
		CadastroPage.setNome("Wellyson");
		CadastroPage.setSobrenome("Dannilo");
		CadastroPage.setUsername("bRTT");
		CadastroPage.setEmail("dannilo@hotmail.com");
		CadastroPage.setSenha("dannilo123");
		CadastroPage.setCadastrar();
		
	}
	@Test
	public void t_02CadastroInvalido() {
		CadastroPage.acessarTelaCadastro();
		CadastroPage.setNome("Maria");
		CadastroPage.setSobrenome("");
		CadastroPage.setUsername("");
		CadastroPage.setEmail("maria@hotmail.com");
		CadastroPage.setSenha("maria123");
		CadastroPage.setCadastrar();
		
	}
	@Test
	public void t_03CadastroCamposVazio() {
		CadastroPage.acessarTelaCadastro();
		CadastroPage.setNome("");
		CadastroPage.setSobrenome("");
		CadastroPage.setUsername("");
		CadastroPage.setEmail("");
		CadastroPage.setSenha("");
		CadastroPage.setCadastrar();
		
	}
	@Test
	public void t_04CadastroExistente() {
		CadastroPage.acessarTelaCadastro();
		CadastroPage.setNome("Maria");
		CadastroPage.setSobrenome("Sousa");
		CadastroPage.setUsername("maria");
		CadastroPage.setEmail("maria@hotmail.com");
		CadastroPage.setSenha("maria123");
		CadastroPage.setCadastrar();
		
	}
	
}
