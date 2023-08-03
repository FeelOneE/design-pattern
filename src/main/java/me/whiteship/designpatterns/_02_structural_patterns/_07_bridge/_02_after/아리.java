package me.whiteship.designpatterns._02_structural_patterns._07_bridge._02_after;

import me.whiteship.designpatterns._02_structural_patterns._07_bridge._01_before.Champion;

public class 아리 extends DefaultChampion{
	
	public 아리(Skin skin) {
		super(skin, "아리");
	}
	
	@Override
	public String getName() {
		
		return "아리";
	}

}
