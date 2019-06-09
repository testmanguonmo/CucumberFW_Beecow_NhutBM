package com.beecow;

import org.openqa.selenium.WebDriver;

import com.beecow.ui.CommonPageUI;

import commons.commonFunction;

public class CommonPage extends commonFunction {
	public CommonPage(WebDriver driver) {
		super(driver);
	}

	public String getDynamicText(String value) {
	
		waitVisibleDynamicElement(CommonPageUI.DYNAMIC_MSG, value);
		
		return getTextDynamicElement(CommonPageUI.DYNAMIC_MSG, value);

	}

	public boolean isDisplayed_Dynamic_2_Message(String value1, String value2) {
		
		waitVisibleDynamicElement(CommonPageUI.DYNAMIC_MSG, value1, value2);
		
		return isDisplayedDynamicElement(CommonPageUI.DYNAMIC_MSG, value1, value2);
	}
	
	public boolean isDisplayed_Dynamic_Message(String value)
	{
		waitVisibleDynamicElement(CommonPageUI.DYNAMIC_MSG, value);
		
		return isDisplayedDynamicElement(CommonPageUI.DYNAMIC_MSG, value);
	}
}
