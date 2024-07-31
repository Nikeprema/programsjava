import java.io.File;

public class Filelist {
    public static void main(String[] args) {
        File niki=new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\src");
        String[] filelist=niki.list();


        System.out.println(filelist);
    }
}
