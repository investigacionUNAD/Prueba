package Administracion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminTest23 {

	//Prue_0053

			private WebDriver driver;
			By userNom = By.xpath("//*[@id=\"formView:j_idt41:j_idt47\"]");		
			By Click = By.xpath("//*[@id=\"formView:j_idt41:j_idt57\"]/span");
			By Respuesta = By.xpath("//*[@id=\"form:basicDT_data\"]/tr/td[1]");

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
			public void Prue_0053() throws InterruptedException {

				driver.findElement(userNom).sendKeys("Curso Nombre - Codigo 0");
				driver.findElement(Click).click();
				Thread.sleep(2000);
				assertTrue(driver.findElement(Respuesta).isDisplayed());


			}


		}