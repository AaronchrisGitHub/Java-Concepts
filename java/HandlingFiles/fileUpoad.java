package HandlingFiles;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class fileUpoad {

	public static void main(String[] args) throws InterruptedException {

		try {

			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.adobe.com/acrobat/online/pdf-to-word.html");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"fileInput\"]"))
					.sendKeys("C:\\Users\\aaron\\Downloads\\Aaron_CV.pdf");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button//*[local-name()='svg']")).click();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {

			System.out.println("pdf converted to word---> successfull");
		}

	}
}
