package org.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.vaild.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement textusername;

	@FindBy(id = "pass")
	private WebElement textpassword;

	@FindBy(name = "login")
	private WebElement btnlogin;

	public WebElement getsearch() {
		return textusername;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

}
