import java.util.Arrays;
import java.util.List;

public class Strlower {

    public static void main(String[] args) {


        List<String> Strignlist = Arrays.asList("Red", "Blue", "Green", "BLACK");

        System.out.println(Strignlist);


        Strignlist.replaceAll(Str->Str.toLowerCase());

        for(String Str:Strignlist) {

            System.out.println(Str);
        }




        Strignlist.replaceAll(Str->Str.toUpperCase());

           for(String Str:Strignlist) {

               System.out.println(Str);
           }



    }


}