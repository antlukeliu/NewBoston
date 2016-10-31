
public enum Enum2 {
	Ed("weird", "25"),
	Jen("strange", "22"),
	Bora("nice", "27"),
	Rick("Indian", "10"),
	Kevin("Funny", "15");
	
	
	private final String desc;
	private final String year;
	
	
	//The argument cannot the same as desc so desc = desc is not possible
	Enum2(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}
}
