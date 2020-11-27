package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Utils.Testutil;



public class Testbase 
{
	File f; 
    FileInputStream fis;
    Properties pro;
    public static WebDriver driver;
    
    public Testbase()
    {
    	try
    	{
    	f=new File("D:\\Java workspace\\Com.Tcs.Loan\\src\\main\\java\\Config\\Config.Properties");
    	fis =new FileInputStream(f);
    	pro=new Properties();
    	pro.load(fis);
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    }
    
    public void Open()
    {
    	String browser=pro.getProperty("browsername");
    	
    	if(browser.equalsIgnoreCase("Chrome"))
    	{
    		//WebDriverManager.chromedriver().setup();
    		System.setProperty("webdriver.chrome.driver", pro.getProperty("chromepath"));
    		driver =new ChromeDriver();
    	}
    	
    	else if(browser.equalsIgnoreCase("Firefox"))
    	{
    		//WebDriverManager.firefoxdriver().setup();
    		System.setProperty("webdriver.gecko.driver", pro.getProperty("geckopath"));
    		driver =new FirefoxDriver();
    	}
    	
    	else if(browser.equalsIgnoreCase("IE"))
    	{
    		//WebDriverManager.iedriver().setup();
    		System.setProperty("webdriver.ie.driver", pro.getProperty("iepath"));
    		driver =new InternetExplorerDriver();
    	}
    	
    	else
    	{
    		System.out.println("Given browsername is wrong");
    	}
    	
    	driver.get(pro.getProperty("url"));
    	Testutil.Maximize();
    	Testutil.Implicitwait();
    	Testutil.Screenshot();
    	
    }
}
