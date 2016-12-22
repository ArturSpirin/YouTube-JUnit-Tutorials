import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Collection;

/**
 * Created by Artur on 6/13/2016.
 */
@RunWith(Parameterized.class)
public class TestSuite_3 {

    @Parameterized.Parameter
    public JSONObject json;

    @Parameterized.Parameters
    public static Collection data() throws IOException, ParseException {
        return Helper.data();
    }

    @Test
    public void test(){
        System.out.println("Test Name: "+json.get("test_name"));
        System.out.println("Username: "+json.get("username"));
        System.out.println("Password: "+json.get("password"));
    }
}
