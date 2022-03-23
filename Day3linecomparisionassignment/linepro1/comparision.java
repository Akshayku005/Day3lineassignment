package linepro1;

import java.util.Scanner;

public class comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Welcome to Line Comparsion program");

		    	double x1,x2,y1,y2;
		    Scanner scan= new Scanner(System.in);
		    System.out.println("Enter values for first point");
		    x1= scan.nextDouble();
		    y1=scan.nextDouble();
		    System.out.println("Enter values for second point");
		    x2= scan.nextDouble();
		    y2=scan.nextDouble();
				double lineLenth	=(double)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
				System.out.println( lineLenth);
				scan.close();
		}
	}
