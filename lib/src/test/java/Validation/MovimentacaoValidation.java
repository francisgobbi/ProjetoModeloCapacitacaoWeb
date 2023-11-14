package Validation;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import PagesObjects.MovimentacaoPage;
import Framework.Report.Report;
import Framework.Report.Screenshot;

public class MovimentacaoValidation {

	private WebDriver driver;
	private MovimentacaoPage moviPage;

	public MovimentacaoValidation(WebDriver driver) {
		this.driver = driver;
		moviPage = new MovimentacaoPage(this.driver);
	}
	
	
	
	public void validationAlertSuccess(String message) {
        try {        	
            Assert.assertEquals(message, moviPage.getAlertMoviAdd().getText());
            Report.log(Status.PASS, "Cadastro efetuado com Sucesso.", Screenshot.captureBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
