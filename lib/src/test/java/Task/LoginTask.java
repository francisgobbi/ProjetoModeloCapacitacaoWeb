package Task;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneration;
import Framework.Utils.FilesOperations;
import PagesObjects.GenericPage;
import PagesObjects.LoginPage;
import Validation.LoginValidation;

public class LoginTask {

	private WebDriver driver;
	private LoginPage loginPage;
	private FakersGeneration faker;
	private LoginValidation loginValidation;
	private GenericPage genericPage;

	public LoginTask(WebDriver driver) {
		this.driver = driver;
		loginPage = new LoginPage(this.driver);
		faker = new FakersGeneration();
		loginValidation = new LoginValidation(this.driver);
		genericPage = new GenericPage(this.driver);
	}

	public void efetuarCadastro() {

		String nome = faker.getName();
		String email = faker.getEmail();
		String senha = faker.getSenha();
		FilesOperations.setProperties("form", "nome", nome);
		FilesOperations.setProperties("form", "email", email);
		FilesOperations.setProperties("form", "senha", senha);

		loginPage.getButtonNovoUsuario().click();
		genericPage.getInputNome().sendKeys(nome);
		loginPage.getInputEmail().sendKeys(email);
		loginPage.getInputPassword().sendKeys(senha);
		loginPage.getButtonCadastrar().click();
		loginValidation.validationAlertCadUserOK();
	}

	public void efetuarLogin() {
		String email = FilesOperations.getProperties("form").getProperty("email");
		String senha = FilesOperations.getProperties("form").getProperty("senha");
		String nome = FilesOperations.getProperties("form").getProperty("nome");
		loginPage.getInputEmail().sendKeys(email);
		loginPage.getInputPassword().sendKeys(senha);
		genericPage.getButtonSubmit().click();
		loginValidation.validationLoginOK(nome);
	}

	public void efetuarCadastroUserExistent() {

		String nome = FilesOperations.getProperties("login").getProperty("nome");
		String email = FilesOperations.getProperties("login").getProperty("email");
		String senha = FilesOperations.getProperties("login").getProperty("senha");
		loginPage.getButtonNovoUsuario().click();
		genericPage.getInputNome().sendKeys(nome);
		loginPage.getInputEmail().sendKeys(email);
		loginPage.getInputPassword().sendKeys(senha);
		loginPage.getButtonCadastrar().click();
		loginValidation.validationAlertUserExisting();
	}
	
	public void efetuarLoginUsuarioInvalido() {
		String email = FilesOperations.getProperties("login").getProperty("emailInvalid");
		String senha = FilesOperations.getProperties("login").getProperty("senhaInvalid");
		loginPage.getInputEmail().sendKeys(email);
		loginPage.getInputPassword().sendKeys(senha);
		genericPage.getButtonSubmit().click();
		loginValidation.validationAlertLoginUserInvalid();
	}

}
