package ramSirSession;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year");
		int year=scan.nextInt();
		
		boolean isleapyear=false;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					isleapyear=true;
				}
			}
			else {
				isleapyear=true;
			}
		}
		if(isleapyear) {
			System.out.println(year + "is leap year");
		}
		else {
			System.out.println(year +"not leap year");
		}
	}
	
}
