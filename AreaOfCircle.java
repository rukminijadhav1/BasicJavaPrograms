package ramSirSession;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
        double radius, area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }

}
