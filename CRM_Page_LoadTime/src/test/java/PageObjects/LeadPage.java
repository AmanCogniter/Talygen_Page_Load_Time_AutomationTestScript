package PageObjects;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.PropertiesLoader;
import utils.StopWatch;
import utils.WebBasePage;

public class LeadPage extends WebBasePage{
	WebDriver driver;
	static String email;
	String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\testfiles\\";
	private final static String FILE_NAME = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\testdata.properties";
	private static Properties prop = new PropertiesLoader(FILE_NAME).load();
	public LeadPage(WebDriver driver) {

		super(driver, "LeadPage");
		this.driver = driver;
	}

	public void clickFullMenuDropDown() {
		staticWait(3000);
			
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,50);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//div/h5/span[contains(text(),'Quick Links')]")));
		 */
		click(By.xpath("//div/a/span[text()='COMPANY SETUP']"), " Home Page COMPANY SETUP", 30);/* Before clicking on Full Menu, i am first clicking on Home Page Company Setup, Because If Directly clicked on Full Menu ,It's xpath Is not working */
		staticWait(2000);
		click(By.xpath("//span[text()='Full Menu']"), "Full Menu", 30);
		//click(By.id("navbarDropdownPortfolio"), "Full Menu", 30);
		

	}

	public void clickOnCRM() {
		//staticWait(3000);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/ul/li[@data-name='CRM']/a/span")));
		click(By.xpath("//div/ul/li[@data-name='CRM']/a/span"), "CRM", 30);
		
	}
	public void clickOnLead() {
		staticWait(3000);
		click(By.xpath("//div/ul/li/a[text()='Lead']"), "Lead", 30);
		
		 try {
			 staticWait(2000);
    		 WebElement lead = driver.findElement(By.xpath("//div/span[contains(text(),'Leads')]"));
    		 if (lead.isDisplayed()) {
				logger.info("Lead Page opened succesfully");
				/*
				 * long start = System.currentTimeMillis();
				 * 
				 * driver.get("https://crm.talygen.com/CRM/Index?reqFrom=4");
				 * 
				 * long finish = System.currentTimeMillis(); long totalTime = finish - start;
				 * System.out.println("Total Time for page load - "+totalTime+ " milliseconds");
				 */
				
				  StopWatch pageLoad = new StopWatch(); pageLoad.start();
				  
				  driver.get("https://crm.talygen.com/CRM/Index?reqFrom=4"); 
				  // Wait for the required any element 
				  WebDriverWait wait = new WebDriverWait(driver, 10);
				  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				  "//div/span[contains(text(),'Leads')]")));
				  
				  pageLoad.stop(); //Get the time 
				  float pageLoadTime_ms = pageLoad.getElapsedTime(); 
				  float pageLoadTime_Seconds = pageLoadTime_ms/1000;
				  System.out.println("Total Page Load Time: " + pageLoadTime_ms +
				  " milliseconds"); System.out.println("Total Page Load Time: " +
				  pageLoadTime_Seconds + " seconds");
				 
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Lead Page not opened succesfully");
		}
    	
     }
	public void clickOnEntriesNumber() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/ul/li/a[text()='Lead']")));
		click(By.xpath("//div/ul/li/a[text()='Lead']"), "Lead", 30);
		//staticWait(2000);
		//selectValueWithText(By.xpath("//span/select[@id='pageSize']"), "100", "Entries", 30);
		try {
			 staticWait(2000);
   		 WebElement lead = driver.findElement(By.xpath("//div/span[contains(text(),'Leads')]"));
   		 if (lead.isDisplayed()) {
				logger.info("Lead Page opened succesfully");
				/*
				 * long start = System.currentTimeMillis();
				 * 
				 * driver.get("https://crm.talygen.com/CRM/Index?reqFrom=4");
				 * 
				 * long finish = System.currentTimeMillis(); long totalTime = finish - start;
				 * System.out.println("Total Time for page load - "+totalTime+ " milliseconds");
				 */
				
				  StopWatch pageLoad = new StopWatch(); 
				  pageLoad.start();
				  
				  driver.get("https://crm.talygen.com/CRM/Index?reqFrom=4");
				  selectValueWithText(By.xpath("//span/select[@id='pageSize']"), "100", "Entries", 30);
				  // Wait for the required any element 
				  WebDriverWait wait1 = new WebDriverWait(driver, 10);
				  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				  "//div/span[contains(text(),'Leads')]")));
				  
				  pageLoad.stop(); //Get the time 
				  float pageLoadTime_ms = pageLoad.getElapsedTime(); 
				  float pageLoadTime_Seconds = pageLoadTime_ms/1000;
				  System.out.println("Total Page Load Time: " + pageLoadTime_ms +
				  " milliseconds"); System.out.println("Total Page Load Time: " +
				  pageLoadTime_Seconds + " seconds");
				 
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Lead Page not opened succesfully");
		}
	}
	public void clickOnEmail() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/h5/a/span[text()='Email']")));
		click(By.xpath("//div/h5/a/span[text()='Email']"), " Expand Email text field", 30);
	}
	public void enterEmail() {
		staticWait(3000);
	    email = prop.getProperty("leadEmail");
		System.out.println(email);
		enter(By.xpath("//div/input[@placeholder='Email ']"), email, "Email", 25);

	}
	public void clickOnLeadName() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/h5/a/span[text()='Lead Name']")));
		click(By.xpath("//div/h5/a/span[text()='Lead Name']"), " Expand Lead Name", 30);
	}
	public void enterLeadName() {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//div/input[@placeholder='Lead Name Search']")));
		 */
	    String leadName = prop.getProperty("leadName");
		System.out.println(leadName);
		//driver.findElement(By.xpath("//div/input[@placeholder='Lead Name Search']")).clear();
        //click(By.xpath("//div/input[@placeholder='Lead Name Search']"), "Lead Name Text field", 30);
		//enter(By.cssSelector("input[placeholder='Lead Name Search']"), leadName, "Lead Name", 25);
		driver.findElement(By.xpath("//div/input[@placeholder='Lead Name ']")).sendKeys(leadName);
		logger.info("Lead Name enterd succesfully");
	}
	public void clickOnLeadOwner() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/h5/a/span[text()='Lead Owner']")));
		click(By.xpath("//div/h5/a/span[text()='Lead Owner']"), "Expand Lead Owner", 30);
	}
	public void enterLeadOwner() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div[@class='input-group customsearchbox']/input")));
	    String leadOwner = prop.getProperty("leadOwner");
		System.out.println(leadOwner);
		enter(By.xpath("//div[@class='input-group customsearchbox']/input"), leadOwner, "Lead Owner", 25);
		click(By.xpath("//div/label[text()='"+leadOwner+"']"), "Lead Owner", 30);

	}
	
	public void clickOnSearch() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/h5/a/span[text()='Email']")));
		StopWatch pageLoad = new StopWatch(); 
		  pageLoad.start();
		  
		  driver.get("https://crm.talygen.com/CRM/Index?reqFrom=4");
		clickOnEmail();
		enterEmail();
		
		click(By.xpath("//span[@id='SearchData']/a"), "Search Button", 30);
		WebElement leadEmail = driver.findElement(By.xpath("//span[text()='"+email+"']"));
		try {
			if (leadEmail.isDisplayed()) {
				logger.info("Data is visible as expected");	
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Data is not visible as expected");
		}
		 WebDriverWait wait1 = new WebDriverWait(driver, 10);
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/span[contains(text(),'Leads')]")));
		  
		  pageLoad.stop(); //Get the time 
		  float pageLoadTime_ms = pageLoad.getElapsedTime(); 
		  float pageLoadTime_Seconds = pageLoadTime_ms/1000;
		  System.out.println("Total Page Load Time: " + pageLoadTime_ms +
		  " milliseconds"); System.out.println("Total Page Load Time: " +
		  pageLoadTime_Seconds + " seconds");
	}
	public void clickOnSearchWithMultipleFilter() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/h5/a/span[text()='Email']")));
		StopWatch pageLoad = new StopWatch(); 
		  pageLoad.start();
		  
		  driver.get("https://crm.talygen.com/CRM/Index?reqFrom=4");
			
	    clickOnEmail(); 
	    enterEmail();
			 
		clickOnLeadName();
		enterLeadName();
		clickOnLeadOwner();
		enterLeadOwner();
		click(By.xpath("//span[@id='SearchData']/a"), "Search Button", 30);
		//WebElement leadEmail = driver.findElement(By.xpath("//span[text()='kathywilliam358@mailinator.com']"));
		WebElement leadEmail = driver.findElement(By.xpath("//span[text()='"+email+"']"));
		try {
			if (leadEmail.isDisplayed()) {
				logger.info("Data is visible as expected");	
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Data is not visible as expected");
		}
		 WebDriverWait wait1 = new WebDriverWait(driver, 10);
		  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//div/span[contains(text(),'Leads')]")));
		  
		  pageLoad.stop(); //Get the time 
		  float pageLoadTime_ms = pageLoad.getElapsedTime(); 
		  float pageLoadTime_Seconds = pageLoadTime_ms/1000;
		  System.out.println("Total Page Load Time: " + pageLoadTime_ms +
		  " milliseconds"); System.out.println("Total Page Load Time: " +
		  pageLoadTime_Seconds + " seconds");
	}
	}



