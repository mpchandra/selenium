// package core;

// import io.github.bonigarcia.wdm.WebDriverManager;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;

// public class DriverFactory {
// private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();

// public static void init(){
// WebDriverManager.chromedriver().setup();

// ChromeOptions options = new ChromeOptions();

//         // Headless settings for CI (GitHub Actions)
//         options.addArguments("--headless=new");
//         options.addArguments("--no-sandbox");
//         options.addArguments("--disable-dev-shm-usage");
//         options.addArguments("--disable-gpu");
// driver.set(new ChromeDriver());
// }

// public static WebDriver get(){return driver.get();}
// public static void quit(){driver.get().quit();}
// }


package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void init() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Detect if running in CI (GitHub Actions)
        String headless = System.getProperty("headless");

        if ("true".equalsIgnoreCase(headless)) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
        }

        // OPTIONAL: always maximize window
        options.addArguments("--window-size=1920,1080");

        // ✅ IMPORTANT: pass options here
        driver.set(new ChromeDriver(options));
    }

    public static WebDriver get() {
        return driver.get();
    }

    public static void quit() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}