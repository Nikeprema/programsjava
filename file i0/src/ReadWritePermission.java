import java.io.File;

public class ReadWritePermission {
    public static void main(String[] args) {

        File niki=new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\abc.txt");

        if(niki.canWrite()){
            System.out.println(niki.getAbsolutePath()+"  can write");
        }
        else {
            System.out.println(niki.getAbsolutePath()+"  can not write");
        }

        if(niki.canRead()){

            System.out.println(niki.getAbsolutePath()+ "  can read");
        }
        else {

            System.out.println(niki.getAbsolutePath()+"  can not read");
        }
    }
}
