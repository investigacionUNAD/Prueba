package com.Archivo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArchivoTest1 {

	//Prue_0007

	private WebDriver driver;
	By userLocator = By.name("form:codigo");
	By userPass = By.name("form:clave");
	By Enter = By.xpath("//span[@class=\"ui-button-text ui-c\"]");
	By Archivo = By.xpath("//*[@id=\"j_idt11:j_idt12\"]/ul/li[1]/a");
	By Registro = By.xpath("//*[@id=\"j_idt11:j_idt12\"]/ul/li[1]/ul/li[1]");
	By Aplicativo = By.xpath("//*[@id=\"j_idt11:j_idt12\"]");
	By Registrar = By.xpath("//*[@id=\"formView:j_idt41\"]/div[1]/ul");

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
}