import java.util.*;

public class HwTwoTaskOne {
    private final static Random RANDOM = new Random();
    final Map<String, List<Integer>> task = new HashMap<>();

    public HwTwoTaskOne() {
        for (int i = 0; i < 5; i++) {
            task.put(String.valueOf(i), generateList());
        }
    }

    public Set<Map.Entry<String, List<Integer>>> getMap() {
        return task.entrySet();
    }

    public Map<String, Integer> getCollection() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : task.entrySet()) {
            int sum = 0;
            for (Integer number : entry.getValue()) {
                sum += number;
            }
            result.put(entry.getKey(), sum);
        }
        return result;
    }

    private List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt(1001));
        }
        return list;
    }
}
