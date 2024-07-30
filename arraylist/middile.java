import java.util.Collections;
import java.util.LinkedList;
public class middile{

                   public static void main(String args[]){
				   
				   LinkedList<String> friends=new LinkedList<String>();
				   
				   friends.add("nithis");
				   friends.add("sanjeev");
				   friends.add("srini");
				   friends.add("nigu");
				   friends.add("muguntha");
				   friends.add("pooli");
				   
				   
				   
				   Collections.shuffle(friends);
				   
				   System.out.println(friends);
				   
				   String middile=friends.get(friends.size()/2);
				   
				   System.out.println(middile);
				   
				   
				   }
				   
				}
				   
				   
				   
				   