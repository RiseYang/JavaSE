package utils;

import java.util.Set;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @className: JsonToJavaField
 * @author: yang
 * @date: 2025/2/15 13:35
 * @Version: 1.0
 * @description: JSON 字符串中的字段名转换为 Java 字段的形式
 */
public class JsonToJavaField {
    public static void main(String[] args) {

        String str = "{\n" +
                "  \"after_value\": {\n" +
                "    \"first_name\": \"John\",\n" +
                "    \"last_name\": \"Doe\"\n" +
                "  }\n" +
                "}";
 /*       JSONObject ob = JSONObject.parseObject(str);
        JSONObject after_value = ob.getJSONObject("after_value");
        System.out.println(JSON.toJSONString(ob, SerializerFeature.WriteMapNullValue));
        System.out.println("================分割线=================");
        Set<String> strings = after_value.keySet();
        for (String string : strings) {
            System.out.println("@JSONField(name=\"" + string + "\")");
            System.out.println("private String" + toCamelCase(string) + ";");
            System.out.println("");
        }

  */
    }

    public static String toCamelCase(String str) {
        if (str == null)
            return null;
        StringBuilder sb = new StringBuilder();
        boolean capitalize = false;
        for (char c : str.toCharArray()) {
            if (c == '_') {
                capitalize = true;
            } else if (capitalize) {
                sb.append(Character.toUpperCase(c));
                capitalize = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }

        }
        return sb.toString();
    }
}