package com.pruebaE;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_es {

	private WebDriver driver;
	By user = By.name("form:codigo");
	By clave = By.name("form:clave");
	By ingresar = By.name("form:j_idt8");
	By Paginados = By.xpath("//div[@id=\"j_idt9:j_idt10\"]");
	By paginauno = By.xpath("//script[@id=\"form:j_idt8_s\"]");
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8000/PublicaIndicadores-master/faces/login.xhtml");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void SingIn() throws InterruptedException {
		if(driver.findElement(user).isDisplayed()){
			driver.findElement(user).sendKeys("investigacio");
			driver.findElement(clave).sendKeys("utadeo1");
			driver.findElement(ingresar).click();
			Thread.sleep(2000);
			
		}
		else {
			System.out.println("No presente");
		}//termina else
		
		List <WebElement> tr = driver.findElements(By.tagName("td"));
		assertEquals("El usuario no existe en el aplicativo..",tr.get(5).getText());
				}//terminaMétodo
	
}//termina programa