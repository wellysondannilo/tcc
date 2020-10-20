package Core;

import static Core.DriverFactory.killDriver;

import static Core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Pages.LoginPage;



public class BaseTest {
	 
	@Rule
	public TestName testName = new TestName();
		LoginPage LoginPage = new LoginPage(); 
		@Before
		public void acessarTelaInicio() { 
		 	 
		DriverFactory.getDriver().get("http://localhost:3000/login" ); 
			
	
		}	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}

