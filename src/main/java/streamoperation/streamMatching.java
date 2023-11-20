package streamoperation;

import java.util.ArrayList;
import java.util.List;

public class streamMatching {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Marco");
        list.add("Franck");
        list.add("Albert)");
        list.add("Cris");

        boolean result = list.stream().anyMatch(element -> element.contains("c"));
        boolean result1 = list.stream().allMatch(element -> element.contains("F"));
        boolean result2 = list.stream().noneMatch(element -> element.contains("w"));
        System.out.println(result + " " + result1 +  " " + result2);
    }
}
