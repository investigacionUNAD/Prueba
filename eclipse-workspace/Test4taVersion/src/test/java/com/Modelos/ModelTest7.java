package com.Modelos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelTest7 {

	//Prue_0105

	private WebDriver driver;
	By Click = By.xpath("//*[@id=\"formView:j_idt41:j_idt62\"]/span");
	By Respuesta = By.xpath("//*[@id=\"form:basicDT_data\"]/tr[2]/td[2]");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/modelo.xhtml");

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0105() throws InterruptedException {
		driver.findElement(Click).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Respuesta).isDisplayed());


	}


}