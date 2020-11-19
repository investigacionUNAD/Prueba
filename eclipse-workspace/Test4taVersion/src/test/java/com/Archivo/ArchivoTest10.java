package com.Archivo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArchivoTest10 {

	//Prue_0014

		private WebDriver driver;
		By userLocator = By.xpath("//*[@id=\"formView:j_idt41:console_label\"]");		
		By Enter = By.xpath("//*[@id=\"formView:j_idt41:j_idt63\"]/span");
		By Aplicativo = By.xpath("//*[@id=\"formView:j_idt41:console_items\"]");
		By Click = By.xpath("//*[@id=\"formView:j_idt41:console_2\"]");
		By Respuesta = By.xpath("//*[@id=\"form:singleDT_data\"]/tr[1]/td[2]");

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
		public void Prue_0014() throws InterruptedException {
			
				driver.findElement(userLocator).click();
				assertTrue(driver.findElement(Aplicativo).isDisplayed());
				driver.findElement(Click).click();
				driver.findElement(Enter).click();
				Thread.sleep(2000);
				assertTrue(driver.findElement(Respuesta).isDisplayed());
			
		
		}

		
	}