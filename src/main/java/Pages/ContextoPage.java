package Pages;

import org.openqa.selenium.By;

import Core.BasePage;

public class ContextoPage extends BasePage {
	
	public void acessarTelaInserirContexto()  {
		clicarLink(By.xpath(".//div[@class='container context']"));

}
}