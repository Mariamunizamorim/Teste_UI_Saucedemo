package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	public By name = By.id("user-name");
	public By password = By.id("password");
	public By btnLogin = By.id("login-button");
	
	public By msgBloq = By.xpath("//*[text()='Epic sadface: Sorry, this user has benn locked out.']");
	

}
