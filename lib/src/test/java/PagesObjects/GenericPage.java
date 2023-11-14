package PagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericPage {

    private WebDriver driver;
    
    public GenericPage(WebDriver driver) {
        this.driver = driver;
    }
    
	
    public WebElement getAlertErrorMessage() {
    	return driver.findElement(By.className("alert-danger"));
    }
    
    public WebElement getAlertSuccessMessage() {
    	return driver.findElement(By.className("alert-success"));
    }
    
    public WebElement getButtonSubmit() {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }
    
    public WebElement getInputNome() {
        return driver.findElement(By.id("nome"));
    }
    
}
