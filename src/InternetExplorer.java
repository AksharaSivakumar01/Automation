import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static void launch() {
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.close();
		}
}
