package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakir\\Desktop\\sjframework\\Generic\\src\\main\\java\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    public void clickOnElement(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch(Exception ex){
            try{
                driver.findElement(By.className(locator)).click();
            }catch(Exception ex2){
                try{
                    driver.findElement(By.id(locator)).click();
                }catch(Exception ex3){
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }
    }
    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch(Exception ex){
            driver.findElement(By.id(locator)).sendKeys(value);
        }
    }
    @AfterMethod
    public void cleanUp(){

        driver.close();
    }

//    public static WebDriver driver = null;
//
//    @BeforeMethod
//    private void setUp() {
//        // Setting up the Chrome browser.
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shakir\\Desktop\\sjframework\\Generic\\src\\main\\java\\driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().fullscreen();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//
//    @AfterMethod
//    public void cleanUp() {
//        driver.close();
//
//    }
}
