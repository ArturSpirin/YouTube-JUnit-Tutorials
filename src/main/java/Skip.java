import org.junit.Assume;

/**
 * Created by Artur on 2/19/2017.
 */
public class Skip {

    public static void IF(Boolean condition){
        Assume.assumeFalse(condition);
    }

    public static void UNLESS(Boolean condition){
        Assume.assumeTrue(condition);
    }
}
