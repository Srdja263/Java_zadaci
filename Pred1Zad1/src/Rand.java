import java.util.Random;
import java.util.Scanner;
	public class Rand {
	       public static void main(String args[]) {
	    	   int num1,value2,diff; 
	    	   Random rand = new Random(); 
	    	   int value = rand.nextInt(51);
	    	   System.out.println("Unesi broj od 1-50"); 
	    	   Scanner scanner = new Scanner(System.in);
	           num1=scanner.nextInt();
	           System.out.println("Nasumicni broj je:");
	           System.out.println(value);
	           scanner.close();
	          value2=value;
	          diff=value2-num1;
	          if (value2==num1) 
	    	  System.out.println("Bravo,pogodak!!!");
	          else if (Math.abs(diff)<=5) 
	        	  System.out.println("Bili ste blizu");
	          else if (Math.abs(diff)>5) 
	        	  System.out.println("Vise srece sledeci put");
}

		
}