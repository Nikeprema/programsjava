import java.util.ArrayDeque;
import java.util.Queue;
public class queue{

        public static void main(String args[]){
		
		Queue<Integer> n1=new ArrayDeque<>();
		
		n1.add(1);
		n1.add(2);
		n1.add(3);
		n1.add(4);
		n1.add(5);
		
		System.out.println(n1);
		
		System.out.println("peek:"+n1.peek());
		
		n1.poll();
		
		System.out.println(n1);
		
		}
		
		}
		


