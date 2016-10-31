//48
public class FinalMeaning {
	private int sum;
	private final int NUMBER;
	
	public FinalMeaning(int x){
		NUMBER = x;
	}
	
	public void add(){
		sum += NUMBER;
	}
	
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
}
