package streamcollectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorToSet {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "bb", "ccc", "dd", "a", "ccc");
        Set<String> set = list.stream().collect(Collectors.toSet());

        set.forEach(element -> System.out.println(element));

        Set<String> setUnmodifiable = list.stream().collect(Collectors.toUnmodifiableSet());
        //UnsupportedOperationException
        setUnmodifiable.add("ff");
        setUnmodifiable.forEach((element -> System.out.println(element)));
    }
}
