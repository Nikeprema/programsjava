import java.util.*;

public class Duplicatenumber {
    public static void main(String[] args) {
        try{
            List<Integer> numbers=readnmubers();
            checkduplacate(numbers);
            System.out.println("no");

       }catch (Duplicate_Number_Exception e){
            System.out.println(e.getMessage());
        }


    }

    public static List<Integer>readnmubers() {
        List<Integer> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("how many numbers");

        int count = in.nextInt();

        System.out.println("enter the nmuber");

        for (int i = 0; i < count; i++) {
            int num = in.nextInt();
            numbers.add(num);
        }


        return numbers;
    }

    public static void checkduplacate(List<Integer> numbers) throws Duplicate_Number_Exception{

        Set<Integer> unic=new HashSet<>();

        for (int num:numbers){
            if (unic.contains(num)){
                throw new Duplicate_Number_Exception("duplicate number found  " + num);
            }

            unic.add(num);
        }
    }
}

class Duplicate_Number_Exception extends Exception{
    public Duplicate_Number_Exception(String message){
        super(message);
    }
}