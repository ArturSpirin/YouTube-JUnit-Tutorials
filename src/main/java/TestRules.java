import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by Artur on 6/9/2016.
 */
public class TestRules {

    @Rule
    public Retry retry = new Retry(3);

    @BeforeClass
    public static void beforeClass(){
        System.out.println("I'm beforeClass method from TestRules!");
    }

    @Before
    public void before(){
        System.out.println("I'm before method from TestRules!");
    }

    @After
    public void after(){
        System.out.println("I'm after method from TestRules!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("I'm afterClass method from TestRules!");
    }

    @Rule
    public TestRule listen = new TestWatcher(){

        @Override
        public void failed(Throwable t, Description description){
            //Logic for handling failed tests
            System.out.println("Test "+description.getMethodName()+" FAILED!");
        }

        @Override
        public void succeeded(Description description){
            //Logic for handling passed tests
            System.out.println("Test "+description.getMethodName()+" PASSED!");
        }
    };
}
