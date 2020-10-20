package Core;

import static Core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BasePage { 

protected Object driver; 
	
	public void escrever(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}
 
	public void escrever(String id_campo, String texto){
		escrever(By.id(id_campo), texto);
	}
	
	public void selecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarBotaoCss(By by) {
		getDriver().findElement(by.cssSelector("")).click();
	}

	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}
	public void clicarLink(By by) {
		getDriver().findElement(By.xpath("")).click();
	}
	
	public static String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	  

	 
}
	
	
