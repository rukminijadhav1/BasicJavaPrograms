package ramSirSession;

import java.util.Scanner;

public class SquareRootofNumber {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        double num = sc.nextDouble();
	        double sqrt = squareRoot(num);
	        System.out.println("Square root of " + num + " is " + sqrt);
	    }

	    public static double squareRoot(double num) {
	        double sqrt = num / 2;
	        double temp = 0;

	        while (sqrt != temp) {
	            temp = sqrt;
	            sqrt = (num / temp + temp) / 2;
	        }

	        return sqrt;
	    }
	}


