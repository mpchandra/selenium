package pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage {

public void createAccount(String name){
click(By.linkText("Accounts"));
click(By.linkText("Create Account"));
type(By.id("accountName"),name);
click(By.className("smallSubmit"));
}
}