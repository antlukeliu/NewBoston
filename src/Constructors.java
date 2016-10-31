//Lesson 41 Attach to AConst


public class Constructors {

	public static void main(String[] args) {
		
		AConst time = new AConst();
		AConst time2 = new AConst(5);
		AConst time3 = new AConst(5,13);
		AConst time4 = new AConst(5,13,43);
		
		System.out.printf("%s\n", time.toMilitary());
		System.out.printf("%s\n", time2.toMilitary());
		System.out.printf("%s\n", time3.toMilitary());
		System.out.printf("%s\n", time4.toMilitary());
		
	}

}
