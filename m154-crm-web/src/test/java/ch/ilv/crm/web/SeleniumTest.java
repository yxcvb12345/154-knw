//package ch.ilv.web.test;
//
//import static org.junit.Assert.assertTrue;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//public class SeleniumTest {
//
//	public static void main(String[] args) throws InterruptedException {
//    
//	}
//
//	
//	@Test
//	public void productTest() {
//        System.setProperty("webdriver.chrome.driver", "C:/dev/chromedriver_win32/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        WebDriver driver=new ChromeDriver(options);
//
//        driver.get("http://www.google.com");
//        driver.manage().window().maximize();
//		driver.get("http://localhost:7072");
//		WebElement productPage;
//		productPage = driver.findElement(By.id("productPage"));
//		productPage.click();
//		WebElement productText;
//		productText = driver.findElement(By.id("productText"));
//		productText.sendKeys("testproduct");
//		WebElement submitProduct;
//		submitProduct = driver.findElement(By.id("submitProduct"));
//		submitProduct.click();
//		
//		WebElement infoSpan;
//		infoSpan = driver.findElement(By.id("infoSpan"));
//		
//		
//		assertTrue(infoSpan.getText().trim().contains("saved"));
//		String text = infoSpan.getText().trim();
//		String[] parts = text.split(" ");
//		String[] parts2 = parts[1].split(",");
//		String productID = parts2[0];
//		
//		WebElement searchProduct;
//		searchProduct = driver.findElement(By.id("searchProduct"));
//		searchProduct.sendKeys(productID);
//		WebElement searchButton;
//		searchButton = driver.findElement(By.id("searchButton"));
//		searchButton.click();
//		WebElement result;
//		result = driver.findElement(By.id("result"));
//		assertTrue(result.getText().trim().contains("testproduct"));
//		driver.close();
//	}
//
//
//}