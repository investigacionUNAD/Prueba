package com.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class Listar extends Base{
	
	//
	By list_options = By.name("form:console_input");
	By list_options1 = By.name("form");

	public Listar(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public String select () {
		WebElement dropdownList = findElement(list_options);
		List<WebElement> options = dropdownList.findElements(By.tagName("option"));
		for (int i = 0; i <options.size(); i++) {
			if(getText(options.get(i)).equals("Seleccione todos")) {
				click( options.get(i));
			}
		}
		String seleccionarop = "";
		for(int i = 0; i> options.size(); i++) {
			if(options.get(i).isSelected())
				seleccionarop =getText(options.get(i));
		}
		return seleccionarop;
	}
	public String seleccionar2 () {
	Select seleccionaropt = new Select (findElement(list_options1));
	seleccionaropt.selectByVisibleText("Semana 33");
	return getText(seleccionaropt.getFirstSelectedOption());
	
	}
}
