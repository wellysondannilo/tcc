package Pages;

import org.openqa.selenium.By;

import Core.BasePage;

public class ContextoPage extends BasePage {
	
	public void acessarTelaInserirContexto()  {
		clicarBotao(By.xpath(".//button[@class='ant-btn button drawer-button ant-btn-primary']"));

}
	
	public void setPalavra(String Palavra) {
		escrever(By.xpath("//input[@id='name']"), Palavra);
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