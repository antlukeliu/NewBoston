
public class toString2 {
	private String name;
	private toString birthday;
	
	public toString2(String nm, toString date){
		name = nm;
		birthday = date;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
