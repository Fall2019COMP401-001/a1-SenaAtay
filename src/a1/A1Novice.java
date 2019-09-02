package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String fname;
		String lname;
		String pname;
		int numberofproducts = 0;
		int pnumber = 0;
		double pcost = 0;
		double totalcost;

		int numberofpeople = scan.nextInt();
		for(int i=0;i<numberofpeople;i++) {
			fname = scan.next();
			lname = scan.next();
			totalcost = 0;
			numberofproducts = scan.nextInt();
			for(int a=0;a<numberofproducts;a++) {
				pnumber = scan.nextInt();
				pname = scan.next();
				pcost = scan.nextDouble();
				totalcost = totalcost + pnumber*pcost;
			}	
			System.out.println(fname.charAt(0) + ". " + lname + ": " + totalcost);
		}	
	}
}
