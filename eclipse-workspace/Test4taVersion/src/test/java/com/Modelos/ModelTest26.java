package com.Modelos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelTest26 {


	//Prue_0124

	private WebDriver driver;
	By userPerfil = By.xpath("//*[@id=\"formView:j_idt41:j_idt56_input\"]");		
	By Click = By.xpath("//*[@id=\"formView:j_idt41:j_idt67\"]/span");
	By Respuesta = By.xpath("//*[@id=\"form:bas_data\"]/tr/td[1]");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/faces/modeloExe.xhtml");

	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0124() throws InterruptedException {

		driver.findElement(userPerfil).sendKeys("2020-05-21");
		driver.findElement(Click).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Respuesta).isDisplayed());


	}


}