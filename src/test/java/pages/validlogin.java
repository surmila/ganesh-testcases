package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validlogin {
	 
	
		WebDriver driver;
		By signin=By.xpath("//*[@id=\"MenuContent\"]/a[2]");
		By register=By.linkText("Register Now!");
		By userid=By.name("username");
		By new_pwd=By.name("password");
		By repeat_pwd=By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input");
		By first_name=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input");
		By last_name=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input");
		By email=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input");
		By phone_no=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input");
		By address1=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input");
		By address2=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input");
		By city=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input");
		By state=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input");
		By Zipcode=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input");
		By country=By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input");
		By enable_list=By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input");
		By enable_banner=By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input");
		By save_info=By.xpath("//*[@id=\"Catalog\"]/form/input");
		public void url() 
			{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\Chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			System.out.println(driver.getTitle());
			}
			public void register()
			{
				driver.findElement(signin).click();
				driver.findElement(register).click();
				
				
			}
			public void enter_details()
			{
				driver.findElement(userid).sendKeys("ganeshnerella");
				driver.findElement(new_pwd).sendKeys("ganesh21");
				driver.findElement(repeat_pwd).sendKeys("ganesh21");
				driver.findElement(first_name).sendKeys("ganesh");
				driver.findElement(last_name).sendKeys("nerella");
				driver.findElement(email).sendKeys("ganeshnerella1998@gmail.com");
				driver.findElement(phone_no).sendKeys("09866895047");
				driver.findElement(address1).sendKeys("Sahasra mens PG,33, karapakkam, chennai");
				driver.findElement(address2).sendKeys("BLT");
				driver.findElement(city).sendKeys("chennai");
				driver.findElement(state).sendKeys("tamilnadu");
				driver.findElement(Zipcode).sendKeys("600096");
				driver.findElement(country).sendKeys("India");
				driver.findElement(enable_list).click();
				driver.findElement(enable_banner).click();
			}
			public void close_registration()
			{
				driver.findElement(save_info).click();
				driver.close();
			}
	}

