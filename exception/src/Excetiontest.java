public class Excetiontest {
    public static void main(String[] args) {
        System.out.println("after try");

        try {
            int result = exceptionnothandle();
        } catch (ArithmeticException e) {
            System.out.println("first");
        }


        int val = exceptionhandle();

        System.out.println(val);

    }





    public static int exceptionnothandle() {

        int a = 10 / 0;

        return 0;
    }

    public static int exceptionhandle(){

        try {
            int d = 10 / 0;
        }catch (ArithmeticException e){

            System.out.println("exceptionhandle method");
        }finally {
            System.out.println("finaly exception handled");
        }

             return 0;
        }

}
