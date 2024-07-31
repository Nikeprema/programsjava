import java.util.Arrays;
import java.util.List;

public class Averrage {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(2,4,6,7,4,2,40);

        System.out.println(num);


        Double averrege=num.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(averrege);
    }
}
