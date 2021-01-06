import java.util.Scanner
public class LeapYear {
	public static int year;

	public static boolean isLeapYear(int year) {
		if (((year % 4) == 0) && ((year % 100) != 0))
			return true;
		else if ((year % 400) == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year");
		year = sc.nextInt();
		sc.close();
		System.out.println(isLeapYear(year));
	}

}