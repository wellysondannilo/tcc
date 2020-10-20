package Pages;

import org.openqa.selenium.By;

import Core.BasePage;
import Core.DriverFactory;

public class CadastroPage extends BasePage {
	
	
	
	public void acessarTelaCadastro() { 
		DriverFactory.getDriver().get("http://localhost:3000/signup"); 
		} 
	
	
	public void setNome(String Nome) {
		escrever(By.xpath("//input[@id='firstName']"), Nome);
	}
	
	public void setSobrenome(String Sobrenome) {
		escrever(By.xpath("//input[@id='lastName']"), Sobrenome);
	}
	
	public void setUsername(String username) {
		escrever(By.xpath("//input[@id='username']"),username);
	}
	
	public void setEmail(String Email) {
		escrever(By.xpath("//input[@id='email']"),Email);
	}
	
	public void setSenha(String Senha) {
		escrever(By.xpath("//input[@id='password']"),Senha);
	}
	
	public void setCadastrar() {
		clicarBotao(By.xpath(".//button[@class='ant-btn form btnSignup ant-btn-primary']"));	
			
	} 
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[text()='Usuário já existente']"));
	

}

}