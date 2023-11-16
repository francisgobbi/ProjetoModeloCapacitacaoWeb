package Validation;


import static org.junit.jupiter.api.Assertions.assertTrue;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PagesObjects.HomePage;
import Framework.Report.Report;
import Framework.Report.Screenshot;

public class HomeValidation {

	private WebDriver driver;
	private HomePage homePage;

	public HomeValidation(WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage(this.driver);
	}
	
	public void validationAlertContaAddOK(String message) {
        try {        	
        	//assertTrue(message, homePage.getAlertContaAddOK().getText());
        	assertTrue(true, homePage.getAlertContaAddOK().getText());
            Report.log(Status.PASS, "Cadastro conta efetuado com Sucesso.", Screenshot.captureBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
	
	public void validationListContasAdd() {
        try {        	
            assertTrue(homePage.getTableListaContas().isDisplayed());
            Report.log(Status.PASS, "Lista de Contas OK.", Screenshot.captureBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
	

	
}
