import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment {
    @DataProvider(name = "TestLength")
    public Object[][] method(){
        return new Object[][]{
                {"Abdullah",8},
                {"ali",3},
                {"nour",4},
                {"_a",2},
                {"",0},
                {"1",1},
        };
    }
    @Test(dataProvider ="TestLength" )
    public void test1(String S,int expected){
        Example example = new Example();
        Assert.assertEquals(example.text(S),expected);
    }
}
