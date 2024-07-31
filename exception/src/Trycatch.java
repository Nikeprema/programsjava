public class Trycatch {
    public static void main(String[] args) {

        try {
            int result = divide(5, 3);
            System.out.println("result  " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

        public static int divide(int dividend,int divisior){

            if(divisior==0){
               throw new ArithmeticException("can not divide by zero");
            }
            return dividend/divisior ;
        }




    }

