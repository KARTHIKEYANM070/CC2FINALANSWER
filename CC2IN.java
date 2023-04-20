package CC2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CC2IN 
{
private WebDriver driver;
@BeforeClass
public void setUp() {
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
}
@Test
public void testGoogleSearch() {
driver.manage().window().maximize();
driver.get("https://www.yatra.com");
driver.findElement(By.xpath("/html/body/div[2]/div/section/div[1]/div/div[1]/section/div/div/div/div[1]/div[1]/div[1]/ul[1]/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[2]/a")).click();
driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]")).click();
driver.findElement(By.xpath("//*[@id=\"22/04/2023\"]")).click();
driver.findElement(By.xpath("//*[@id=\"BE_flight_arrival_date\"]")).click();
driver.findElement(By.xpath("//*[@id=\"22/04/2023\"]")).click();
driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span")).click();
driver.findElement(By.xpath("//*[@id=\"BE_flight_passengerBox\"]/div[1]/div[1]/div/div/span[2]")).click();
driver.findElement(By.xpath("//*[@id=\"flight_class_select_child\"]/ul/li[2]/span")).click();
driver.findElement(By.xpath("/html/body/div[2]/div/section/div[1]/div/div[1]/section/div/div/div/div[1]/div[3]/div[2]/div[1]/input")).click();
String aText = driver.findElement(By.xpath("/html/body/h1")).getText();
String eText = "Access Denied";
Assert.assertEquals(aText, eText); 
}
}
