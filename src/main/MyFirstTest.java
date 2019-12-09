import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class MyFirstTest {
    public static WebDriver driver;

    @Test
    public void Login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "bin/local/share/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/");
    }
}