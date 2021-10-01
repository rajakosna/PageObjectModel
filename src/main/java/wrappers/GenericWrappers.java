package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{
	
	static RemoteWebDriver driver;
	int count = 0;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/Object.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unloadObject() {
		prop=null;
	}
	

	
	
	public void invokeApp(String browser, String url) {
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("IE")) {
				System.setProperty("weddriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser has been launched and loaded url '"+url+"'");
			
			reportStep("The "+browser+" browser has been launched and loaded url '"+url+"'", "pass");
			
		} catch (InvalidArgumentException e) {
			//System.err.println("The url given does not have http/https ");
			reportStep("The url given does not have http/https ", "fail");
		}
		catch (SessionNotCreatedException e) {
			//System.err.println("The "+browser+" drowser did not lauch because there was no session ID created");
			reportStep("The "+browser+" drowser did not lauch because there was no session ID created", "fail");
		}
		catch (WebDriverException e) {
			//System.err.println("The "+browser+" did not launch due to unkown error");
			reportStep("The "+browser+" did not launch due to unkown error", "fail");
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with ID '"+idValue+"' has been loacted and filled with data '"+data+"'");
			reportStep("The element with ID '"+idValue+"' has been loacted and filled with data '"+data+"'", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ID '"+idValue+"' could not be located in DOM");
			reportStep("The element with ID '"+idValue+"' could not be located in DOM", "fail");
		}
		catch(ElementNotVisibleException e) {
			//System.err.println("The element with ID '"+idValue+"' is not visible in the application");
			reportStep("The element with ID '"+idValue+"' is not visible in the application", "fail");
		}
		catch(ElementNotInteractableException e) {
			//System.err.println("The element with ID '"+idValue+"' is not interactable in the applciation");
			reportStep("The element with ID '"+idValue+"' is not interactable in the applciation", "fail");
		}
		catch(StaleElementReferenceException e) {
			//System.err.println("The element with ID '"+idValue+"' is an unstable element in the application");
			reportStep("The element with ID '"+idValue+"' is an unstable element in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+idValue+"' cannot be filled with data"+data+" for unkown reason");
			reportStep("The element with ID '"+idValue+"' cannot be filled with data"+data+" for unkown reason", "fail");
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name '"+nameValue+"' has been located in the DOM and filled with data '"+data+"'");
			reportStep("The element with name '"+nameValue+"' has been located in the DOM and filled with data '"+data+"'", "pass");
		} 
		catch (NoSuchElementException e) {
			//System.err.println("The element with name '"+nameValue+"' cannot be located in DOM");
			reportStep("The element with name '"+nameValue+"' cannot be located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+nameValue+"' is not visible in the application");
			reportStep("The element with name '"+nameValue+"' is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+nameValue+"' is not interactable in the application");
			reportStep("The element with name '"+nameValue+"' is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+nameValue+"' is an unstable element in the application");
			reportStep("The element with name '"+nameValue+"' is an unstable element in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+nameValue+"' cannot be filled with data "+data+" for unkown reason");
			reportStep("The element with name '"+nameValue+"' cannot be filled with data "+data+" for unkown reason", "fail");
		}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
		driver.findElementByXPath(xpathValue).sendKeys(data);
		System.out.println("The element with XPath '"+xpathValue+"' has been loacted in the DOM and data '"+data+"' has been filled.");
		reportStep("The element with XPath '"+xpathValue+"' has been loacted in the DOM and data '"+data+"' has been filled.", "pass");
		}
		catch (NoSuchElementException e) {
			//System.err.println("The element with XPath "+xpathValue+" cannot be located in DOM");
			reportStep("The element with XPath "+xpathValue+" cannot be located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" is not visible in the application");
			reportStep("The element with XPath "+xpathValue+" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" is not interactable in the application");
			reportStep("The element with XPath "+xpathValue+" is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" is an unstable element in the application");
			reportStep("The element with XPath "+xpathValue+" is an unstable element in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathValue+" cannot be filled with data "+data+" for unkown reason");
			reportStep("The element with XPath "+xpathValue+" cannot be filled with data "+data+" for unkown reason", "fail");
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title))
			{
				//System.out.println("The title of the browser is '"+actualTitle+"' is matched with expected title '"+title+"'");
				reportStep("The title of the browser is '"+actualTitle+"' is matched with expected title '"+title+"'", "pass");
			} else {
				//System.err.println("The title of the browser is '"+actualTitle+"' did not match with expecting title '"+title+"'");
				reportStep("The title of the browser is '"+actualTitle+"' did not match with expecting title '"+title+"'", "fail");
			}
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The title "+title+" cannot be verified for unkown reason");
			reportStep("The title "+title+" cannot be verified for unkown reason", "fail");
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)){
				//	System.out.println("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text, "pass");
			}
			else {
				//	System.out.println("The element with id "+id+" is holding the text "+actualText+" did not match with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" did not match with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ID "+id+" cannot be located in DOM");
			reportStep("The element with ID "+id+" cannot be located in DOM", "fail");
		}
		
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element ID "+id+" is an unstable element in the application");
			reportStep("The element ID "+id+" is an unstable element in the application", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element ID "+id+" is not visible in the application");
			reportStep("The element ID "+id+" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element ID "+id+" is not interactable in the application");
			reportStep("The element ID "+id+" is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+id+" cannot verify the text "+text+" for unkown reason");
			reportStep("The element with ID "+id+" cannot verify the text "+text+" for unkown reason", "fail");
		}
		
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actutalText = driver.findElementByXPath(xpath).getText();
			if(actutalText.equals(text)) {
				//System.out.println("The element with XPath '"+xpath+"' holing the text '"+actutalText+"' is matched with the expected text '"+text+"'");
				reportStep("The element with XPath '"+xpath+"' holing the text '"+actutalText+"' is matched with the expected text '"+text+"'", "pass");
			}
			else {
				//System.out.println("The element with XPath '"+xpath+"' holing the text '"+actutalText+"' did not match with the expected text "+text+"'");
				reportStep("The element with XPath '"+xpath+"' holing the text '"+actutalText+"' did not match with the expected text "+text+"'", "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath '"+xpath+"' cannoted be located in DOM");
			reportStep("The element with XPath '"+xpath+"' cannoted be located in DOM", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' is an unstable element in the application");
			reportStep("The element with XPath '"+xpath+"' is an unstable element in the application", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' is not visible in the application");
			reportStep("The element with XPath '"+xpath+"' is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpath+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' cannot verify the text '"+text+"' for unknown reason");
			reportStep("The element with XPath '"+xpath+"' cannot verify the text '"+text+"' for unknown reason", "fail");
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actutalText = driver.findElementByXPath(xpath).getText();
			if(actutalText.contains(text)) {
				//System.out.println("The text located by XPath '"+xpath+"' holding the text '"+actutalText+"' contains the text "+text+"'");
				reportStep("The text located by XPath '"+xpath+"' holding the text '"+actutalText+"' contains the text "+text+"'", "pass");
			}
			else {
				//System.err.println("The text located by XPath '"+xpath+"' holding the text '"+actutalText+"' does not contain the text '"+text+"'");
				reportStep("The text located by XPath '"+xpath+"' holding the text '"+actutalText+"' does not contain the text '"+text+"'", "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath '"+xpath+"' connot be located in DOM");
			reportStep("The element with XPath '"+xpath+"' connot be located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' is not visbile in the application");
			reportStep("The element with XPath '"+xpath+"' is not visbile in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpath+"' is not interactable in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' is an unstable element in the application");
			reportStep("The element with XPath '"+xpath+"' is an unstable element in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpath+"' cannot verify the text '"+text+"' for unknown reason");
			reportStep("The element with XPath '"+xpath+"' cannot verify the text '"+text+"' for unknown reason", "fail");
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with ID '"+id+"' has been located and clicked");
			reportStep("The element with ID '"+id+"' has been located and clicked", "pass");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' connot be loacted in DOM");
			reportStep("The element with ID '"+id+"' connot be loacted in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is not visible in the application");
			reportStep("The element with ID '"+id+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is an unstable element in the application");
			reportStep("The element with ID '"+id+"' is an unstable element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is not clickable in the application");
			reportStep("The element with ID '"+id+"' is not clickable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is not interactable in the application");
			reportStep("The element with ID '"+id+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' cannot be clicked for unkown reason");
			reportStep("The element with ID '"+id+"' cannot be clicked for unkown reason", "fail");
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with Class Name '"+classVal+"' has been located and clicked");
			reportStep("The element with Class Name '"+classVal+"' has been located and clicked", "pass");
		} 
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with class name '"+classVal+"' is not loacted in DOM");
			reportStep("The element with class name '"+classVal+"' is not loacted in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with class name '"+classVal+"' is not visible in the application");
			reportStep("The element with class name '"+classVal+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The elemenet with class name '"+classVal+"' is an unstable element in the application");
			reportStep("The elemenet with class name '"+classVal+"' is an unstable element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with class name '"+classVal+"' cannot be clicked in the application");
			reportStep("The element with class name '"+classVal+"' cannot be clicked in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with class name '"+classVal+"' is not interactable in the application");
			reportStep("The element with class name '"+classVal+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with class name '"+classVal+"' is not clickable for unkown reason");
			reportStep("The element with class name '"+classVal+"' is not clickable for unkown reason", "fail");
		}
		
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name '"+name+"' has been located and clicked");
			reportStep("The element with name '"+name+"' has been located and clicked", "pass");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' cannot be loacted in DOM");
			reportStep("The element with name '"+name+"' cannot be loacted in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' is not visble in the application");
			reportStep("The element with name '"+name+"' is not visble in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' is an unstable element in the application");
			reportStep("The element with name '"+name+"' is an unstable element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' cannot be cliked in the application");
			reportStep("The element with name '"+name+"' cannot be cliked in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' is not interactable in the application");
			reportStep("The element with name '"+name+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' connot be clicked for unkown reason");
			reportStep("The element with name '"+name+"' connot be clicked for unkown reason", "fail");
		}
	
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with link text '"+name+"' has been loacted and clicked");
			reportStep("The element with link text '"+name+"' has been loacted and clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link text '"+name+"' is not loacted in DOM");
			reportStep("The element with link text '"+name+"' is not loacted in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' is not visible in the application");
			reportStep("The element with link text '"+name+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			//System.err.println("The element with link text '"+name+"' is an unstable element in the application");
		reportStep("The element with link text '"+name+"' is an unstable element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' cannot be clicked in the application");
			reportStep("The element with link text '"+name+"' cannot be clicked in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' is not interactable in the application");
			reportStep("The element with link text '"+name+"' is not interactable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' connot be clicked for unkown reason");
			reportStep("The element with link text '"+name+"' connot be clicked for unkown reason", "fail");
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link text '"+name+"' has been located and clicked");
			reportStep("The element with link text '"+name+"' has been located and clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link text '"+name+"' was not located in DOM");
			reportStep("The element with link text '"+name+"' was not located in DOM", "fail");
			
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' is not visible in the application");
			reportStep("The element with link text '"+name+"' is not visible in the application", "fail");
			
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' is an unstable element in the application");
			reportStep("The element with link text '"+name+"' is an unstable element in the application", "fail");
			
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' cannot be clicked in the application");
			reportStep("The element with link text '"+name+"' cannot be clicked in the application", "fail");
			
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' is not interactable in the application");
			reportStep("The element with link text '"+name+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link text '"+name+"' connot be clicked for unkown reason");
			reportStep("The element with link text '"+name+"' connot be clicked for unkown reason", "fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with XPath '"+xpathVal+"' has been loacted and clicked");
			reportStep("The element with XPath '"+xpathVal+"' has been loacted and clicked", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with XPath '"+xpathVal+"' is not located in DOM");
			reportStep("The element with XPath '"+xpathVal+"' is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not visible in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is an unstabl element in the application");
			reportStep("The element with XPath '"+xpathVal+"' is an unstabl element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not clickable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not clickable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason");
			reportStep("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason", "fail");
		}
		
		
	}
	
	public void clickByXpath(String xpathVal, String option) {
		// TODO Auto-generated method stub
		try {
			if(xpathVal.contains("option")) {
				
			xpathVal = xpathVal.replace("+option+",option);
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with XPath '"+xpathVal+"' has been loacted and clicked");
			reportStep("The element with XPath '"+xpathVal+"' has been loacted and clicked", "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with XPath '"+xpathVal+"' is not located in DOM");
			reportStep("The element with XPath '"+xpathVal+"' is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not visible in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is an unstabl element in the application");
			reportStep("The element with XPath '"+xpathVal+"' is an unstabl element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not clickable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not clickable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason");
			reportStep("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason", "fail");
		}
		
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with XPath '"+xpathVal+"' has been located and clicked");
			reportStep("The element with XPath '"+xpathVal+"' has been located and clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with XPath '"+xpathVal+"' is not loacted in DOM");
			reportStep("The element with XPath '"+xpathVal+"' is not loacted in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not visble in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not visble in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is an unstable element in the application");
			reportStep("The element with XPath '"+xpathVal+"' is an unstable element in the application", "fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not clickable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not clickable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpathVal+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason");
			reportStep("The element with XPath '"+xpathVal+"' connot be clicked for unkown reason", "fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			 text = driver.findElementById(idVal).getText();
			 //System.out.println("The with ID "+idVal+" has been loacted and returning text "+text);
			reportStep("The with ID "+idVal+" has been loacted and returning text "+text, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ID "+idVal+" is not located in DOM");
			reportStep("The element with ID "+idVal+" is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+idVal+" is not visbsle in the application");
			reportStep("The element with ID "+idVal+" is not visbsle in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+idVal+" is an unstable element in the application");
			reportStep("The element with ID "+idVal+" is an unstable element in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+idVal+" is not interactable in the application");
			reportStep("The element with ID "+idVal+" is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+idVal+" connot get text for unkown reason");
			reportStep("The element with ID "+idVal+" connot get text for unkown reason", "fail");
		}
		
		
		return text;
		
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text= driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with XPath '"+xpathVal+"' has been located and retruning text "+text+"'");
			reportStep("The element with XPath '"+xpathVal+"' has been located and retruning text "+text+"'", "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath '"+xpathVal+"' is not located in DOM");
			reportStep("The element with XPath '"+xpathVal+"' is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' is not visble in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not visble in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' is an unstable element in the application");
			reportStep("The element with XPath '"+xpathVal+"' is an unstable element in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpathVal+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath '"+xpathVal+"' connot get text for unkown reason");
			reportStep("The element with XPath '"+xpathVal+"' connot get text for unkown reason", "fail");
		}
		
		
		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementById(id));
			select.selectByVisibleText(value);
			//System.out.println("The element with ID '"+id+"' has been located and selected with value '"+value+"'");
			reportStep("The element with ID '"+id+"' has been located and selected with value '"+value+"'", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ID '"+id+"' is not located in DOM");
			reportStep("The element with ID '"+id+"' is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is not visible in the application");
			reportStep("The element with ID '"+id+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is an unstable element in the application");
			reportStep("The element with ID '"+id+"' is an unstable element in the application", "fail");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is not selectable in the application");
			reportStep("The element with ID '"+id+"' is not selectable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' is not interactable in the application");
			reportStep("The element with ID '"+id+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ID '"+id+"' connot be selected for unkown reason");
			reportStep("The element with ID '"+id+"' connot be selected for unkown reason", "fail");
		}
		
		
	}
	
	public void selectVisibileTextByClass(String className, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementByClassName(className));
			select.selectByVisibleText(value);
			//System.out.println("The element with class name '"+className+"' has been located and selected with value '"+value+"'");
			reportStep("The element with class name '"+className+"' has been located and selected with value '"+value+"'", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with class name "+className+" is not located in DOM");
			reportStep("The element with class name "+className+" is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+className+" is not visible in the application");
			reportStep("The element with class name "+className+" is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+className+" is an unstable element in the application");
			reportStep("The element with class name "+className+" is an unstable element in the application", "fail");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+className+" is not selectable in the application");
			reportStep("The element with class name "+className+" is not selectable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+className+" is not interactable in the application");
			reportStep("The element with class name "+className+" is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with class name "+className+" connot be selected for unkown reason");
			reportStep("The element with class name "+className+" connot be selected for unkown reason", "fail");
		}
		
		
	}
	
	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementByXPath(xpath));
			select.selectByVisibleText(value);
			System.out.println("The element with XPath '"+xpath+"' has been located and selected with value '"+value+"'");
			reportStep("The element with XPath '"+xpath+"' has been located and selected with value '"+value+"'", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with XPath '"+xpath+"' is not located in DOM");
			reportStep("The element with XPath '"+xpath+"' is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpath+"' is not visible in the application");
			reportStep("The element with XPath '"+xpath+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpath+"' is an unstable element in the application");
			reportStep("The element with XPath '"+xpath+"' is an unstable element in the application", "fail");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpath+"' is not selectable in the application");
			reportStep("The element with XPath '"+xpath+"' is not selectable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpath+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpath+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with XPath '"+xpath+"' connot be selected for unkown reason");
			reportStep("The element with XPath '"+xpath+"' connot be selected for unkown reason", "fail");
		}
		
		
	}
	
	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementByName(name));
			select.selectByVisibleText(value);
			//System.out.println("The element with name '"+name+"' has been located and selected with value '"+value+"'");
			reportStep("The element with name '"+name+"' has been located and selected with value '"+value+"'", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name '"+name+"' is not located in DOM");
			reportStep("The element with name '"+name+"' is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' is not visible in the application");
			reportStep("The element with name '"+name+"' is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' is an unstable element in the application");
			reportStep("The element with name '"+name+"' is an unstable element in the application", "fail");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' is not selectable in the application");
			reportStep("The element with name '"+name+"' is not selectable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' is not interactable in the application");
			reportStep("The element with name '"+name+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name '"+name+"' connot be selected for unkown reason");
			reportStep("The element with name '"+name+"' connot be selected for unkown reason", "fail");
		}
		
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			Select select = new Select(driver.findElementById(id));
			select.selectByIndex(value);
			//System.out.println("The element with ID '"+id+"' has been located and selected with index '"+value+"'");
			reportStep("The element with ID '"+id+"' has been located and selected with index '"+value+"'", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ID "+id+" is not located in DOM");
			reportStep("The element with ID "+id+" is not located in DOM", "fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+id+" is not visible in the application");
			reportStep("The element with ID "+id+" is not visible in the application", "fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+id+" is an unstable element in the application");
			reportStep("The element with ID "+id+" is an unstable element in the application", "fail");
		}
		catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+id+" is not selectable in the application");
			reportStep("The element with ID "+id+" is not selectable in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+id+" is not interactable in the application");
			reportStep("The element with ID "+id+" is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ID "+id+" connot be selected for unkown reason");
			reportStep("The element with ID "+id+" connot be selected for unkown reason", "fail");
		}
		
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for(String eachHandle : windowHandles) {
				driver.switchTo().window(eachHandle);
				break;
			}
			//System.out.println("The focus of the driver is shifted to parent window");
			reportStep("The focus of the driver is shifted to parent window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The focus fof the driver cannot be switched to parent window because there is no window present in the browser");
			reportStep("The focus fof the driver cannot be switched to parent window because there is no window present in the browser", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The focus of the driver cannot be switched to parent window for unknown reason");
			reportStep("The focus of the driver cannot be switched to parent window for unknown reason", "fail");
		}
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for(String eachHandle : windowHandles) {
				driver.switchTo().window(eachHandle);
			}
			//System.out.println("The focus of the browser has been shifted to the last window");
			reportStep("The focus of the browser has been shifted to the last window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The focus fof the driver cannot be switched to last window because there is no window present in the browser");
			reportStep("The focus fof the driver cannot be switched to last window because there is no window present in the browser", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The focus of the driver cannot be switched to last window for unknown reason");
			reportStep("The focus of the driver cannot be switched to last window for unknown reason", "fail");
		}
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert has been located and accepted");
			reportStep("The alert has been located and accepted", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert present on browser");
			reportStep("There is no alert present on browser", "fail");
		}
		catch (Exception e) {
			// TODO: handle exception
			//System.err.println("The alert cannot be accepted for unkown reason");
			reportStep("The alert cannot be accepted for unkown reason", "fail");
		}
		
		
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert has been located and dismissed");
			reportStep("The alert has been located and dismissed", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert present on the browser");
			reportStep("There is no alert present on the browser", "fail");
		}
		catch (Exception e) {
			// TODO: handle exception
			//System.err.println("The alert cannot be dismissed for unkown reason");
			reportStep("The alert cannot be dismissed for unkown reason", "fail");
		}
		
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
			//System.out.println("The focus of the browser has been shifted to alert and returning alert text "+text);
			reportStep("The focus of the browser has been shifted to alert and returning alert text "+text, "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert present on the browser");
			reportStep("There is no alert present on the browser", "fail");
		}
		catch (Exception e) {
			// TODO: handle exception
			//System.err.println("The alert cannot be dismissed for unkown reason");
			reportStep("The alert cannot be dismissed for unkown reason", "fail");
		}
		
		return text;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number =0;
		try {
			
		number = 	(long) (Math.floor(Math.random()*100000000)+100000);
			
		File temp = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./reports/screenshots/"+number+".png");
		
		FileUtils.copyFile(temp,dest);
		} catch (IOException e) {
			//System.err.println("The Input Output Exception");
			reportStep("The Input Output Exception", "fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The screen shot is not taken for unkown reason");
			reportStep("The screen shot is not taken for unkown reason", "fail");
		}
		
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The current browser is closed");
			reportStep("The current browser is closed", "pass", false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser did not close for unkown reason");
			reportStep("The browser did not close for unkown reason", "fail", false);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			//System.err.println("The broswer is not closed");
			reportStep("The broswer is not closed", "fail", false);
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All browsers are closed");
			reportStep("All browsers are closed", "pass", false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("All browsers did not close for unkown reason");
			reportStep("All browsers did not close for unkown reason", "fail", false);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			//System.err.println("The driver did not close all browsers");
			reportStep("The driver did not close all browsers", "fail", false);
		}
		
	}

	public void waitProperty(long millis) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The webdriver cannot wait for "+millis+" milli seconds");
			reportStep("The webdriver cannot wait for "+millis+" milli seconds", "fail");
		}
		
	}
	
	public void pageDown() {
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page is not scrolled down for unkown reason");
			reportStep("The page is not scrolled down for unkown reason", "fail");
		}
	}
	
	public void pageUp() {
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_UP);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page is not scrolled down for unkown reason");
			reportStep("The page is not scrolled up for unkown reason", "fail");
		}
	}

	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions action = new Actions(driver);
			WebElement we = driver.findElementByXPath(xpath);
			action.moveToElement(we).perform();
		} catch(NoSuchElementException e) {
			//System.err.println("The element with XPath '"+xpath+"' cannot be located in DOM");
			reportStep("The element with XPath '"+xpath+"' cannot be located in DOM", "fail");
		}
		catch(StaleElementReferenceException e) {
			//System.err.println("The element with XPath '"+xpath+"' is unstable in the application");
			reportStep("The element with XPath '"+xpath+"' is unstable in the application", "fail");
		}
		catch(ElementNotInteractableException e) {
			//System.err.println("The element with XPath '"+xpath+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpath+"' is not interactable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The cursor cannot be hovered for unkown reason");
			reportStep("The cursor cannot be hovered for unkown reason", "fail");
		}
		
	}

	public void mouseHoverAndClickByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			Actions action = new Actions(driver);
			WebElement we = driver.findElementByXPath(xpath);
			action.moveToElement(we).click().perform();
		} catch(NoSuchElementException e) {
			//System.err.println("The element with XPath '"+xpath+"' cannot be located in DOM");
			reportStep("The element with XPath '"+xpath+"' cannot be located in DOM", "fail");
		}
		catch(StaleElementReferenceException e) {
			//System.err.println("The element with XPath '"+xpath+"' is unstable in the application");
			reportStep("The element with XPath '"+xpath+"' is unstable in the application", "fail");
		}
		catch(ElementNotInteractableException e) {
			//System.err.println("The element with XPath '"+xpath+"' is not interactable in the application");
			reportStep("The element with XPath '"+xpath+"' is not interactable in the application", "fail");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The cursor cannot be hovered and clicked for unkown reason");
			reportStep("The cursor cannot be hovered and clicked for unkown reason", "fail");
		}
		
	}
	
	//public WebDriverWait wait = new WebDriverWait(driver, 15);

}
