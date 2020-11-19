package Administracion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest43 {
	//Prue_0073

	private WebDriver driver;
	By user = By.xpath("//*[@id=\"formView:j_idt41:j_idt47\"]");
	By CodE= By.xpath("//*[@id=\"formView:j_idt41:j_idt51\"]");
	By Calen= By.xpath("//*[@id=\"formView:j_idt41:j_idt55\"]");
	By FecI= By.xpath("//*[@id=\"formView:j_idt41:j_idt73_input\"]");
	By FecF= By.xpath("//*[@id=\"formView:j_idt41:j_idt69_input\"]");
	By userUni = By.xpath("//*[@id=\"formView:j_idt41:listaUniversidad_label\"]");	
	By userUnid = By.xpath("//*[@id=\"formView:j_idt41:listaUniversidad_items\"]");
	By userUnic = By.xpath("//*[@id=\"formView:j_idt41:listaUniversidad_3\"]");
	By userUnif = By.xpath("//*[@id=\"formView:j_idt41:console_label\"]");	
	By userUnidf = By.xpath("//*[@id=\"formView:j_idt41:console_items\"]");
	By userUnicf = By.xpath("//*[@id=\"formView:j_idt41:console_2\"]");
	By Click = By.xpath("//*[@id=\"formView:j_idt41:j_idt75\"]/span");
	By Respuesta = By.xpath("//*[@id=\"formView:j_idt41:j_idt74\"]/tbody/tr/td[3]");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/calendario.xhtml");

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0073() throws InterruptedException {

		driver.findElement(user).sendKeys("Hola");
		driver.findElement(CodE).sendKeys("Hola");
		driver.findElement(Calen).sendKeys("Hola");
		driver.findElement(FecI).sendKeys("12-10-20");
		driver.findElement(FecF).sendKeys("12-10-20");
		driver.findElement(userUni).click();
		assertTrue(driver.findElement(userUnid).isDisplayed());
		driver.findElement(userUnic).click();
		driver.findElement(userUnif).click();
		assertTrue(driver.findElement(userUnidf).isDisplayed());
		driver.findElement(userUnicf).click();
		driver.findElement(Click).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Respuesta).isDisplayed());


	}


}

