package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResumoPage {

	private WebDriver driver;

	public ResumoPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public WebElement getComboMes() {
		return driver.findElement(By.id("mes"));
	}
	
	public WebElement getComboAno() {
		return driver.findElement(By.id("ano"));
	}
	
	public WebElement getMesCadastroMovi() {
		return driver.findElement(By.xpath("//form/div/select[@id='mes']/option[@value='03']"));
	}
	
	public WebElement getAnoCadastroMovi() {
		return driver.findElement(By.xpath("//form/div/select[@id='ano']/option[@value='2023']"));
	}
	
	public WebElement getValidLineTableTrue() {
		return driver.findElement(By.xpath("//table[@id='tabelaExtrato']/tbody/tr"));
	}
	
	public WebElement getButtonBuscar() {
		return driver.findElement(By.xpath("//input[@value='Buscar']"));
	}
	
	 
}
