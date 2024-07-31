import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) {
        String path="C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\append.txt";
        String text="hello world";

        try{
            FileWriter fw=new FileWriter(path,true);
                    fw.write(text);
                    fw.close();

        }catch (IOException e){

        }

        System.out.println(text);
    }
}
