package java语言基础.范型;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by timeloveboy on 16/9/9.
 */
public class Test {
    private static Map<String, Class<? extends MClass>> map = new HashMap<>();

    public static void main(String[] args) {
        NClass n = new NClass();
        map.put("1", (Class<? extends MClass>) n);
    }
}
