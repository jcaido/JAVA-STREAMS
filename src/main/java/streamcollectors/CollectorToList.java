package streamcollectors;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorToList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc", "dd");
        List<String> listResult = list.stream().collect(toList());

        listResult.add("ddd");
        listResult.stream().forEach(element -> System.out.println(element));

        List<String> listUnmodifiable = list.stream().collect(toUnmodifiableList());
        //UnsupportedOperationException
        listUnmodifiable.add("ddd");
        listUnmodifiable.stream().forEach(element -> System.out.println(element));
    }

}
