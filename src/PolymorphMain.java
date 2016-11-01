
public class PolymorphMain {

	public static void main(String[] args) {
		
		PolymorphElite var = new PolymorphElite();
		PolymorphSuper food = new PolymorphSuper();
		PolymorphSuper food2 = new PolymorphSub1();
		
		var.digest(food);
		var.digest(food2);
	}

}
