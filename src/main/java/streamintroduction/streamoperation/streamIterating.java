package streamintroduction.streamoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamIterating {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // Stream can be a substitute for loops such as for, for-each, while.
        for (String element: list) {
            if (element.contains("a"))
                System.out.println("true");
        }

        boolean isContain = list.stream().anyMatch(element -> element.contains("a"));
        System.out.println(isContain);
    }
}
