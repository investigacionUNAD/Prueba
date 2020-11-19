package com.Archivo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArchivoTest2Test {
	//Prue_0008

		private WebDriver driver;
		By userLocator = By.xpath("//*[@id=\"formView:j_idt41:j_idt43\"]/tbody/tr[1]/td[2]/input");		
		By Enter = By.xpath("//*[@id=\"formView:j_idt41:j_idt63\"]/span");
		By Aplicativo = By.xpath("//*[@id=\"form:singleDT_data\"]/tr/td[1]");
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
	public void Prue_0008() throws InterruptedException {
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("123456");
			driver.findElement(Enter).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Aplicativo).isDisplayed());
		}
		else
			System.out.println("Fallo de prueba");
	}


}
