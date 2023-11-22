package streamcollectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThen {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc", "d");

        list.forEach(element -> System.out.println(element));


        List<String> listUnmodifiable = list.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), element -> Collections.unmodifiableList(element)));

        ////UnsupportedOperationException
        listUnmodifiable.add("fff");

    }
}
