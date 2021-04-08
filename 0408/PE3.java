class Date{
	int year;
	int month;
	int day;
	public Date(int y, int m, int d) {year = y; month = m; day = d;}
	void print1() {
		System.out.println(year+","+month+","+day);}
	void print2() {
		String Month = "January";
		switch(month) {
			case 1:
				Month = "January";				break;
			case 2:
				Month = "Febrary";				break;
			case 3:
				Month = "March";				break;
			case 4:
			    Month = "April";			    break;
			case 5:
				Month = "May"; break;
			case 6:
				Month = "June"; break;
			case 7:
				Month = "July";break;
			case 8:
				Month = "August";break;
			case 9:
				Month = "September";break;
			case 10:
				Month = "October";break;
			case 11:
				Month = "November";break;
			case 12:
				Month = "December";break;
		}
		System.out.print(Month+" "+day+", "+year);
}
}
public class PE3 {

	public static void main(String[] args) {
		Date day1 = new Date(2012, 7, 5);
		day1.print1();
		day1.print2();
	}
	}
