
public class SalmonFinalList {
	
	private SalmonFish[] thelist = new SalmonFish[5];
	private int i = 0;
	
	public void add(SalmonFish s){
		if(i<thelist.length){
			thelist[i]=s;
			System.out.println("Salmon added at index "+i);
			i++;
		}
	}
}
