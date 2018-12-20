import java.util.Arrays;
import java.util.Scanner;

public class Prvih5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesi broj clanova niza ne manje od 5 ");
		int n = input.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Unesi clan niza");
			a[i] = input.nextInt();
		}
		Arrays.sort(a); 
		System.out.printf("Uredjen niz je[] : \n%s\n", 
				Arrays.toString(a)); 

		System.out.print("Unesi broj da bismo proverili da li je u nizu ");
		int x = input.nextInt();
		int pos=0;
		boolean found=false;
		while(pos<a.length && !found) {
			if(a[pos]==x) {
				found=true;
			}
			else {
				pos++;
			}
		}
				if(found) {
					System.out.println("Broj se nalazi u nizu");
				}
				else {
					System.out.println("Broj se ne nalazi u nizu");
				}
			
				System.out.println("Prvih 5 clanova niza je:");	
	for (int i=0; i<5; i++) {
		
	    System.out.print(a[i]+",");
	}

		
	}
}






