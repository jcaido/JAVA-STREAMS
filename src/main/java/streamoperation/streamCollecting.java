package streamoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamCollecting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        List<String> listUpper = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());

        for (String element: listUpper) {
            System.out.println(element);
        }
    }
}
