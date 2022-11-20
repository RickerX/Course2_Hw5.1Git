import java.util.HashMap;

public class HwOneTaskTree {
    HashMap<String, Integer> code = new HashMap<>();
    public void addCode(String key,Integer value) {
        if (!code.containsKey(key)) {
            code.put(key, value);
        } else {
            int valueMap = code.get(key);
            try {
                if (valueMap == value) {
                    throw new IllegalArgumentException("Значения одинаковые " + code.get(key));
                }
                {
                    code.put(key, valueMap + value);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
