package stepdefs;

import io.cucumber.java.en.*;
import pages.*;

public class Steps {

LoginPage login=new LoginPage();
HomePage home=new HomePage();
LeadPage lead=new LeadPage();
AccountPage acc=new AccountPage();

@Given("login")
public void login(){
login.login("democsr2","crmsfa");
home.goToCRM();
}

@When("create lead")
public void lead(){
lead.createLead("TestCo","John","Doe");
}

@When("create account")
public void account(){
acc.createAccount("DemoAccount");
}

@Then("verify")
public void verify(){}
}