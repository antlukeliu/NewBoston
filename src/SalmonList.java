
public class SalmonList {
	private SalmonA[] thelist = new SalmonA[5];
	private int i=0;
	
	public void add(SalmonA s){
		if(i<thelist.length){
			thelist[i] = s;
			System.out.println("Salmon added at index " + i);
			i++;
		}
	}
}
