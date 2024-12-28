package jenkins;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class Jenkins {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\labrxam\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1552, 832));
    }

    @Test
    public void testLogin() {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();

        driver.findElement(By.id("username")).click();
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("sgfdgdf");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.cssSelector(".subheader")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.cssSelector(".row:nth-child(1) label")).click();
        driver.findElement(By.id("username")).sendKeys("gdfgfdgfdg");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("gdzgd");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("vxvgffgjhgm");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("khjvkhuiuk");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("1234567890000");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("zdfz343");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("!@#$%%%");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("nvhgfhgfxhh");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("fgdfgfdhdhh");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("fgfdgdfgdg");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.cssSelector(".subheader")).click();
        driver.findElement(By.id("username")).sendKeys("Enter tomsmith");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("1234567890-098765432");
        driver.findElement(By.cssSelector(".radius")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".row:nth-child(2) > .large-6")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("zfddfdfdf");
        driver.findElement(By.cssSelector(".fa")).click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector(".subheader")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".fa")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
