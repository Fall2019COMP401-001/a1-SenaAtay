package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int productsandprices = scan.nextInt();
		String [] productname = new String[productsandprices];
		int [] numberofpeople = new int[productsandprices]; 
		int [] numberofproducts = new int[productsandprices]; 
		
		for(int i=0;i<productsandprices;i++) {
			productname[i] = scan.next();
			scan.nextDouble();
		}
		
		int ningredient;
		String ingredient;
		int ingredientcount;
		
		int ncustomers = scan.nextInt();
		for(int i=0;i<ncustomers;i++) {
			scan.next();
			scan.next();
			ningredient = scan.nextInt();
			for(int j=0;j<ningredient;j++) {
				ingredientcount = scan.nextInt();
				ingredient= scan.next();
				for(int k=0;k<productsandprices;k++) {
					if (ingredient.equals(productname[k])) {
					numberofpeople[k]++;
					numberofproducts[k] = numberofproducts[k] + ingredientcount;
					}
				}		
			}
		}
		for(int m=0;m<productsandprices;m++) {
			if (numberofpeople[m] == 0) {
				System.out.println("No customers bought " + productname[m]);
			} else {
				System.out.println(numberofpeople[m] + " customers bought " + numberofproducts[m] + " " + productname[m]);
			}
		}
	}
}

