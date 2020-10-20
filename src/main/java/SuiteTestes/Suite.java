package SuiteTestes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import Testes.CadastroUsuarioTeste;
import Testes.LoginTeste;


@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
	LoginTeste.class,
	CadastroUsuarioTeste.class
	
})
 
public class Suite {
	
	
	

}
