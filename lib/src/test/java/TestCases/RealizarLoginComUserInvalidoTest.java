package TestCases;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Task.LoginTask;


public class RealizarLoginComUserInvalidoTest extends TestBase {

	private WebDriver driver = getDriverManager();
	LoginTask loginTask = new LoginTask(driver);
	
	@Test
	public void realizarCadastroUsuarioExistente() {
		try {
			Report.createTest("Realizar login de usuario inválido", ReportType.SINGLE);
			Report.createStep("Realizar login Usuário");
			loginTask.efetuarLoginUsuarioInvalido();
		} catch (Exception e) {
			// TODO: handle exception
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}
}
