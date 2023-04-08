package day.of.week;
enum DayOfWeek{
	SUN("sunday",1),MON("monday",2),TUE("tuesday",3),WED("wednesday",4),THU("thursday",5),FRI("friday",6),SAT("saturday",7);

	String dayName;
	int day_of_week;
	DayOfWeek(String string, int i) {
	this.dayName=string;
	this.day_of_week=i;
	}
	public int getday_of_week(){
		
		return day_of_week;
	}
	public String getDayName() {
		return dayName;
		
	}
	
}
public class DayOfWeek_main {
	static void printDay(DayOfWeek x) {
		
		System.out.println(x.getDayName()+" "+x.getday_of_week());
	}
	
	static int getNextDay(DayOfWeek x) {
		DayOfWeek arr[]= DayOfWeek.values();
	return arr[x.ordinal()+1].getday_of_week();	
	}
	
	static DayOfWeek[] getWeekendDays() {
		DayOfWeek []arr=DayOfWeek.values();
		DayOfWeek[]arr2=new DayOfWeek[2];
		arr2[0]=arr[0];
		arr2[1]=arr[6];
		return arr;
	}

	public static void main(String[] args) {
		
		DayOfWeek []arr=DayOfWeek.values();
		
		printDay(arr[0]);
		
		int x=getNextDay(arr[0]);
		System.out.println(x);
		DayOfWeek []arr2=DayOfWeek.values();
		arr2=getWeekendDays();
		
		printDay(arr2[0]);
		printDay(arr2[1]);
		
		
	}

}
