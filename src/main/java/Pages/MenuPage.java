package Pages;

import org.openqa.selenium.By;

import Core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaContexto()  {
		clicarBotao(By.xpath("//*[@id=\"root\"]/div/div/div/section/section/main/div/div/button"));	

	}

	public void acessarTelaDesafios()  {
		clicarLink(By.xpath(".//a[contains(text(), 'Desafios')]"));
	

	}
	
}