package Pages;

import org.openqa.selenium.By;

import Core.BasePage;

public class DesafiosPage extends BasePage {

	public void acessarTelaInserirDesafio() {
		clicarBotao(By.xpath(".//button[@class='ant-btn button drawer-button ant-btn-primary']"));

	}

	public void setPalavra(String Palavra) {
		escrever(By.xpath("//input[@id='word']"), Palavra);
	}

	public void setSelecionarContexto(String Contexto) {
		escrever(By.xpath("//div[@class='ant-select-selection__placeholder']"), Contexto);
	}

	
	public void setSom(String Som) {
		escrever(By.xpath("//input[@id='sound']"), Som);
	}

	public void setVideo(String Video) {
		escrever(By.xpath("//input[@id='video']"), Video);
	}

	public void setCadastrar() {
		clicarBotao(By.xpath("//button[@class='ant-btn ant-btn-primary']"));
	}

}
