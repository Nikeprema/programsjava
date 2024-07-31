import java.io.*;
import java.util.Scanner;

public class Fileemty {
    public static void main(String[] args) {
        try {
            checkfilenotempty("text1.txt");
            System.out.println("file not empty");

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (EmptyFileException e){
            System.out.println(e.getMessage());
        }

    }
    public static void checkfilenotempty(String filename) throws FileNotFoundException,EmptyFileException{
        File n=new File("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\exception\\text1.txt");
        Scanner scanner=new Scanner(n);

        if (!scanner.hasNextLine()){
            scanner.close();
            throw new EmptyFileException("file is empty");
        }
        scanner.close();

    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}