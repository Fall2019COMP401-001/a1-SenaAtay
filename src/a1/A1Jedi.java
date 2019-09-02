package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int productsandprices;
		int ningredient;
		String ingredient;
		
		
		productsandprices = scan.nextInt();
		String [] name = new String[productsandprices];
		int [] customercount = new int[productsandprices]; 
		int [] itemcount = new int[productsandprices]; 
		
		for(int i=0;i<productsandprices;i++) {
			name[i] = scan.next();
			scan.nextDouble();
		}
		int ingredientcount;
		
		int ncustomers = scan.nextInt();
		for(int i=0;i<ncustomers;i++) {
			scan.next();
			scan.next();
			ningredient = scan.nextInt();
			for(int j=0;j<productsandprices;j++) {
				ingredientcount = scan.nextInt();
				ingredient= scan.next();
				for(int k=0;k<productsandprices;k++) {
					if (ingredient.equals(name[k]));
					customercount[k]++;
					itemcount[k] = itemcount[k] + ingredientcount;
				}		
			}
		}
		for(int i=0;i<productsandprices;i++) {
			if (customercount[i] == 0) {
				System.out.println("No customers bought " + name[i]);
			} else {
				System.out.println(customercount[i] + "customers bought " + itemcount + " " + name[i]);
			}
		}
	}
}
