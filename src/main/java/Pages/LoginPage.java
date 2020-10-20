package Pages;

import org.openqa.selenium.By;

import Core.BasePage;
import Core.DriverFactory;

public class LoginPage extends BasePage {
	
	
	public void acessarTelaInicio() { 
		DriverFactory.getDriver().get("http://localhost:3000/login"); 
		} 
	
	
	public void setUsername(String username) {
		escrever(By.xpath("//input[@id='username']"),username);
	}
	 
	public void setPassword(String password) {
		escrever(By.xpath("//input[@id='password']"), password);
	}
	
	public void setEntrar() {
		clicarBotao(By.xpath(".//button[@class='ant-btn loginBtn ant-btn-primary']"));	
			
	} 
	
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[text()='Credenciais do inválidas']"));

	} 
	 
	public String obterMensagemErroPasswordVazio() {
		return obterTexto(By.xpath("//*[@id=\"root\"]/div/form/div[3]/div/div/div/div"));
	
	}
		public String obterMensagemErroEmailVazio() {
			return obterTexto(By.xpath("//div[text()='Por favor, insira o email!']"));
}
	
}
