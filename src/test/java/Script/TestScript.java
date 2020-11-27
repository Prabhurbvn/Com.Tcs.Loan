package Script;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.Loginpage;
import Utils.Testutil;

public class TestScript extends Testbase
{
    Loginpage log;
    
    @BeforeTest(alwaysRun=true)
    public void Setup()
    {
    	 Open();
    	log =new Loginpage();
    }
    
    @Test
    public void ValidateTitle()
    {
    	String str=log.VerifyTitle();
    	Assert.assertEquals(str, "Facebook – log in or sign up");
    }
    
    @Test
    public void ValidateUrl()
    {
    	String s= log.VerifyUrl();
    	Assert.assertEquals(s, "https://www.facebook.com/");
    }
    
   @Test
    public void ValidateCreate()
    {
    	log.Verifycreatenewaccount();
    }
    
    @Test
    public void ValidateCreateaccount()
    {
    	String h= log.Verifycreate();
    	Assert.assertEquals(h, "Create New Account");
    }
    
    @Test
    public void validateFirstname()
    {
    	log.VerifyFirstname("selenium");
    }
    
    @Test
    public void validateSurname()
    {
    	log.Verifysurname("A");;
    }
    
    @Test
    public void ValidateRadio()
    {
    	boolean j = log.Verifyradio();
    	Assert.assertTrue(j);
    }
    
    @Test
    public void ValidateDay()
    {
    	Testutil.Drop_day(log.Drop_day, 17);
    }
    
    
    @Test
    public void ValidateMonth()
    {
    	Testutil.Drop_month(log.Drop_month, "Jan");
    }
    
    
    @Test
    public void Validateyear()
    {
    	Testutil.Drop_year(log.Drop_year, "2020");
    }
    
    
   
    @AfterTest
    public void Teardown()
    {
    	driver.close();
    }
    
   


}
