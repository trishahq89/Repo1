package FirstPackage;

public class area {

	public static void main(String[] args) {
		area abc = new area();
		abc.rectArea("Length times ", "Width");

	}
	
	public void rectArea(String x, String y) {
		String a = "What is the formula for area of a rectangle?";
		
		System.out.println(a + "\n" + x + y);
	}

}
