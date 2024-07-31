import java.io.File;

public class FileExists {
    public static void main(String[] args) {
        File niki=new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\abc.txt");
        if(niki.exists()){
            System.out.println("file is exists");
        }
        else {
            System.out.println("file not exists");
        }
    }
}
