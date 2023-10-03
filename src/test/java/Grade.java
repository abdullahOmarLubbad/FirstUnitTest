import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.reflect.MethodMatcherException;

public class Grade {
    @DataProvider(name = "grade")
    public Object[][] dpMethod() {
        return new Object[][]{
                {20, "Invalid"}, {90, "Excellent"}, {91, "Excellent"},
                {99, "Excellent"}, {80, "Very Good"}, {81, "Very Good"},
                {88, "Very Good"}, {89, "Very Good"}, {70, "Good"},
                {71, "Good"}, {78, "Good"}, {79, "Good"}, {60, "Accepted"},
                {61, "Accepted"}, {68, "Accepted"}, {69, "Accepted"},
                {40, "Failed"}, {41, "Failed"}, {48, "Failed"}, {49, "Failed"},
                {101, "Invalid"}, {110, "Invalid"}, {1000, "Invalid"},
                {0, "Invalid"}, {20, "Invalid"}, {-1, "Invalid"}, {-10000, "Invalid"},
        };
    }
//    @DataProvider(name = "gradeInvalidDate")
//    public Object[][] invalidData() {
//        return new Object[][]{
//                {"0", "Invalid"},
//        };
//    }

    @Test(dataProvider = "grade")
    public void getGrade(int x, String expected) {
        Calculater calculater = new Calculater();
        Assert.assertEquals(calculater.getGrade(x), expected);
    }

    @Test(dataProvider = "gradeInvalidDate",enabled = false)
    public void getGradeWhenException(int mark, String expected) {
        Calculater calculater = new Calculater();
        calculater.getGrade(mark);
    }
@Test
public void test1(){
    Assert.assertTrue(true);
}
    @Test
    public void test2(){
        Assert.assertTrue(true);
    }
    @Test
    public void test3(){
        Assert.assertTrue(true);
    }
    @Test
    public void test4(){
        Assert.assertTrue(true);
    }
}
