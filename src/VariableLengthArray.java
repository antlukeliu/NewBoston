
public class VariableLengthArray {
	public static void main(String[] args) {
		System.out.println(average(1,2,3,4,5,6,7,8));
	}
	
	//... allows you to not set an exact length for arrays
	public static float average(int...numbers){
		float total=0;
		for(int x:numbers)
			total +=x;
		return total/numbers.length;
	}
}
