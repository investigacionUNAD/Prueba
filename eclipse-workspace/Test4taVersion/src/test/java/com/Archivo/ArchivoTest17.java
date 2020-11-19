package com.Archivo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArchivoTest17 {


	//Prue_0022

		private WebDriver driver;
		By userClave = By.xpath("//*[@id=\"formTab:j_idt41:inlineFeedback1\"]");		
		By userCambio = By.xpath("//*[@id=\"formTab:j_idt41:inlineFeedback2\"]");
		By Click = By.xpath("//*[@id=\"formTab:j_idt41:j_idt59\"]/span");
		By Respuesta = By.xpath("//*[@id=\"formTab:j_idt41:j_idt43\"]/tbody/tr[3]/td[2]");

		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/usuarioClave.xhtml");
			
		}
		@After
		public void tearDown() throws Exception {
			driver.quit();
		}

		@Test
		public void Prue_0022() throws InterruptedException {

			driver.findElement(userClave).sendKeys("1929");
			driver.findElement(userCambio).sendKeys("199");
			driver.findElement(Click).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Respuesta).isDisplayed());


		}


	}