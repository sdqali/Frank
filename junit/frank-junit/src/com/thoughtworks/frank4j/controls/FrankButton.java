package com.thoughtworks.frank4j.controls;

import com.thoughtworks.frank4j.FrankControl;

public class FrankButton implements FrankControl {
	private String text;
	
	public FrankButton(String buttonText){
		text = buttonText;
	}
	
	@Override
	public String existsMethod() {
		return "accessibilityLabel";
		
	}

	@Override
	public String controlQuery() {
		return "button marked:" + text;
	}

}
