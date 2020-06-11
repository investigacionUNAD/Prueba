package com.prueba;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstudianteSemestre {

private WebDriver driver;
	
	By registerLinkLocator = By.linkText("Archivo");
	By registerPageLocator = By.xpath("//ul[@class='ui-menu-list ui-helper-reset']");
	By cambioLocator = By.name("formTab:j_idt35:inlineFeedback1");
	By confirmLocator = By.cssSelector("input[name='formTab:j_idt35:inlineFeedback2']");
	By Cambio = By.name("formTab:j_idt35:j_idt3");
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8000/PublicaIndicadores-master/faces/usuarioClave.xhtml");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void CambioClave() throws InterruptedException {
	driver.findElement(registerLinkLocator).click();
	Thread.sleep(2000);
	if(driver.findElement(registerPageLocator).isDisplayed()) {
		driver.findElement(cambioLocator).sendKeys("Esther");
		driver.findElement(confirmLocator).sendKeys("Esther");
		driver.findElement(Cambio).click();
		Thread.sleep(2000);
	}
	else {
		System.out.print("No hay cambio");
	}
	List<WebElement> td = driver.findElements(By.tagName("td"));
//	assertEquals("La clave nueva y la confirmacion, son diferentes. Intente de nuevo",td.get(5).getText());
	}

}
