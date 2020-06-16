package Practice;

import Shape.Person;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonNodeTest {
    public static void main(String[] args) throws IOException {
        String json = "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}";
        ObjectMapper om = new ObjectMapper();
        JsonNode jsonNode = om.readTree(json);
        String str = "split this k"+(char)007+"y string k"+(char)007+"y ";
//        System.out.println(str.split(" k"+(char)007+"y ",0).length);

        Map<String, JsonNode> map = new HashMap<>();
        Person p = new Person();
        p.setName("YaoZzz");
        map.put("person", om.valueToTree(p));

        ObjectNode objectNode = om.createObjectNode();
        objectNode.putPOJO("key1", "test1");
        objectNode.putPOJO("key2","POJO2");

        map.put("pojo", objectNode);

        long num = 1_0_0_000_0;
        System.out.println(num);

    }
}
