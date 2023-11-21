
import java.lang.reflect.InvocationTargetException;

import org.json.JSONException;

public class Main {
    public static void main(String args[]) {
        // String json2 = "{\"name\": \"John Doe\", \"age\":
        // 30,\"phoneNo\":\"0923456664\"}";
        // String json = "{\"name\": \"John\", \"age\":20}";
        String json = "{\"name\":\"Paul\",\"age\":20,\"phoneNo\":[\"12345\",\"98765\",\"567890\"]}";
        try {
            Demo obj = ConvertJsonToJava.convertJsonToObj(json, Demo.class);
            System.out.println(obj.name + "  " + obj.age);
        } catch (InstantiationException e) {

            e.printStackTrace();
        } catch (IllegalAccessException e) {

            e.printStackTrace();
        } catch (IllegalArgumentException e) {

            e.printStackTrace();
        } catch (SecurityException e) {

            e.printStackTrace();
        } catch (JSONException e) {

            e.printStackTrace();
        } catch (InvocationTargetException e) {

            e.printStackTrace();
        } catch (NoSuchMethodException e) {

            e.printStackTrace();
        }
    }

}