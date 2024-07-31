import java.io.*;

public class Bytestream {
    public static void main(String[] args) throws IOException {

        BufferedOutputStream bo = null;
        BufferedInputStream bi = null;
        FileOutputStream fo = null;

        System.out.println("hello");


        try {

            File file = new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\img.png");
            FileInputStream in = new FileInputStream(file);

            bi = new BufferedInputStream(in);
            long size = file.length();
            byte[] temp = new byte[(int) size];
            bi.read(temp);


            File output = new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\img.jpg");
            fo = new FileOutputStream(output);
            bo = new BufferedOutputStream(fo);
            bo.write(temp);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bi.close();
            fo.close();
            bo.close();

        }
    }

}





