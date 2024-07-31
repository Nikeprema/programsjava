import java.util.function.*;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        Consumer<Integer> c1=(n)-> System.out.println(n);
        c1.accept(99);

        Predicate<Integer> p = (a) -> a > 0;
        System.out.println(  p.test(10));

        Supplier<Integer> supplier=()->10;
        System.out.println(supplier.get());

        Function<Integer,Integer>function=(a)->a*a;
        System.out.println(function.apply(10));

        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a/b;
        System.out.println(biFunction.apply(30,20));
    }
}
