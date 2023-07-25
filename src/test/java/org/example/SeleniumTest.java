package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomeListener.class)
public class SeleniumTest extends  Base {
    @BeforeMethod
      public void   beforeMethod()
        {
          startUp();

        }
  @AfterMethod
  public  void afterMethod()
  {
    driver.quit();

  }
        @Test
        public void test()
        {
            Assert.assertEquals(false,true);
        }

    @Test
    public void homePage()
    {
        Assert.assertEquals(false,true);
    }
    @Test
    public void loginPage()
    {
        Assert.assertEquals(false,true);
    }
    @Test
    public void searchPage()
    {
        Assert.assertEquals(false,true);
    }@Test
    public void productPage()
    {
        Assert.assertEquals(false,true);
    }
    @Test
    public void shopPage()
    {
        Assert.assertEquals(false,true);
    }@Test
    public void orderPage()
    {
        Assert.assertEquals(false,true);
    }




}
