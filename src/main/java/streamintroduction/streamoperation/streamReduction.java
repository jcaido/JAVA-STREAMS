package streamintroduction.streamoperation;

import java.util.ArrayList;
import java.util.List;

public class streamReduction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        Integer result = list.stream().reduce(23, (a, b) -> a + b);
        System.out.println(result);
    }
}
