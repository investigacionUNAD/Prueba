package com.Login;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest3 {

	//Prue_0003
	private WebDriver driver;
	By userLocator = By.name("form:codigo");
	By userPass = By.name("form:clave");
	By Enter = By.xpath("//span[@class=\"ui-button-text ui-c\"]");
	By Aplicativo = By.xpath("//*[@id=\"j_idt11:j_idt12\"]");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ela.unad.edu.co:8080/PublicaIndica/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Prue_0003() throws InterruptedException {
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("79465403");
			driver.findElement(userPass).sendKeys("P4$$w0rd2020");
			driver.findElement(Enter).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(Aplicativo).isDisplayed());
		}
		else
			System.out.println("Fallo de prueba");
	}

}

