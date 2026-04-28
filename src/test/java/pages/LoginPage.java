package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

By u=By.id("username");
By p=By.id("password");
By btn=By.className("decorativeSubmit");

public void login(String user,String pass){
type(u,user);
type(p,pass);
click(btn);
}
}