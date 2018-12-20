import java.util.Random;
import java.util.Scanner;
public class Random_modified {
	
	
			public static void main(String args[]) {			 
				Random rand = new Random(); 
				int value = rand.nextInt(51);
				System.out.println("Unesi broj od 1-50"); 
				Scanner scanner = new Scanner(System.in);		
		        int num=scanner.nextInt();
				int c=kodRazlike(value,num);
				
				if (c==0){
				System.out.println("Pogodak!!!");
				}
			
				else if (c==1){
				System.out.println("Bili ste blizu");
				}
			
				else while (c==2) {
					
			        
			        	System.out.println("Pokusajte ponovo,unesite opet broj");
						Scanner scanner1 = new Scanner(System.in);		
				        int num1=scanner1.nextInt();
			        	if (num1==value) {
			        		System.out.println("Pogodak!!!");
			        		break;
			        	}
			        	else if (kodRazlike(value,num1)==1) {
			        		System.out.println("Bili ste blizu");
			        		break;
			        		}
			        	else if (kodRazlike(value,num1)==1) {
			        		continue;
			        			}   
				}			        
				}
			
			
		public static int kodRazlike(int a,int b) {
			int kod = 0;
			if (a==b)
					kod= 0;
			
			if (Math.abs(a-b)<=5)
			kod= 1;
			
			if (Math.abs(a-b)>5)
			kod= 2;
			
			return kod;
			 
		}
		
}
