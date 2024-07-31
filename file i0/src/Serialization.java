import java.io.*;

      class demo implements java.io.Serializable {
        public int a;

        public String b;

        public transient int c;




        public demo(int a, String b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public String toString() {
            return "Demo{" +
                    "a=" + a +
                    ", b='" + b + '\'' +
                    ", c='" + c + '\'' +
                    '}';

        }


    }


    public class Serialization {
        public static void main(String[] args) throws IOException, ClassNotFoundException {

            demo d = new demo(1, "test",100);

            FileOutputStream file = new FileOutputStream("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\output.txt");
            BufferedOutputStream bf = new BufferedOutputStream(file);
            ObjectOutputStream ob = new ObjectOutputStream(bf);

            ob.writeObject(d);

            ob.close();
            file.close();

            System.out.println(d);
            System.out.println("file has serialized");

            FileInputStream fis = new FileInputStream("C:\\Users\\NIKESH\\Desktop\\livewire\\advanced-java\\untitled\\file i0\\output.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            System.out.println("deserialized");
            demo d1 = (demo) ois.readObject();
            System.out.println(d1);
        }






    }








