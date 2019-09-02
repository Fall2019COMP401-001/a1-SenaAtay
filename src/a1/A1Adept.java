package a1;

import java.util.Scanner;


public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int productsandprices;
		int numberofpeople;
		String firstname;
		String lastname;
		int numberofproductsperperson;
		int numberofspecificproduct;
		String theproduct;
		int ind4product;
		String biggestpersonfirstname = null;
		String biggestpersonlastname = null;
		String smallestpersonfirstname = null;
		String smallestpersonlastname = null;
		Double biggest = 0.0;
		Double smallest = 100.0;
		Double mtotalcost = 0.0;

		productsandprices = scan.nextInt();
		String[] products = new String[productsandprices];
		Double[] prices = new Double[productsandprices];
		for(int i=0;i<productsandprices;i++) {
			products[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		numberofpeople = scan.nextInt();
		for(int j=0;j<numberofpeople;j++) {
			firstname = scan.next();
			lastname = scan.next();
			numberofproductsperperson = scan.nextInt();
			Double totalcost = 0.0;
			for(int k=0;k<numberofproductsperperson;k++) {
				numberofspecificproduct = scan.nextInt();
				theproduct = scan.next();
				ind4product=0;
				for (int ind=0; ind<products.length; ind++) {
					if (products[ind].equals(theproduct))
						ind4product=ind;	
				}
				Double priceofspecificproduct = prices[ind4product];
				totalcost = totalcost + (numberofspecificproduct*priceofspecificproduct);
			}
			mtotalcost = mtotalcost + totalcost;

				if (totalcost > biggest) {
					biggestpersonfirstname = firstname;
					biggestpersonlastname = lastname;
					biggest = totalcost;
				}
				if (totalcost < smallest) {
					smallestpersonfirstname = firstname;
					smallestpersonlastname = lastname;
					smallest = totalcost;
				}
			}
		System.out.println("Biggest: " + biggestpersonfirstname + " "  + biggestpersonlastname + ": " + "(" + biggest + ")");
		System.out.println("Smallest: " + smallestpersonfirstname + " "  + smallestpersonlastname + ": " + "(" + smallest + ")");
		System.out.printf("Average: %.2f %n", mtotalcost/numberofpeople);
		
		}
	}

