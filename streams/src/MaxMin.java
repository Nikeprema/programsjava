import java.util.Arrays;
import java.util.List;

public class MaxMin {

    public static void main(String[] args) {
        List<Integer> nigu= Arrays.asList(23,675,453,56,21,45,67,89,9);

        System.out.println(nigu);

        Integer Max=nigu.stream()
                .max(Integer::compareTo)
                .orElse(null);

        Integer min=nigu.stream()
                .min(Integer::compareTo)
                .orElse(null);


        System.out.println(Max);
        System.out.println(min);
    }
}
