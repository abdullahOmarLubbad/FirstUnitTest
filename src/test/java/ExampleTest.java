import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleTest {
    @DataProvider(name = "divisionData") //invalid
    public Object[][] dpMethod() {
        return new Object[][]{
                {10, 0.0f},
        };
    }

    @DataProvider(name = "division") //valid
    public Object[][] Method() {
        return new Object[][]{
                {10f, 2f,5f},
                //{10.0f, 5.0f, 2.0f},
                //{100.0f, 5.0f, 20.0f},
                //{-100.0f, 5.0f, -20.0f},
                //{100.0f, -5.0f, -20.0f},
                //{-100.0f, -5.0f, -20.0f},
                //{0, 5.0f, 0f},
                //{0, -5.0f, 0f},
                //{10.0f, 0.0f, 0.0f},

        };
    }
    @Test(dataProvider = "division")
    public void validTestDivision(float x,float y ,float expected){
        Calculater calculater = new Calculater();
        Assert.assertEquals(calculater.division(x,y),expected);
    }

    @Test(dataProvider = "divisionData",expectedExceptions = ArithmeticException.class)
    public void invalidTestDivision(float x,float y){
        Calculater calculater = new Calculater();
        calculater.division(x,y);
    }
//    @DataProvider(name = "TestLength")
//    public Object[][] method(){
//        return new Object[][]{
//                {"Abdullah",8},
//                {"ali",3},
//                {"nour",4},
//                {"_a",2},
//                {"",0},
//                {"1",1},
//        };
//    }
//    @Test(dataProvider ="TestLength" )
//    public void test1(String S,int expected){
//        Example example = new Example();
//        Assert.assertEquals(example.text(S),expected);
//    }
//    @Test
//    public void test1(){
//        Assert.assertTrue(true);
//    }
//    @Test
//    public void test2(){
//        Assert.assertTrue(true);
//    }
//    @Test
//    public void test3(){
//        Assert.assertTrue(true);
//    }
//    @Test
//    public void test4(){
//        Assert.assertTrue(true);
//    }
}
