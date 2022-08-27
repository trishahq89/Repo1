package FirstPackage;

public class sides {

	public static void main(String[] args) {
		sides area = new sides();
		area.sidesOfRectange(7.8, 5.6);

	}

	
	public void sidesOfRectange(double a, double b) {
		double z = 2*(a + b);
		
		System.out.println(z);
		
	}
}
