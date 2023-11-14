package TestCases;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Task.HomeTask;
import Task.LoginTask;
import Task.MovimentacaoTask;
import Task.ResumoTask;

public class RealizarCadastroNovoUsuarioComSucessoTest extends TestBase {

	private WebDriver driver = getDriverManager();

	Waits wait = new Waits(driver);
	LoginTask loginTask = new LoginTask(driver);
	HomeTask homeTask = new HomeTask(driver);
	MovimentacaoTask moviTask = new MovimentacaoTask(driver);
	ResumoTask resumoTask = new ResumoTask(driver);

	@Test
	public void realizarCadastroNovoUsuario() {
		try {
			Report.createTest("Realizar cadastro user e validação de movimentação", ReportType.GROUP);
			Report.createStep("Realizar Cadastro novo Usuário");
			loginTask.efetuarCadastro();
			Report.createStep("Realizar Login");     
			loginTask.efetuarLogin();
			Report.createStep("Realizar Cadastro de contas Receita/Despesa");
			homeTask.adicionarContas("Receita");
			homeTask.adicionarContas("Despesa");
			homeTask.verificaListaConta();
			Report.createStep("Realizar Cadastro movimentacao Receita/Despesa");
			moviTask.criarMovimentacaoReceita();
			moviTask.criarMovimentacaoDespesa();
			Report.createStep("Realizar Consulta Validação Resumo Mensal");  
			resumoTask.pesquisaResumoMensal();
			
			//wait.esperar();
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));

		}
	}
}
