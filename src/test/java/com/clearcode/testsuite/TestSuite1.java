package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.AddNewUser;
import com.clearcode.po.MenuPanel;
import com.clearcode.po.AddNewProperty;
import com.clearcode.po.LoginPage;



import dataProvider.TestData;


	
	public class TestSuite1 extends TestSetup{

		@Test(dataProvider="AdminLogin",dataProviderClass=TestData.class)
		public void adminLogin(String username, String password) throws InterruptedException {
			wdu.type(LoginPage.username_ip, username);
			wdu.type(LoginPage.pwd_ip, password);
			wdu.click(LoginPage.Signin_btn);
		}
		
		@Test(priority=2, dataProvider="AddNewProperty", dataProviderClass=TestData.class)
		public void addNewProperty(String name,String Slug, String ParentFeature , String Description, String Title, String Textbox) throws InterruptedException {
			wdu.mouseOver(MenuPanel.properties_menu);
			wdu.click(MenuPanel.features_menu);
			wdu.type(AddNewProperty.name_ip, name); 
			wdu.type(AddNewProperty.slug_ip, Slug);
		//	wdu.type(AddNewProperty.parent_drpBx, ParentFeature);
			wdu.type(AddNewProperty.description_ip,Description);
			wdu.click(AddNewProperty.addFeature_btn);
			wdu.mouseOver(MenuPanel.properties_menu);
			wdu.click(MenuPanel.addNew_menu);
			wdu.type(AddNewProperty.title_ip, Title);
			wdu.type(AddNewProperty.textBox_ip, Textbox);
			wdu.click(AddNewProperty.feature_chkBx);
			wdu.click(AddNewProperty.publish_btn);
		}
			
		@Test(priority=1, dataProvider="AddNewUser",dataProviderClass=TestData.class)
		public void addNewUser(String user,String email,String fname, String lname, String url, String pwd, String role) throws InterruptedException {
			wdu.mouseOver(MenuPanel.users_menu);
			wdu.click(MenuPanel.addNewUser_menu);
			wdu.type(AddNewUser.username_ip, user);
			wdu.type(AddNewUser.email_ip, email);
			wdu.type(AddNewUser.firstName_ip, fname);
			wdu.type(AddNewUser.lastName_ip, lname);
			wdu.type(AddNewUser.website_ip, url);
			wdu.click(AddNewUser.showPass_btn);
			wdu.type(AddNewUser.password_ip, pwd);
			wdu.click(AddNewUser.confirmPass_chkBx);
			wdu.selectByVisibleText(AddNewUser.select_role, role);
			wdu.click(AddNewUser.addNewUser_btn);
		
		
		}

		
	}
		
		
	
	
	

