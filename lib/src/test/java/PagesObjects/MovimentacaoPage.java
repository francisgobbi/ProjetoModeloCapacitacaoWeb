package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MovimentacaoPage {

private WebDriver driver;
    
    public MovimentacaoPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement getTipoMovimentacao() {
        return driver.findElement(By.id("tipo"));
    }
    
    public WebElement getTipoMovimentacaoReceita() {
        return driver.findElement(By.xpath("//option[@value='REC']"));
    }
    
    public WebElement getTipoMovimentacaoDespesa() {
        return driver.findElement(By.xpath("//option[@value='DESP']"));
    }
    
    public WebElement getDataMovimentacao() {
        return driver.findElement(By.id("data_transacao"));
    }
    
    public WebElement getDataPagamento() {
        return driver.findElement(By.id("data_pagamento"));
    }
    
    public WebElement getDescricao() {
        return driver.findElement(By.id("descricao"));
    }
    
    public WebElement getInteressado() {
        return driver.findElement(By.id("interessado"));
    }
    
    public WebElement getValor() {
        return driver.findElement(By.id("valor"));
    }
    
    public WebElement getComboConta() {
        return driver.findElement(By.id("conta"));
    }
    
    public WebElement getContaReceita() {
        return driver.findElement(By.xpath("//select[@id='conta']/option[text()='Receita']"));
    }
    
    public WebElement getContaDespesa() {
        return driver.findElement(By.xpath("//select[@id='conta']/option[text()='Despesa']"));
    }
    
    public WebElement getSituacaoPago() {
        return driver.findElement(By.id("status_pago"));
    }
    
    public WebElement getSituacaoPendente() {
        return driver.findElement(By.id("status_pendente"));
    }
    
    public WebElement getAlertMoviAdd() {
    	return driver.findElement(By.xpath("//body/div[text()='Movimentação adicionada com sucesso!']"));
    }


}