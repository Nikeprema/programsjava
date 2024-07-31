import java.util.Arrays;
import java.util.List;

public class OddEven {

    public static void main(String[] args) {
        List<Integer> numers= Arrays.asList(1,2,3,4,5,6,7,8,9);

        int even=numers.stream()
                .filter(num->num %2==0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(even);


        int odd =numers.stream()
                .filter(num->num %2!=0)
                .mapToInt((Integer::intValue))
                .sum();

        System.out.println(odd);


    }
}
