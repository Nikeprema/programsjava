import java.util.stream.IntStream;

public class Parallel {
    public static void main(String[] args) {
        Long startime=System.currentTimeMillis();
        Long count= IntStream.range(20_030_000,20_040_000)
                .filter(x->  isPrime(x))
                .parallel()
                .count();

        System.out.println(count);

        Long endtime=System.currentTimeMillis();

        System.out.println((endtime-startime));

        IntStream.range(20_030_000,20_040_000)
                .filter(x->isPrime(x))
                .parallel()
                .forEachOrdered(x-> System.out.println(x));


    }

    private static boolean isPrime(int x) {

        if(x<=1)
            return false;

        for (int i=2;i<x;i++)
            if(x%i==0)
                return false;

        return true;





    }
}
