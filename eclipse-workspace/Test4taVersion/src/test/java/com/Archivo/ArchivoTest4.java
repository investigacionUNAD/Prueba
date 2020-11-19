package com.Archivo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArchivoTest4 {

	//Prue_0010

	private WebDriver driver;
	By userLocator = By.xpath("//*[@id=\"formView:j_idt41:j_idt43\"]/tbody/tr[1]/td[4]/input");		
	By Enter = By.xpath("//*[@id=\"formView:j_idt41:j_idt63\"]/span");
	By Aplicativo = By.xpath("//*[@id=\"form:panelParametros\"]/tbody/tr[3]/td[2]/input");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/usuarioAdmin.xhtml");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0010() throws InterruptedException {
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("CARLOS ANDRES");
			driver.findElement(Enter).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Aplicativo).isDisplayed());
		}
		else
			System.out.println("Fallo de prueba");
	}


}
