import java.util.Arrays;
import java.util.List;

public class SecondLargeSmall {
    public static void main(String[] args) {

        List<Integer> nigu= Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);

        Integer large=nigu.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        Integer small=nigu.stream()
                .distinct()
                .sorted((a,b)->Integer.compare(b,a))
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(large);
        System.out.println(small);

    }
}
