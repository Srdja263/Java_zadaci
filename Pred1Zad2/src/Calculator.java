import java.util.Scanner;

public class Calculator {
       public static void main(String args[]) {
    	double num1,num2,result;
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Unesi prvi broj");  
        num1=scanner.nextDouble();
        System.out.println("Unesi drugi broj"); 
        num2=scanner.nextDouble();
       
        System.out.println("Unesi kod operacije (s-sabiranje,o-oduzimanje,m-mnozenje,d-deljenje)");
        Scanner scanner1 = new Scanner(System.in);
       
    	char kod = scanner1.next().charAt(0);
    	 scanner.close();
    	 scanner1.close();
    	 switch(kod)
    	 {
    	 case 's':
    		 result=num1+num2;
    		 break;
    	 case 'o':
    		 result=num1-num2;
    	     break;
    	 case 'm':
    		 result=num1*num2;
    		 break;
    	 case 'd':
             if (num2!=0){
                 result=num1/num2;
             }else {
                System.out.println("Deljenje sa nulom nije dozvoljeno");
                    return;
             }
    	     break;
    	     default:
    	    	 System.out.println("Uneli ste pogresan kod");
    	    	 return;
    	     
    	 }
    	 System.out.println(result);
       }
}
