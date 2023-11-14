package Framework.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static WebDriver driver;

    private static WebDriver getManagerDriver(TypeBrowser type) {

        switch (type) {
        case CHROME:
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--incognito");
			chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
            break;
        case FIREFOX:
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--start-maximized");
            firefoxOptions.addArguments("--incognito");
            driver = new FirefoxDriver();
            break;
        case EDGE:
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOption = new EdgeOptions();
            edgeOption.addArguments("--start-maximized");
            edgeOption.addArguments("--incognito");
            driver = new EdgeDriver(edgeOption);
            break;
        case HEADLESS:
            WebDriverManager.chromedriver().setup();
            ChromeOptions headlessOptions = new ChromeOptions();
            headlessOptions.addArguments("--headless");
            headlessOptions.addArguments("--window-size(1366,768)");
            driver = new ChromeDriver(headlessOptions);
            break;
        }

        return driver;
    }
    
    public static WebDriver getDriver(TypeBrowser type) {
        if (driver == null)
            driver = getManagerDriver(type);

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
