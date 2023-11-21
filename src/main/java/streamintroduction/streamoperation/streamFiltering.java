package streamintroduction.streamoperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamFiltering {

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();
        vegetables.add("spinach");
        vegetables.add("carrots");
        vegetables.add("onions");
        vegetables.add("cucumbers");
        vegetables.add("tomatoes");
        vegetables.add("potatoes");
        vegetables.add("green beans");
        vegetables.add("peas");

        vegetables.stream().filter(element -> element.contains("c")).forEach(element -> System.out.println(element));
    }
}
