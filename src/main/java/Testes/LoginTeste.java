package Testes;

import org.junit.Assert;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import Pages.LoginPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTeste {

	private	LoginPage LoginPage = new LoginPage();
	 
	@Test
	public void t_01EfetuarLoginSucesso() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("Dannilo");
		LoginPage.setPassword("qwer123");
		LoginPage.setEntrar();
		
	}
	
	@Test
	public void t_02EfetuarLoginSemCadastroNoSistema() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("Dannilo100");
		LoginPage.setPassword("Dannilo1000");
		LoginPage.setEntrar();
		
	}
	 
	@Test
	//Ajeitar
	public void t_03EfetuarLoginUsernameValidoPasswordInvalido() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("Dannilo");
		LoginPage.setPassword("123456");
		LoginPage.setEntrar();
		
	}
	 
	
	@Test
	public void t_04EfetuarLoginInformandoApenasUsername() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("Dannilo");
		LoginPage.setPassword("");
		LoginPage.setEntrar();
		
	}
	 
	@Test
	public void t_05EfetuarLoginSInformandoApenasPassword() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("");
		LoginPage.setPassword("qwer123");
		LoginPage.setEntrar();
		
	}
	
	@Test
	public void t_06EfetuarLoginCamposUsernameePassowrdVazios() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("");
		LoginPage.setPassword("");
		LoginPage.setEntrar(); 
		
		
	}
	
	@Test
	public void t_07EfetuarLoginCampoUsernameCaracteresMaiusculos() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("DANNILO");
		LoginPage.setPassword("qwer123");
		LoginPage.setEntrar();
		
	}
	
	@Test
	public void t_09EfetuarLoginCampoSenhaCaracteresMaiusculos() {
		LoginPage.acessarTelaInicio();
		LoginPage.setUsername("Dannilo");
		LoginPage.setPassword("QWER123");
		LoginPage.setEntrar();
		
		}
}
