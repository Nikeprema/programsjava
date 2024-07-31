import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AssendingDessending {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

        List<String> assending = colors.stream()
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        List<String> dessending = colors.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(assending);
        System.out.println(dessending);


    }

}

