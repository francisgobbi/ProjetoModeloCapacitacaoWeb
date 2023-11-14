package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getButtonHome() {
		return driver.findElement(By.xpath("//div[@id='navbar']/ul/li/a[text()='Home']"));
	}

	public WebElement getButtonContas() {
		return driver.findElement(By.className("dropdown-toggle"));
	}

	public WebElement getLinkAddContas() {
		return driver.findElement(By.xpath("//div[@id='navbar']/ul/li//a[@href='/addConta']"));
	}

	public WebElement getLinkListarContas() {
		return driver.findElement(By.xpath("//div[@id='navbar']/ul/li//a[@href='/contas']"));
	}

	public WebElement getButtonCriarMovimentacao() {
		return driver.findElement(By.xpath("//div[@id='navbar']/ul/li/a[@href='/movimentacao']"));
	}

	public WebElement getButtonResumoMensal() {
		return driver.findElement(By.xpath("//div[@id='navbar']/ul/li/a[@href='/extrato']"));
	}

	public WebElement getButtonLogout() {
		return driver.findElement(By.xpath("//div[@id='navbar']/ul/li/a[@href='/logout']"));
	}
	
    public WebElement getInputNomeConta() {
        return driver.findElement(By.id("nome"));
    }
    
    public WebElement getAlertContaAddOK() {
    	return driver.findElement(By.xpath("//body/div[text()='Conta adicionada com sucesso!']"));
    }
    
    public WebElement getTableListaContas() {
    	return driver.findElement(By.xpath("//table[@id='tabelaContas']/tbody/tr"));
    }

}
