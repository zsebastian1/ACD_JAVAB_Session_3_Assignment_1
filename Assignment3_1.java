package ACADAssignments;

public class Assignment3_1 {

	
	static {
		int a = 3;
		System.out.println("This will execute before the instance variables.");
		System.out.println("Even " + a + " will print before x, y, and z");
	}
	
	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int z = 15;
		
		System.out.println("These values will print after the class variables");
		System.out.println(" For exmaple: " + x + " " + y + " and " + z);
		
		
	}

}
