import java.util.Scanner;
public class Parni_brojevi {
      public static void main(String args[]) {
    	  int a,b;
    	  Scanner scanner = new Scanner(System.in); 
          System.out.println("Unesi prvi broj ");
          a=scanner.nextInt();
          System.out.println("Unesi drugi broj ");
          b=scanner.nextInt();
          scanner.close();
    	  while (a<b) { 
    	   if (a%2==0)
    		  System.out.println(a);
    		  a=a+1;
    		
    	  }
    	 
      }
}