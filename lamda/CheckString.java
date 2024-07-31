import java.util.function.Predicate;

public class CheckString {
    public static void main(String[] args) {

        String n="";
        Predicate<String> nigu=str ->str.isEmpty();

        if(nigu.test(n)){

            System.out.println("the string is empty");

            }
        else{

            System.out.println("string is not empty");
        }
    }
}
