import java.util.Scanner;
public class Student {
      public static void main(String args[]) {
    	  Scanner scanner = new Scanner(System.in); 
          System.out.println("Unesi broj studenata ");
          int a = scanner.nextInt();
          String studenti[]=new String[a];
          int bodovi[]=new int[a];
          Scanner scanner1 = new Scanner(System.in);
          System.out.println("Unesi imena studenata");
          for(int i=0;i<a;i++) {
          
          studenti[i] = scanner1.nextLine();
          }
          System.out.println("Unesi njihov broj bodova redom");
          for(int j=0;j<a;j++) {
              
              bodovi[j] = scanner1.nextInt();
              }
          scanner1.close();
          int max = bodovi[0];
  		int index = 0;

  		for (int k = 0; k < bodovi.length; k++) 
  		{
  			if (max < bodovi[k]) 
  			{
  				max = bodovi[k];
  				index = k;
  			}
                   
              }
  		System.out.println("Najveci broj poena na testu ima:");
        System.out.println(studenti[index]);
      }}
      
