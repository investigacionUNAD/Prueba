package com.prueba;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Login {
	private WebDriver driver;
	By user = By.name("form:codigo");
	By clave = By.name("form:clave");
	By ingresar = By.name("form:j_idt8");
	By Paginados = By.xpath("//div[@id=\"j_idt9:j_idt10\"]");
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
			driver.findElement(user).sendKeys("investigacion");
			driver.findElement(clave).sendKeys("utadeo1");
			driver.findElement(ingresar).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Paginados).isDisplayed());
		}
		else {
			System.out.println("No presente");
		}//termina else
		
	}//terminaMétodo
	
}//termina programa
