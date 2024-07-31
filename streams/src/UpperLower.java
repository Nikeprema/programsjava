import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLower {

    public static void main(String[] args) {
        List<String>colors= Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        List<String> Upper=colors.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(Upper);


        List<String> Lower=colors.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(Lower);
    }
}
