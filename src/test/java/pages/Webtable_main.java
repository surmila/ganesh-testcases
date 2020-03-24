package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_main {
	WebDriver driver=new ChromeDriver();
	By animal=By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img");
	
	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		System.out.println(driver.getTitle());
	

		}
		public void jpet_print()
		{
			driver.findElement(animal).click();
			String x;
			for(int r=2;r<=5;r++)
			{
				for(int c=1;c<=2;c++)
				{
					x="//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]"; //*[@id="Catalog"]/table/tbody/tr[2]/td[1]/a
					String s=driver.findElement(By.xpath(x)).getText();
					System.out.print(s+"  ");
				}
			System.out.println(" ");	
			}
			
		}

		public void verify() 
		{
			System.out.println(" details of the selected animal");
		}

		public void submit() 
		{
		
		driver.close();
		}

}
