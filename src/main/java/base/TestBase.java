package base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;

	public TestBase() {
	
	prop = new Properties();
	try {
		FileInputStream file = new FileInputStream("C:\\Users\\ragha\\OneDrive\\Desktop\\Java_Workspace_2\\TeamDynamicBDD\\src\\main\\java\\property\\configue.properties");
		prop.load(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	public static void initialization() {
		System.setProperty(prop.getProperty("ChromeDriverKey"), prop.getProperty("ChromeDriverPath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get(prop.getProperty("url"));
		
	}
	public static void tearDown() {
		driver.close();
	}
	
}


