class friends{

             String name;
			 
			 
			 void college(){
			 
			 System.out.println(" friends");
			 
			 }
}
			 
class nithis extends friends{
	
	       int age;

          void college(){

            System.out.println("my friend");

        }
		}
		
		
public class casting{
  
                 public static void main (String args[]){

                   friends n=new nithis();
				   
				   n.name="SANJEEV";
				   System.out.println(n.name);
				   n.college();
				   
				   
				   nithis c=(nithis)n;
				   
				   
				   
				   c.age=22;
				   c.name="gokul";
				   c.college();
				   
				   
				   System.out.println(c.age);
				   System.out.println(c.name);
				   
				 }
				 
}
				   
				   
				   
				   
		