import java.util.ArrayList;

public class copylist{
 
                       public static void main (String args[]){
					   
					   ArrayList<String>days=new ArrayList<String>();
					   
					   days.add("1");
					   days.add("2");
					   days.add("3");
					   days.add("4");
					   days.add("5");
					   days.add("6");
					   days.add("7");
					   
					    System.out.println("before"+days);
					   
					   
					   ArrayList<String>names=new ArrayList<String>();
					   
					   names.add("son");
					   names.add("mon");
					   names.add("thu");
					   names.add("wed");
					   names.add("the");
					   names.add("fri");
					   names.add("sat");
					   
					   
					
					  System.out.println("before"+names);
					  
					  
					  
					  Collections.copy(days,names);
					  
					  
					  
					  
					  System.out.println("after"+days);
					  System.out.println("after"+names);
					  
					  }
					  
					  }
					   