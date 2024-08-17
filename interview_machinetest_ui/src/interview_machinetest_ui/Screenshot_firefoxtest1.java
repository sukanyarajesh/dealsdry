package interview_machinetest_ui;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot_firefoxtest1 {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gicko.driver","C:\\automation\\selenium\\geckodriver-v0.34.0-win64\\gickodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.getcalley.com/");
	driver.manage().window().maximize();
	Screenshot screen=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	ImageIO.write(screen.getImage(),"png",new File("C:\\automation\\screen shot\\image6.png"));

	}

}
