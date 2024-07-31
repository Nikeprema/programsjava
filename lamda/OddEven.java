
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
    public class OddEven {

        public static void main(String[] args) {
            List <Integer>nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);


            System.out.println("Original numbers:"+nums);

            List evennumbers=nums.stream()
                    .filter(n-> n % 2==0)
                    .collect(Collectors.toList());

            System.out.println(evennumbers);

            List oddnumbers=nums.stream()
                    .filter(num->num%2!=0)
                    .collect(Collectors.toList());

            System.out.println(oddnumbers);


        }
    }