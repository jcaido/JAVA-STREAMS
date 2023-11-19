package streamoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamOperations {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");

        for (String element: list) {
            System.out.println(element);
        }

        long count = list.stream().distinct().count();
        System.out.println(count);

        //Operations on streams don't change the source
        for (String element: list) {
            System.out.println(element);
        }
    }
}
