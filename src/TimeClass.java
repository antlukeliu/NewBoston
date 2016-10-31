
public class TimeClass {
	public static void main(String[] args) {
		TimeClass2 time = new TimeClass2();
		
		time.setTime(13, 42, 8);
		
		System.out.println(time.toMilitary());
		System.out.println(time.toString());
	}
}
