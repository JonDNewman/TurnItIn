package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test
{
    public static void main(String[] args)
    {
        String str = args[0];
        Arrays.asList(str.split(" ")).stream().filter(a -> !a.equals("")).collect(Collectors.groupingBy(Function
                .identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(
                        k -> System.out.println(k.getKey() + " " + k.getValue()));

    }
}
