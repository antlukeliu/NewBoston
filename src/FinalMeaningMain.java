//48
public class FinalMeaningMain {

	public static void main(String[] args) {
		
		FinalMeaning mean = new FinalMeaning(10);
		
		for(int i = 0; i<5; i++){
			mean.add();
			System.out.printf("%s", mean);
		}

	}

}
