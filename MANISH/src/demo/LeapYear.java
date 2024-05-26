package demo;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2017;
		if((a%400==0)||(a%4==0 && a%100!=0)) {
			System.out.println("a is leap year");
		}
		else {
			System.out.println("a isn't leap year");
		}
	}

}
