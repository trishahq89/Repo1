package FirstPackage;

public class perimeter {

	public static void main(String[] args) {
		perimeter rect = new perimeter();
		rect.perimeterOfRectange(70, 40);

	}
	public void perimeterOfRectange(int length, int width) {
		
		int c = length + length + width  + width;
		
	    System.out.print(c);
	}

}
