package serializationTest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonEntertaiment {

    private static String json = "{ \"value1\" : \"Black\", \"value2\" : \"BMW\" }";

    public static void main(String ...args) {

        ObjectMapper om = new ObjectMapper();
        ObjectForJSONEntertaiment o = new ObjectForJSONEntertaiment("value1", "value2");

/*        try {
            om.writeValue(new File("vi.json"), o);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            ObjectForJSONEntertaiment obj = om.readValue(JsonEntertaiment.json, ObjectForJSONEntertaiment.class);
            System.out.println(obj.getValue1());
            System.out.println(obj.getValue2());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

    }
}
