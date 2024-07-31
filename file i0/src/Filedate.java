import java.io.File;
import java.util.Date;

public class Filedate {
    public static void main(String[] args) {
        File nike=new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\abc.txt");
        Date date=new Date(nike.lastModified());
        System.out.println(date);
    }
}
