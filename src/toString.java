
public class toString {
	private int month;
	private int day;
	private int year;

	public toString(int M, int d, int y){
		month = M;
		day = d;
		year = y;
		
		System.out.printf("The constructor for it is %s\n", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
