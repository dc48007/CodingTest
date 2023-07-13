package TestNG;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Reporter;


public class PractiseTestNGAspects {





    @Test(groups = {"Sanity"})
    @Parameters({"username","password"})
    public void testcase1(String username, String password) {
        System.out.println("paramter value:" + username + "-----" + password);
        Reporter.log("Testcase name");
     }

    @Test(dataProvider = "Browser", threadPoolSize = 3, invocationCount = 3)
    public void testCase2(String browser){
        System.out.println("Browser name: "+ browser + "--> by Thread: "+ Thread.currentThread().getId());
        Assert.assertTrue(false);
    }



    @DataProvider(name = "Browser")
    public Object[][] getBrowser(){
        return new Object[][]{new Object[]{"firefox"}};
    }

    @Test(groups = {"Sanity"})
    @Parameters({"username","password"})
    public void testcase3(String username, String password){
        System.out.println("paramter value:" + username + "-----" + password);
    }
}
