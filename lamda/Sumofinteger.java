import java.util.function.BiFunction;


public class Sumofinteger {

    public static void main(String[] args) {


        BiFunction<Integer, Integer, Integer> nigu = (a, b) -> a + b;

        System.out.println(nigu.apply(20,40));
    }

}
