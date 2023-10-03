import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation {
    //    @Test(priority = 1)
//    @AfterMethod
//    public void testMultiple(){
//        Assert.assertTrue(5==5);
//    }
//    @Test(priority = 2)
//    public void testDivision(){
//        Assert.assertTrue(5==5);
//    }
//
//    @BeforeMethod
//    public void testDivision(ITestResult result){
//        System.out.println(result.getMethod().getMethodName()+"is started");
//    }
//    @AfterMethod
//    public void printStatus(ITestResult result){
//        System.out.println(result.getMethod().getMethodName()+"is finished");
//    }
    @BeforeClass
    public void testDiv(){
        System.out.println("is started");
    }
    @AfterClass
    public void printSts(){
        System.out.println("is finished");
    }

    @Test(priority = 3)
    public void testSum(){
        Assert.assertTrue(5==5);
    }

}
