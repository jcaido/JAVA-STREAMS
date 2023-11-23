package streamcollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorCounting {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aa", "b", "c", "dd");

        long cuenta = list.stream().collect(Collectors.counting());

        System.out.println(cuenta);
    }
}
