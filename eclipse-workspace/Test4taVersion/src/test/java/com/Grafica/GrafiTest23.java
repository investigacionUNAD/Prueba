package com.Grafica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrafiTest23 {
	//Prue_0168

	private WebDriver driver;
	By userEstado = By.xpath("//*[@id=\"formTab:j_idt41:agno_02_label\"]");	
	By userEstadod = By.xpath("//*[@id=\"formTab:j_idt41:agno_02_1\"]");
	By userEstadoc = By.xpath("//*[@id=\"formTab:j_idt41:agno_02_2\"]");
	By Click = By.xpath("//*[@id=\"formTab:j_idt41:j_idt118\"]/span");
	By Respuesta = By.xpath("//*[@id=\"form:j_idt123_header\"]/span");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/indicadorSemestre.xhtml");

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0168() throws InterruptedException {
		driver.findElement(userEstado).click();
		assertTrue(driver.findElement(userEstadod).isDisplayed());
		driver.findElement(userEstadoc).click();
		driver.findElement(Click).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Respuesta).isDisplayed());


	}


}