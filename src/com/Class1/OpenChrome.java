
public class OpenChrome {
	import org.openqa.selenium.webdriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");

	}

}
