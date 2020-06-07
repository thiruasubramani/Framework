package com.clearcode.po;

import org.openqa.selenium.By;

public class MenuPanel {
	
	public static By users_menu = By.xpath("//DIV[@class='wp-menu-name'][text()='Users']");
	public static By addNewUser_menu = By.xpath("//A[@href='user-new.php'][text()='Add New']");
	public static By properties_menu = By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]");
	public static By features_menu = By.linkText("Features");
	public static By addNew_menu = By.linkText("Add New");
	
}
