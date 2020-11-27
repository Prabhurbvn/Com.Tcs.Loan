package Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Base.Testbase;



public class Testutil extends Testbase
{
	public static void Maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static void Implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void Screenshot()
	{
		try
		{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(".//src//main//java//Screen//fb"+System.currentTimeMillis()+".jpg")); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void Drop_day(WebElement day , int d)
	{
		Select sel =new Select(day);
		sel.selectByIndex(d);
	}
		
	public static void Drop_month(WebElement month , String m)
	{
		Select se =new Select(month);
		se.selectByVisibleText(m);
	}
	
	public static void Drop_year(WebElement year , String y)
	{
		Select s =new Select(year);
		s.selectByValue(y);
	}
		
    


}
