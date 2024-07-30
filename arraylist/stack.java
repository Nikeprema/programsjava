import java.util.Stack;
public class stack{

                     public static void main(String args[]){
					 
					 Stack<Integer> n1=new Stack<Integer>();
					 
					 n1.push(1);
					 n1.push(2);
					 n1.push(3);
					 n1.push(4);
					 n1.push(5);
					 
					 System.out.println(n1);
					 
					 System.out.println("peek:"+n1.peek());
					 
					 
					 
					 System.out.println("pop "+n1.pop());
					 System.out.println(n1);
					 
					 for(int i=0;i<n1.capacity();i++){
						 
						 if(!n1.empty()){
							 
							 System.out.println(n1.pop());
						 }
					 }
			 }
					 
	 }
					 
					 
					 
					 
                        