package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addingproducts {
	WebDriver driver=new ChromeDriver(); 
	By fish=By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img");
	By angelfish=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By largeangelfish=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a");
	By addtocart1=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a");
	By returnmainmenu=By.xpath("//*[@id=\"BackLink\"]/a");
	By dogs=By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img");
	By goldenretriever=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a");
	By addtocart2=By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a");
	By updatecart=By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[4]/td[1]/input");
	By proceed=By.xpath("//*[@id=\"Cart\"]/a");
	public void url() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\Chrome driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	System.out.println(driver.getTitle());
	}
	public void search() {
		driver.findElement(fish).click();
		driver.findElement(angelfish).click();
		driver.findElement(largeangelfish).click();
		driver.findElement(addtocart1).click();
		driver.findElement(returnmainmenu).click();
		
	}
    public void search2() {
    	driver.findElement(dogs).click();
    	driver.findElement(goldenretriever).click();
    	driver.findElement(addtocart2).click();
    	
    	
    }
    
   public void update() {
	   driver.findElement(updatecart).click();
	   driver.findElement(proceed).click();
	   driver.close();
	   
   }
}
