import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd=new ChromeDriver();
      //  System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
      //  wd.get("https://demoqa.com/");
        wd.navigate().to("https://central.sonatype.com/");
       // wd.navigate().forward();

    }

    @Test
    public void testName(){

    }

    @AfterMethod
    public void postCondition(){
   // wd.close();
  //  wd.quit();
    }
}
