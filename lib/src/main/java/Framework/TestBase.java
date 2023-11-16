package Framework;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import Framework.Browser.DriverManager;
import Framework.Browser.TypeBrowser;
import Framework.Utils.FilesOperations;
import Framework.Report.Report;

public class TestBase extends DriverManager{

private static WebDriver driver;
    
    private static String URL = FilesOperations.getProperties("url").getProperty("index");
    
    public static WebDriver getDriverManager() {
    	driver = getDriver(TypeBrowser.CHROME);

    	return driver;
    	
    }
    

    
    @BeforeEach
    public void setup() {

        getDriverManager().get(URL);
    }
    
    @AfterEach
    public void finish() {
        Report.close();
        quitDriver();
    }
}
