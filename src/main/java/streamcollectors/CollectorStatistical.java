package streamcollectors;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorStatistical {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aa", "b", "c", "dd");

        DoubleSummaryStatistics result = list.stream().collect(Collectors.summarizingDouble(element -> element.length()));
        System.out.println(result.getAverage());
        System.out.println(result.getCount());
        System.out.println(result.getMax());
        System.out.println(result.getMin());
        System.out.println(result.getSum());

        Double result1 = list.stream().collect(Collectors.averagingDouble(String::length));
        System.out.println(result1);

        Double result2 = list.stream().collect(Collectors.summingDouble(String::length));
        System.out.println(result2);

        
    }
}
