package com.Archivo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArchivoTest13 {
	//Prue_0018

	private WebDriver driver;
	By userCodigo = By.xpath("//*[@id=\"formView:j_idt41:j_idt43\"]/tbody/tr[1]/td[2]/input");	
	By userNombre = By.xpath("//*[@id=\"formView:j_idt41:j_idt43\"]/tbody/tr[1]/td[4]/input");	
	By userPer=By.xpath("//*[@id=\"formView:j_idt41:perfil_label\"]");
	By userPerd=By.xpath("//*[@id=\"formView:j_idt41:perfil_panel\"]/div");
	By userperC=By.xpath("//*[@id=\"formView:j_idt41:perfil_1\"]");
	By userEsta=By.xpath("//*[@id=\"formView:j_idt41:console_label\"]");
	By userEstad=By.xpath("//*[@id=\"formView:j_idt41:console_items\"]");
	By userEstadc=By.xpath("//*[@id=\"formView:j_idt41:console_1\"]");
	By Enter = By.xpath("//*[@id=\"formView:j_idt41:j_idt64\"]/span");
	By Aplicativo = By.xpath("//*[@id=\"formView:j_t41:j_idt62\"]/tbody/tr/td[3]");
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
	public void Prue_0018() throws InterruptedException {
		
		driver.findElement(userCodigo).sendKeys("1111111");
		driver.findElement(userNombre).sendKeys("1111");
		driver.findElement(userPer).click();
		assertTrue(driver.findElement(userPerd).isDisplayed());
		driver.findElement(userperC).click();
		driver.findElement(userEsta).click();
		assertTrue(driver.findElement(userEstad).isDisplayed());
		driver.findElement(userEstadc).click();
		driver.findElement(Enter).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(Aplicativo).isDisplayed());
	}
}
