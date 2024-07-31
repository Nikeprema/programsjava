import java.util.Arrays;
import java.util.List;

public class Flat {

    public static void main(String[] args) {
        List<Integer> prime= Arrays.asList(7,9,11,13);

        List<Integer>odd=Arrays.asList(1,3,5,7);

        List<Integer> even=Arrays.asList(2,4,6,8);

        List<List<Integer>> alllist=Arrays.asList(prime,odd,even);

        System.out.println(alllist);

        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

        // Finding sum of all elements
        int sum = array.stream().reduce(0,
                (element1, element2) -> element1 + element2);

        System.out.println(sum);

    }
}
