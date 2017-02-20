import org.junit.*;

/**
 * Created by Artur on 6/7/2016.
 */
public class TestSuite_1 extends TestRules{

    @BeforeClass
    public static void beforeClass(){
        Skip.UNLESS(true);
    }

    @Test
    public void test1(){
        Skip.IF(true);
        System.out.println("I'm test 1 from TestSuite_1!");
    }

    @Test
    public void test2(){
        Skip.IF(false);
        System.out.println("I'm test 2 from TestSuite_1!");
    }
}
