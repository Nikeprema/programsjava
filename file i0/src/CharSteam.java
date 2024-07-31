import java.io.*;

public class CharSteam {

    public static void main(String[] args)throws IOException {
        File n=new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\test1.txt");
        FileReader reader=null;
        try {
            reader=new FileReader(n);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }

        BufferedReader r=new BufferedReader(reader);
        int temp;
        StringBuilder s=new StringBuilder();
        while ((temp=r.read())!=-1){
            System.out.println((char) temp);
            s.append((char) temp);
        }

        s.append("ssss vvvvv bbbbbb");
        System.out.println(s.toString());

        FileWriter writer=new FileWriter("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\output.txt");
        BufferedWriter bw=new BufferedWriter(writer);
        bw.write(String.valueOf(s));

        bw.close();
        writer.close();
    }
}
