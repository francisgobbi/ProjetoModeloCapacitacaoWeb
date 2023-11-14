package Task;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FilesOperations;
import PagesObjects.GenericPage;
import PagesObjects.HomePage;
import PagesObjects.MovimentacaoPage;
import Validation.MovimentacaoValidation;

public class MovimentacaoTask {

    private WebDriver driver;
    private HomePage homePage;
    private GenericPage genericPage;
    private MovimentacaoPage moviPage;
    private MovimentacaoValidation moviValidation;
    private static String dataMovimentacaoDespesa;
    private static String dataPagamentoDespesa;
    private static String descricaoDespesa;
    private static String interessado;
    private static String valorDespesa;
    private static String dataMovimentacaoReceita;
    private static String dataPagamentoReceita;
    private static String descricaoReceita;
    private static String valorReceita;
    private static String alertMessage;

    public MovimentacaoTask(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(this.driver);
        genericPage = new GenericPage(this.driver);
        moviPage = new MovimentacaoPage(this.driver);
        moviValidation = new MovimentacaoValidation(this.driver);
        alertMessage = FilesOperations.getProperties("movimentacao").getProperty("alertValid");
    }
    
    public void criarMovimentacaoReceita() {
    	criaReceita();
    	homePage.getButtonCriarMovimentacao().click();
        moviPage.getTipoMovimentacao().click();
        moviPage.getTipoMovimentacaoReceita().click();
        moviPage.getDataMovimentacao().sendKeys(dataMovimentacaoReceita);
        moviPage.getDataPagamento().sendKeys(dataPagamentoReceita);
        moviPage.getDescricao().sendKeys(descricaoReceita);
        moviPage.getInteressado().sendKeys(interessado);
        moviPage.getValor().sendKeys(valorReceita);
        moviPage.getComboConta().click();
        moviPage.getContaReceita().click();
        moviPage.getSituacaoPago().click();
        genericPage.getButtonSubmit().click();
        moviValidation.validationAlertSuccess(alertMessage);
    }
    
    public void criarMovimentacaoDespesa() {
    	criaDespesa();
    	homePage.getButtonCriarMovimentacao().click();
        moviPage.getTipoMovimentacao().click();
        moviPage.getTipoMovimentacaoDespesa().click();
        moviPage.getDataMovimentacao().sendKeys(dataMovimentacaoDespesa);
        moviPage.getDataPagamento().sendKeys(dataPagamentoDespesa);
        moviPage.getDescricao().sendKeys(descricaoDespesa);
        moviPage.getInteressado().sendKeys(interessado);
        moviPage.getValor().sendKeys(valorDespesa);
        moviPage.getComboConta().click();
        moviPage.getContaDespesa().click();
        moviPage.getSituacaoPago().click();
        genericPage.getButtonSubmit().click();
        moviValidation.validationAlertSuccess(alertMessage);
    }
    
    private void criaReceita() {
    	dataMovimentacaoReceita = FilesOperations.getProperties("movimentacao").getProperty("dataMovimentacaoReceita");
    	dataPagamentoReceita = FilesOperations.getProperties("movimentacao").getProperty("dataPagamentoReceita");
    	descricaoReceita = FilesOperations.getProperties("movimentacao").getProperty("descricaoReceita");
    	interessado = FilesOperations.getProperties("movimentacao").getProperty("interessado");
        valorReceita = FilesOperations.getProperties("movimentacao").getProperty("valorReceita");
    }
    
    private void criaDespesa() {
    	dataMovimentacaoDespesa = FilesOperations.getProperties("movimentacao").getProperty("dataMovimentacaoDespesa");
    	dataPagamentoDespesa = FilesOperations.getProperties("movimentacao").getProperty("dataPagamentoDespesa");
    	descricaoDespesa = FilesOperations.getProperties("movimentacao").getProperty("descricaoDespesa");
    	interessado = FilesOperations.getProperties("movimentacao").getProperty("interessado");
        valorDespesa = FilesOperations.getProperties("movimentacao").getProperty("valorDespesa");
    }
}
