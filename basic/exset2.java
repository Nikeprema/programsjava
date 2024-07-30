import java.util.*;
import java.util.Iterator;
public class exset2{

               public static void main(String args[]){
			   
			   HashSet<String> nigu=new HashSet<>();
			   
			   nigu.add("red");
			   nigu.add("blue");
			   nigu.add("whitle");
			   nigu.add("black");
			   nigu.add("rose");
			   nigu.add("yellow");
			   
			   System.out.println("original set"+nigu);
			  
			   



                Iterator<String> n=nigu.iterator();
					  
					 while(n.hasNext()){
					 
					  System.out.println(n.next());
					 
					 }
					 
					 
					 
					 
					 }
					 
					 }