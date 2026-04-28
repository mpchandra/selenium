package pages;

import org.openqa.selenium.By;

public class LeadPage extends BasePage {

public void createLead(String c,String f,String l){
click(By.linkText("Leads"));
click(By.linkText("Create Lead"));
type(By.id("createLeadForm_companyName"),c);
type(By.id("createLeadForm_firstName"),f);
type(By.id("createLeadForm_lastName"),l);
click(By.name("submitButton"));
}
}