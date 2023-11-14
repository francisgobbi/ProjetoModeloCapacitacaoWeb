package Validation;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import PagesObjects.ResumoPage;
import Framework.Report.Report;
import Framework.Report.Screenshot;

public class ResumoValidation {

	private WebDriver driver;
	private ResumoPage resumoPage;

	public ResumoValidation(WebDriver driver) {
		this.driver = driver;
		resumoPage = new ResumoPage(this.driver);
	}
	
	public void validationLineTableIsVisible() {
        try {        	
            Assert.assertTrue(resumoPage.getValidLineTableTrue().isDisplayed());
            Report.log(Status.PASS, "Tabela está Aparecendo OK.", Screenshot.captureBase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
	
}
