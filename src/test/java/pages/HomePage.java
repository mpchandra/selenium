package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

public void goToCRM(){
click(By.linkText("CRM/SFA"));
}
}