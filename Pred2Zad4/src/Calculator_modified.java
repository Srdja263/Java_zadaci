import java.util.Scanner;

public class Calculator_modified {
	public static void main(String args[]) {
		double num1,num2;	
		Scanner scanner = new Scanner(System.in);
		
		boolean dalje = true; 
		
		do {
			System.out.println("Unesi prvi broj");  
			num1=scanner.nextDouble();
			System.out.println("Unesi drugi broj"); 
			num2=scanner.nextDouble();

			System.out.println("Unesi kod operacije (s-sabiranje,o-oduzimanje,m-mnozenje,d-deljenje)");

			char kod = scanner.next().charAt(0);


			switch(kod)
			{
			case 's':
				sabiranjeBroja(num1,num2);
				break;
			case 'o':
				oduzimanjeBroja(num1,num2);
				break;
			case 'm':
				mnozenjeBroja(num1,num2);
				break;
			case 'd':	
				deljenjeBroja(num1,num2);
				break;

			default:
				System.out.println("Uneli ste pogresan kod");
				dalje = false;
			
			}
		}while(dalje);

		scanner.close();





	}
	public static double sabiranjeBroja(double a,double b) {
		double c=a+b;
		System.out.println(c);
		return c;

	}

	public static double oduzimanjeBroja(double a,double b) {
		double c=a-b;
		System.out.println(c);
		return c;		 
	}
	public static double mnozenjeBroja(double a,double b) {
		double c=a*b;
		System.out.println(c);
		return c;		 
	}
	public static double deljenjeBroja(double a,double b) {
		double c = 0;
		if (b!=0) 
			c=a/b;

		else {
			System.out.println("Nije dozvoljeno deljenje nulom");
		}System.out.println(c);
		return c;		 
	}

} 
