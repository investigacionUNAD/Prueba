package com.Archivo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArchivoTest20 {

	//Prue_0025

	private WebDriver driver;
	By userPerfil = By.xpath("//*[@id=\"formTab:j_idt41:j_idt43\"]/tbody/tr/td[2]/input");		
	By Click = By.xpath("//*[@id=\"formTab:j_idt41:j_idt54\"]/span");
	By Respuesta = By.xpath("//*[@id=\"form:basicDT_data\"]/tr/td[1]");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/perfilAdmin.xhtml");
		
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0025() throws InterruptedException {

		driver.findElement(userPerfil).sendKeys("1");
		driver.findElement(Click).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Respuesta).isDisplayed());


	}


}