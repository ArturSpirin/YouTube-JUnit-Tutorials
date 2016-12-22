import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
/**
 * Created by Artur on 6/13/2016.
 */
public class Helper {

    public static Collection data() throws IOException, ParseException {
        ArrayList<Object[]> data = new ArrayList<Object[]>();
        JSONParser parser = new JSONParser();
        JSONObject rawJson = (JSONObject) parser.parse(new FileReader("src/main/resources/test.json"));
        Object[] keys = rawJson.keySet().toArray();
        for(Object key : keys) {
            JSONObject json = (JSONObject) rawJson.get(key);
            data.add(new Object[]{json});
        }
        return data;
    }
}
