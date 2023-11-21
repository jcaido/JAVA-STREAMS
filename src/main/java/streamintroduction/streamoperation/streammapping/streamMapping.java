package streamintroduction.streamoperation.streammapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class streamMapping {

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

        Stream<String> stream = vegetables.stream().map(element -> element.toUpperCase());

        stream.forEach(element -> System.out.println(element));



        // flatMap()

        Food menu = new Food();
        menu.setName("food1");
        List<String> dishes = new ArrayList<>();
        dishes.add("dish1");
        dishes.add("dish2");
        dishes.add("dish3");
        menu.setDishes(dishes);

        List<Food> menus = new ArrayList<>();
        menus.add(menu);

        Stream<String> streamNames = menus.stream().flatMap(element -> element.getDishes().stream());
        streamNames.forEach(element -> System.out.println(element));

    }
}
