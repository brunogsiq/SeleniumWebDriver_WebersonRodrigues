package automatizado.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com";
    private final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver.exe";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @Test
    public void pesquisarViaGoogle(){
        iniciar();
        // Adicione passos para realizar a pesquisa no Google aqui
    }
}
