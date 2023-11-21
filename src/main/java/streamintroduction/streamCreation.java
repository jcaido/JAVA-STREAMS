package streamintroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamCreation {

    public static void main(String[] args) {

        String[] array = new String[] {"a", "b", "c"};

        Stream<String> stream = Arrays.stream(array);

        Stream<String> stream1 = Stream.of("a", "b", "c");

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Stream<String> streamList = list.stream();

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        Stream<Integer> streamInteger = listInteger.stream();

    }
}
