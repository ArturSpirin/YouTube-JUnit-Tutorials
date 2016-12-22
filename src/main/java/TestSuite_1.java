import org.junit.*;

/**
 * Created by Artur on 6/7/2016.
 */
public class TestSuite_1 extends TestRules{

    @Test
    public void test1(){
        System.out.println("I'm test 1 from TestSuite_1!");
        Assert.assertTrue(false);
    }

    @Test
    public void test2(){
        System.out.println("I'm test 2 from TestSuite_1!");
    }
}
