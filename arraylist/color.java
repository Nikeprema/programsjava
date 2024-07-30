import java.util.*;
import java.util.ArrayList;

public class color{
                
				 public static void main(String args[]){
					 
					 Scanner in=new Scanner(System.in);
					 System.out.println("enter the color");
					 String n=in.nextLine();
 
                  ArrayList<String> colors=new ArrayList<String>();

                   colors.add("red");
				   colors.add("blue");
				   colors.add("pink");
				   colors.add("yellow");
				   colors.add("green");
				   colors.add("black");
				   
				   
				   System.out.println("colors = "+colors);
				   
				   if(colors.contains(n)){
					   
					   System.out.println("it is available");
					   
				   }
				   
				   else{
					   
					   System.out.println("it is not available");
				   }
				   
				   Collections.shuffle(colors);
				   System.out.println("colors = "+colors);
				   
				   
				   }
				   
				   }				   