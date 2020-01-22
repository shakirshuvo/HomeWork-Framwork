package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends CommonAPI {

    public void testamazon() throws InterruptedException {
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[2]"));
        action.moveToElement(element).build().perform();
        element.click();
        Thread.sleep(2000);

    }
    //this.driver.findElement(By.xpath("//*[@id='nav-signin-tooltip']/a/span']")).click();

//    public void logIn(String email, String password) {
//
//        this.driver.findElement(By.id("email")).sendKeys(email);
//        this.driver.findElement(By.id("pass")).sendKeys(password);
//        this.driver.findElement(By.cssSelector("input[value='Log In'}")).click();
//    }

}
