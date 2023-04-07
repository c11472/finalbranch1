import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ntc101 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	  WebDriver wd = new FirefoxDriver();
	  //Thread.sleep(4000);
	  wd.get("https://demo.opencart.com/");
	  //Thread.sleep(4000);
	  
	 String s= wd.getTitle();
	 
	 System.out.println("Gayatri : The title of the page is : "+ s);
	 
	 wd.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span")).click();
	 
	 System.out.println("Hello Maven Test in Jenkins");
	 // Thread.sleep(4000);
	 // wd.close();*/
	  System.out.println("Hello world we are goind to build this project");
  }
}
