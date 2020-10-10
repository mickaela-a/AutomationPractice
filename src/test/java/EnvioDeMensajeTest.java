// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class EnvioDeMensajeTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void envioDeMensaje() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(1318, 1010));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector(".form_content > .form-group:nth-child(1)")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("pruebasqa.519@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("testerQA");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
        driver.findElement(By.linkText("Contact us")).click();
        driver.findElement(By.id("id_contact")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_contact"));
            dropdown.findElement(By.xpath("//option[. = 'Customer service']")).click();
        }
        driver.findElement(By.id("id_contact")).click();
        driver.findElement(By.id("message")).click();
        driver.findElement(By.id("message")).sendKeys("mensaje de prueba");
        driver.findElement(By.cssSelector("#submitMessage > span")).click();
        driver.findElement(By.cssSelector(".alert")).click();
        assertEquals(driver.findElement(By.cssSelector(".alert")).getText(), "Your message has been successfully sent to our team.");
        driver.findElement(By.linkText("Sign out")).click();
    }
}
