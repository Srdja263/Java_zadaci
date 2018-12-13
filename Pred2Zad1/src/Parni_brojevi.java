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
		if(a<b) {
			while (a<b) { 
				if (a%2==0)
					System.out.println(a);
				a=a+1;
			}

		}
		else if (a>b) {
			while(a>b) {
				if (b%2==0)
					System.out.println(b);
				b=b+1;

			}
		} 
		else 
			System.out.println("Uneli ste dva ista broja");
	}
}
