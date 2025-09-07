package design_pattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery {
    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student student) {
        map.put(key, student);
    }

    public Student get(String key) {
        return map.get(key);
    }
}
