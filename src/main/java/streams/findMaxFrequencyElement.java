package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findMaxFrequencyElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Mote Book", "Pencil");

        Map.Entry<String, Long> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(result);

        Map<String, Long> frequencymap = list.stream()
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencymap);
    }
}
