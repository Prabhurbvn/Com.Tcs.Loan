package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class Loginpage extends Testbase
{
	 @FindBy(id="email")
	    public WebElement EmailAddress;
	    
	    @FindBy(name="pass")
	    public  WebElement Password;
	    
	    @FindBy(xpath="//a[@role='button']")
	    WebElement CreateNewAccount;
	    
	   @FindBy(xpath="//input[@name='firstname']")
	   WebElement Firstname;
	   
	   @FindBy(xpath="//input[@name='lastname']")
	   WebElement Surname;
	   
	   @FindBy(xpath="//label[text()='Female']")
	   WebElement Femaleradio;
	   
	   @FindBy(name="birthday_day")
	   public WebElement Drop_day;
	   
	   @FindBy(xpath="//select[@name='birthday_month']")
	   public WebElement Drop_month;
	   
	   @FindBy(xpath="//select[@id='year']")
	   public WebElement Drop_year;
	   
	   public Loginpage()
	   {
		   super();
		   PageFactory.initElements(driver, this);
	   }
	   
	   public String VerifyTitle()
	   {
		   String t= driver.getTitle();
		   return t;
	   }
	   
	   public String VerifyUrl()
	   {
		   String u= driver.getCurrentUrl();
		   return u;
	   }
	   
	   public void VerifyEmail(String user)
	   {
		   EmailAddress.sendKeys(user);
	   }
	   
	   public void VerifyPassword(String pass)
	   {
		   Password.sendKeys(pass);
	   }
	   
	   public void Verifycreatenewaccount()
	   {
		   CreateNewAccount.click();
	   }
	   
	   public String Verifycreate()
	   {
		   return CreateNewAccount.getText();
	   }
	   public void VerifyFirstname(String name)
	   {
		   Firstname.sendKeys(name);
	   }
	   
	   public void Verifysurname(String sur)
	   {
		   Surname.sendKeys(sur);
	   }
	   
	   public boolean Verifyradio()
	   {
		   boolean d = Femaleradio.isDisplayed();
		   return d;
	   }
	   
	   public void Verifytest(String user,String pass) throws InterruptedException
	   {
		   EmailAddress.clear();
		   EmailAddress.sendKeys(user);
		   Thread.sleep(2000);
		   Password.clear();
		   Password.sendKeys(pass);
		   Thread.sleep(2000);
	   }
	   
	   
	   
}
