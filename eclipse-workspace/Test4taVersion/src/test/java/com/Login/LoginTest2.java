package com.Login;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {
	//Prue_0002

	private WebDriver driver;
	By userLocator = By.name("form:codigo");
	By userPass = By.name("form:clave");
	By Enter = By.xpath("//span[@class=\"ui-button-text ui-c\"]");
	By aviso =By.xpath("//*[@id=\"form\"]/table/tbody/tr[3]/td[1]");

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
	public void Prue_0002() throws InterruptedException {
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("7946540");
			driver.findElement(userPass).sendKeys("P4$$w0rd202");
			driver.findElement(Enter).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(aviso).isDisplayed());
		}
		else
			System.out.println("Fallo de prueba");
	}

}