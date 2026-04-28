package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();

public static void init(){
WebDriverManager.chromedriver().setup();
driver.set(new ChromeDriver());
}

public static WebDriver get(){return driver.get();}
public static void quit(){driver.get().quit();}
}