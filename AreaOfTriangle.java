package ramSirSession;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter base oftriagle");
		double base=scan.nextDouble();
		System.out.println("enter height");
		double height=scan.nextDouble();
		double area=0.5*base*height;
		System.out.println(area);
	}

}
