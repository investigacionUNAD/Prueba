package Administracion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest28 {
	//Prue_0058

	private WebDriver driver;
	By userEst = By.xpath("//*[@id=\"formView:j_idt41:console_label\"]");		
	By userEstd = By.xpath("//*[@id=\"formView:j_idt41:console_items\"]");		
	By userEstc = By.xpath("//*[@id=\"formView:j_idt41:console_2\"]");	
	By Click = By.xpath("//*[@id=\"formView:j_idt41:j_idt57\"]/span");
	By Respuesta = By.xpath("//*[@id=\"form:basicDT_data\"]/tr/td");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/curso.xhtml");

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0058() throws InterruptedException {


		driver.findElement(userEst).click();
		assertTrue(driver.findElement(userEstd).isDisplayed());
		driver.findElement(userEstc).click();
		driver.findElement(Click).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Respuesta).isDisplayed());


	}


}
