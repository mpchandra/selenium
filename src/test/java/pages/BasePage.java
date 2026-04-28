package pages;

import core.DriverFactory;
import org.openqa.selenium.*;

public abstract class BasePage {
protected WebDriver driver=DriverFactory.get();

public void click(By loc){driver.findElement(loc).click();}

//overloading
public void click(By loc,String msg){
System.out.println(msg);
driver.findElement(loc).click();
}

public void type(By loc,String txt){
driver.findElement(loc).sendKeys(txt);
}
}