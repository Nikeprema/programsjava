import java.util.Arrays;
import java.util.List;

public class Checkletter {
    public static void main(String[] args) {
        List<String> colors= Arrays.asList("black","blue","yellow","white","pink");

        System.out.println(colors);

        char letter='b';

        long nigu=colors.stream()
                .filter(s->s.startsWith(String.valueOf(letter)))
                .count();
        System.out.println(nigu);

        char letter2='p';

        long niki=colors.stream()
                .filter(s->s.startsWith(String.valueOf(letter2)))
                .count();

        System.out.println(niki);

    }
}
