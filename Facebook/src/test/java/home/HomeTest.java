package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends HomePage {

    @Test
    public void testAC() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //Home_Page home = new Home_Page();
        testamazon();

    }
}
