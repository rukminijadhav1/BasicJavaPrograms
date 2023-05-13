package ramSirSession;

import java.util.Scanner;

public class AreaOfRectange {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter height");
		double height=scan.nextDouble();
		System.out.println("eneter width");
		double width=scan.nextDouble();
		double area=width*height;
		System.out.println(area);
		}

}
