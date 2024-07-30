public class arraymin{

                         public static void main(String args []){
						 
						 int[] a={10,40,29,78,90};
						 
						 int min=a[0];
						 
						 for(int i=1;i<a.length;i++){
						 
						  if(a[i]<min)
						  
						   {
						      min=a[i];
							  
							}
							
						 }	
							
					    
						System.out.println("the max is"+min);
					}
					}