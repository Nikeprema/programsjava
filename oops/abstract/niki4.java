abstract class member{

       String name;
	   
	   abstract void welcome();
}
	   
	   
	   
	 class student extends member{

           	 void welcome(){
			 
			 System.out.println("hello student");
			 
			 }
	 }
			 
	class teacher  extends member{
        
               void welcome(){

                       System.out.println("hello teacher");
					   
					   }
	}
					   
public class niki4{

                       public static void main (String args[]){

                        student s1=new student();
                        teacher t1=new teacher();

                        s1.welcome();
                        t1.welcome();

}

}						
					   