package streamcollectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorToMap {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "bb", "ccc", "d");
        Map<String, Integer> map1 = list.stream()
                .collect(Collectors.toMap(Function.identity(), element -> element.length()));

        for (Map.Entry entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //duplicates values
        List<String> listDuplicatesValues = Arrays.asList("a", "bb", "ccc", "d", "bb");
        Map<String, Integer> map = listDuplicatesValues.stream()
                .collect(Collectors.toMap(Function.identity(), element -> element.length(), (item, identicalItem) -> item));

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //UnsupportedOperationException
        List<String> listUnmodifiable = Arrays.asList("a", "bb", "ccc", "d");
        Map<String, Integer> map2 = list.stream()
                .collect(Collectors.toUnmodifiableMap(Function.identity(), element -> element.length()));

        map2.put("lll", 3);
    }
}
