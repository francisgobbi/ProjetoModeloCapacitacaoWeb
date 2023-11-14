package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

private WebDriver driver;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement getButtonNovoUsuario() {
    	return driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li/a[@href='/cadastro']"));
    }
    
    public WebElement getInputEmail() {
    	return driver.findElement(By.id("email"));
    }
    
    public WebElement getInputPassword() {
    	return driver.findElement(By.id("senha"));
    }
    
    public WebElement getInputNome() {
        return driver.findElement(By.id("nome"));
    }
    
    public WebElement getButtonCadastrar() {

        return driver.findElement(By.xpath("//input[@value='Cadastrar']"));
    }
    
    public WebElement getAlertLoginOK(String nome) {
    	return driver.findElement(By.xpath("//body/div[text()='Bem vindo, " + nome +"!']"));
    }
    
    public WebElement getAlertCadNewUserOK() {
    	return driver.findElement(By.xpath("//body/div[text()='Usuário inserido com sucesso']"));
    }
    
    public WebElement getLogoSeuBarriga() {
    	return driver.findElement(By.className("navbar-brand"));
    }
    
    public WebElement getAlertUserExisting() {
    	return driver.findElement(By.xpath("//body/div[text()='Endereço de email já utilizado']"));
    }
    
    public WebElement getAlertLoginUserInvalido() {
    	return driver.findElement(By.xpath("//body/div[text()='Problemas com o login do usuário']"));
    }
    
}
