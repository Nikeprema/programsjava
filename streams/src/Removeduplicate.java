import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicate {
    public static void main(String[] args) {
        List<Integer>nigu= Arrays.asList(1,2,3,3,4,4,5,5,6,7,8);

        System.out.println(nigu);

        List<Integer>duplicate=nigu.stream()
                .distinct()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(duplicate);
    }
}
