package Task;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.ResumoPage;
import Validation.LoginValidation;
import Validation.ResumoValidation;

public class ResumoTask {

	private WebDriver driver;
	private ResumoPage resumoPage;
	private HomePage homePage;
	private Waits wait;
	private ResumoValidation resumoValidation;
	private LoginValidation loginValidation;
	private LoginPage loginPage;
	
	public ResumoTask(WebDriver driver) {
		this.driver = driver;
		resumoPage = new ResumoPage(this.driver);
		homePage = new HomePage(this.driver);
		wait = new Waits(this.driver);
		resumoValidation = new ResumoValidation(this.driver);
		loginValidation = new LoginValidation(this.driver);
		loginPage = new LoginPage(this.driver);
	}
	
	public void pesquisaResumoMensal() {
		homePage.getButtonResumoMensal().click();
		resumoPage.getComboMes().click();
		resumoPage.getMesCadastroMovi().click();
		resumoPage.getComboAno().click();
		resumoPage.getAnoCadastroMovi().click();
		resumoPage.getButtonBuscar().click();
		wait.loadElement(resumoPage.getValidLineTableTrue());
		resumoValidation.validationLineTableIsVisible();
		homePage.getButtonLogout().click();
		wait.loadElement(loginPage.getLogoSeuBarriga());
		loginValidation.validationLogoSeuBarriga();
	}
	
}
