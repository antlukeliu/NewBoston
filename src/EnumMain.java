//Enum.range
import java.util.EnumSet;

public class EnumMain {
	public static void main(String[] args) {
		for(Enum2 people: Enum2.values()){
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
	
	System.out.println("\nAnd now for the rand of constants!!!\n");
	
	for (Enum2 people: EnumSet.range(Enum2.Ed, Enum2.Rick)){
		System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	}
	}
}
