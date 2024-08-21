package interview_machinetest_functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_uploading {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\automation\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.dealsdray.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
        driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[3]/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/button/div[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/button")).click();
        
	}

}