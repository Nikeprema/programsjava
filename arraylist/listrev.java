import java.util.LinkedList;
import java.util.Iterator;
public class listrev{
	

                      public static void main(String args[]){
					  
					  LinkedList<String> color=new LinkedList<String>();
					  
				   color.add("red");
				   color.add("blue");
				   color.add("pink");
				   color.add("yellow");
				   color.add("green");
				   color.add("black");
				   
				   System.out.println("the colors"+color);
				   
				   Iterator it=color.descendingIterator();
				   
				   System.out.println("reverse order:");
				   
				   while(it.hasNext()){
				   
				       System.out.println(it.next());
					   }
					   
					 

					 } 
				 }  