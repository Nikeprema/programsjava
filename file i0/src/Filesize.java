import java.io.File;

public class Filesize {
    public static void main(String[] args) {
        File niki=new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\abc.txt");

        if(niki.exists()) {


        }
        else {
            System.out.println("file not exists");
        }

        System.out.println(niki.length()+"  BYTE");

        System.out.println(niki.length()/1024+" KB");

        System.out.println(niki.length()/(1024*1024)+"  MP");






    }

}


