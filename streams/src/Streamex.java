import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamex {
    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(20,30,40,40,50,60,80);
        List<Integer> list2=List.of(03,10,29,40,20);

        list1.set(0,10);
        System.out.println(list1);

        List<Integer> newlist=new ArrayList<>(list1.size());

        for(int i:list1){
            newlist.add(i*2);
        }

        System.out.println(newlist);

        List<Integer>newlist2=list1.stream().map(x->x*2).collect(Collectors.toUnmodifiableList());
        System.out.println(newlist2);

        String s1=list1.stream().map(x->String.valueOf(x)+" hii ")
                .peek(e-> System.out.println(e))
                .collect(Collectors.joining("||"));

        List<Integer>list3=list1.stream()
                .map(x->x*5)
                .peek(y-> System.out.println(y))
                .filter(x->x>300)
                .peek(y-> System.out.println(y))
                .collect(Collectors.toUnmodifiableList());
        list1.stream().filter(x->x>40).map(y->y/4.5).forEach(System.out::println);

        List<Integer> integerList1 = List.of(50,20,30,80,40,50,25);
        Stream<Integer> sortedList = integerList1.stream().sorted();

        List<Integer> list = sortedList.collect(Collectors.toList());
        System.out.println("sorted list is "+sortedList);

       int sum= IntStream.range(1,100).sum();
        System.out.println(sum);


    }
}
