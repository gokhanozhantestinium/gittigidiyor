import org.junit.Test;

public class gittigidiyor {
    public class Gittigidiyor{
        WebDriver driver;
        @Test
        public void gittigidiyorTest() {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.gittigidiyor.com/");
            driver.manage().window().maximize();

            driver.findElement(By.className("panel-container robot-header-loginPanel hidden")).click();
            driver.findElement(By.id("search_word")).clear();
            WebElement img = (WebElement) driver.findElements(By.tagName("lazyload-img"));
            img.click();
            driver.quit();
        }

    }

}
