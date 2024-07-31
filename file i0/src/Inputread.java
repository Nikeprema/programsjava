import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputread {
    public static void main(String[] args)throws IOException {
        BufferedReader r=new BufferedReader(  new InputStreamReader(System.in));
        System.out.println("enter your name: ");
        String s=r.readLine();
        System.out.println("your name is "+s);
    }
}
