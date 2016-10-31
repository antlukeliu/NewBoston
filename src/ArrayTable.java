
public class ArrayTable {
	public static void main(String[] args) {
		System.out.println("Index\tValue");
		int array[] = {1,2,3,4,5};
		
		for(int counter=0; counter<array.length;counter++){
			System.out.println(counter + "\t" +array[counter]);
		}
	}
}
