public class Evenodd {
    public static void main(String[] args) {
        int n = 20;

        trynumber(n);

        n = 5;

        trynumber(n);

    }

    public static int trynumber(int n) {
        try {
            checkEven(n);
            System.out.println(n+"  is even");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }




    public static int checkEven(int number) {
        if (number % 2 != 0) {

            throw new IllegalArgumentException(number + "  is odd");


        }
        return 0;
    }

}
