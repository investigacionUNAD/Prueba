package Administracion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest62 {

	//Prue_0092

		private WebDriver driver;
		By userEstado = By.xpath("//*[@id=\"formView:j_idt41:TipoPeriodo_label\"]");	
		By userEstadod = By.xpath("//*[@id=\"formView:j_idt41:TipoPeriodo_panel\"]");
		By userEstadoc = By.xpath("//*[@id=\"formView:j_idt41:TipoPeriodo_1\"]");
		By Click = By.xpath("//*[@id=\"formView:j_idt41:j_idt81\"]/span");
		By Respuesta = By.xpath("//*[@id=\"form:basicDT_data\"]/tr/td[2]");

		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/indicador.xhtml");

		}
		@After
		public void tearDown() throws Exception {
			driver.quit();
		}

		@Test
		public void Prue_0092() throws InterruptedException {
			driver.findElement(userEstado).click();
			assertTrue(driver.findElement(userEstadod).isDisplayed());
			driver.findElement(userEstadoc).click();
			driver.findElement(Click).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Respuesta).isDisplayed());


		}


	}